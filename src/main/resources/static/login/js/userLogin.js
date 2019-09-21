function userLogin() {
    var userName = $("#u").val();
    var userPassword = $("#p").val();
    if (userName == null || userName == undefined || userName == '') {
        alert("账号不能为空！")
    } else if (userPassword == null || userPassword == undefined || userPassword == '') {
        alert("密码不能为空！")
    } else {
        $.ajax({
            url: "userLogin",
            data: {"userName": userName, "userPassword": userPassword},
            type: "POST",
            dataType: "json",
            success: function (data) {
                if (data.code != 1003) {
                    alert(data.msg)
                } else {
                    window.location.href="index";
                }
            },
            error: function () {
                console.error("请求错误");
            }
        })

    }
}