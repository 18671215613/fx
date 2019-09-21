function nextQuestion(obj) {
    $(obj).css("color", "red");
    var suiteCode = $(obj).attr("suiteCode");
    var nextQuestionCode = $(obj).attr("nextQuestionCode");
    var questionCode = $(obj).attr("questionCode");
    var optionCode = $(obj).attr("optionCode");
    var score = $(obj).attr("score");
    $.ajax({
        "url": "nextQuestion",
        "data": {
            "suiteCode": suiteCode,
            "nextQuestionCode": nextQuestionCode,
            "questionCode": questionCode,
            "optionCode": optionCode,
            "score": score
        },
        "type": "GET",
        "dataType": "json",
        "success": function (data) {
            tQuestion(data.tQuestion);
            if (data.tOptionList !== null) {
                tOptionList(data.tOptionList, suiteCode);
            }
        },
        "error": function () {
            console.error("请求出错了！")
        }
    })
}

function tQuestion(tQuestion) {
    if (tQuestion == null) {
        $("#id_show_result").show();
    } else {
        if (tQuestion.orderNo == 1) {
            $("#id_pre_link").hide();
        } else {
            $("#id_pre_link").show();
        }
        $("#id_show_result").hide();
        var questionTitle = tQuestion.orderNo + ". " + tQuestion.title;
        $("#id_cur_index").html(tQuestion.orderNo);
        $("#questionTitle").html(questionTitle);
    }

}

function tOptionList(tOptions, suiteCode) {
    $("#options").html("");
    for (var i = 0; i < tOptions.length; i++) {
        var tOption = tOptions[i];
        var title = tOption.title;
        var optionHtml = "";
        optionHtml = optionHtml + "<div class='items'>";
        optionHtml = optionHtml + "<p class='i_top'></p>";
        optionHtml = optionHtml + "<p class='i_mid' onclick=\"nextQuestion(this)\" nextQuestionCode=\"" + tOption.nextQuestionCode + "\" suiteCode=\"" + suiteCode + "\" questionCode=\"" + tOption.questionCode + "\"\n" +
            "optionCode=\"" + tOption.optionCode + "\" score=\"" + tOption.score + "\">";
        optionHtml = optionHtml + "<span class='sels'><input type='radio' name='question-1'/></span>" + title + "";
        optionHtml = optionHtml + "</p>";
        optionHtml = optionHtml + "<p class='i_bot'></p>";
        optionHtml = optionHtml + "</div>";
        $("#options").append(optionHtml);
    }
}

function prevQuestion() {
    $.ajax({
        "url": "prevQuestion",
        "type": "GET",
        "dataType": "json",
        "success": function (data) {
            tQuestion(data.tQuestion);
            tOptionList(data.tOptionList, data.tQuestion.suiteCode);
        },
        "error": function () {
            console.error("请求出错了！")
        }
    })
}

$(function () {
    $("#id_show_result").click(function () {

        $.ajax({
            "url": "submitTOptions",
            "type": "GET",
            "success": function () {
                var suiteCode = $("#tSuiteTitle").attr("suiteCode");
                var tSuiteTitle = $("#tSuiteTitle").text();
                window.location.href = "results?suiteCode=" + suiteCode + "&title=" + tSuiteTitle;
            },
            "error": function () {
                console.error("请求出错了！")
            }
        })
    })
})