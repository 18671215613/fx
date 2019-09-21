$(function () {
    var suiteCode = $("#suiteCode").val();
    $.ajax({
        "url": "resultEcharts",
        "data": {"suiteCode": suiteCode},
        "type": "GET",
        "dataType": "json",
        "success": function (data) {
            showEcharts(data)
        },
        "error": function () {
            console.log("请求出错")
        }
    })

    function showEcharts(data) {
        // 基于准备好的dom，初始化echarts实例
        var myChart = echarts.init(document.getElementById('main'));
        // 指定图表的配置项和数据
        var option = {
            title: {
                text: '某站点用户访问来源',
                subtext: '纯属虚构',
                x: 'center'
            },
            tooltip: {
                trigger: 'item',
                formatter: "{a} <br/>{b} : {c} ({d}%)"
            },
            legend: {
                orient: 'vertical',
                left: 'left',
                data: data.legendData,
            },
            series: [
                {
                    name: '访问来源',
                    type: 'pie',
                    radius: '55%',
                    center: ['50%', '60%'],
                    data: data.seriesData,
                    itemStyle: {
                        emphasis: {
                            shadowBlur: 10,
                            shadowOffsetX: 0,
                            shadowColor: 'rgba(0, 0, 0, 0.5)'
                        }
                    }
                }
            ]
        };
        // 使用刚指定的配置项和数据显示图表。
        myChart.setOption(option);
    }

    $("#id_comment_submit").click(function () {
        var content = $("#id_comment_content").val();
        var resultCode = $("#id_comment_content").attr("resultCode");
        $.ajax({
            "url": "tReply",
            "data": {"content": content, "resultCode": resultCode},
            "type": "GET",
            "success": function (data) {
                alert(data)
                showReply(1);
                $("#comments_list").html("");
                $("#id_comment_content").val("");
            },
            "error": function () {
                console.error("请求出错！")
            }
        })
    })
    showReply(1);
    $("#moreComments").click(function () {
        var nextPage=$(this).attr("nextPage");
        showReply(nextPage);
    })
    function showReply(page) {
        var rows="";
        $.ajax({
            "url": "tReplys",
            "data": {"suiteCode": suiteCode, "page": page, "rows": rows},
            "type": "GET",
            "dataType": "json",
            "success": function (data) {
                var replys=data.pageData;
                for (var i=0;i<replys.length;i++){
                    var reply=replys[i];
                    var template=$("#replyTemplate").html();
                    var com=template.replace("[ipAddress]",reply.ipAddress).replace("[createTime]",reply.createTime).replace("[content]",reply.content);
                    $("#comments_list").append(com);
                }
                if (data.page<data.pageCount){
                    $("#moreComments").attr("nextPage",data.nextPage);
                    $("#moreComments").parent().show();
                } else {
                    $("#moreComments").parent().hide();
                }
            },
            "error": function () {
                console.error("请求出错！")
            }
        })
    }
})

