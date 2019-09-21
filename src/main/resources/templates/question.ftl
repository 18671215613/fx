<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-title" content="">
    <meta name="format-detection" content="telephone=no">
    <title>单身汪专属：测测你保持单身的小心思 - 壹心理</title>
    <meta name="keywords" content="单身汪专属：测测你保持单身的小心思">
    <meta name="description" content=":content">

    <link rel="stylesheet" href="http://lapp.xinli001.com/css/index.min.css">
    <script src="http://lapp.xinli001.com/jsmin/jquery-1.11.2.min.js"></script>
    <script src="http://lapp.xinli001.com/jsmin/common.min.js"></script>
    <script src="http://lapp.xinli001.com/jsmin/website-addons.min.js"></script>
    <script>var headerAuthUserUrl = "http://www.xinli001.com/ajax/header-auth-user-div.json";</script>

    <script type="text/javascript" src="/static/js/question.js"></script>

</head>
<body>
<!-- nav end -->
<#include "include/header.ftl">
<!-- header end -->

<div class="infos-wrap">

    <div class="fish-left main-left">
        <div class="mbox tshow_index">
            <div class="title bor_bot fixed">
                <p class="items fl" title="心理测试"></p>
                <div class="tinfo fl">
                    <h2 id="tSuiteTitle" suiteCode="${tSuite.suiteCode}">${tSuite.title}</h2>
                    <span class="icons" title="测试人数"></span>${tSuite.testnum}人测试过 &nbsp;
                    <span class="icons fav" title="收藏次数"></span>${tSuite.favnum}次收藏 &nbsp;
                    <span class="icons tdates" title="发布时间"></span>${tSuite.createTime}&nbsp;
                    <span class="icons comments" title="评论数"></span> ${tSuite.replyNum}条评论

                </div>
            </div>
            <div class="ctest bor_top">当前第 <span class="fgreen fb" id="id_cur_index">${tQuestion.orderNo}</span> &nbsp;题
                <span class="total">本测试共 <span class="fgreen fb">${tSuite.questionNum}</span> &nbsp;题</span>
            </div>
        </div>
        <!--测试内容头部-->

        <form id='id_form' action="http://www.xinli001.com/ceshi/41365306/start" method="post" onsubmit="return false">
            <div class="test_contents" style="display: block">
                <p class="descs fb">
                    <span id="questionTitle">${tQuestion.orderNo}. ${tQuestion.title}</span>
                </p>
                <div class="sels_list" id="options">
                    <!--单选测试-->
                    <#list tOptionList as tOption>
                        <div class="items">
                            <p class="i_top"></p>
                            <p class="i_mid" id="i_mid" onclick="nextQuestion(this)"
                               nextQuestionCode="${tOption.nextQuestionCode}"
                               suiteCode="${tSuite.suiteCode}" questionCode="${tOption.questionCode}"
                               optionCode="${tOption.optionCode}" score="${tOption.score}">
                                <span class="sels"><input type="radio" name="question-1" value="19925918"/></span>
                                ${tOption.title}
                            </p>
                            <p class="i_bot"></p>
                        </div>
                    </#list>
                </div>
            </div>
            <p class="tbtns">
                <a id="id_pre_link" style="display: none" href="javascript:void(0)" class="test_btn"
                   onclick="prevQuestion()">上一题</a>
                <input id="id_show_result" style="display: none" type="submit" class="btns" value="提 交"/>
            </p>
        </form>
        <!--测试内容-->
    </div>
    <!--left-->

    <script src="http://lapp.xinli001.com/ceshi/js/show.js"></script>

    <#include "include/right.ftl">
    <!--right-->
</div>

<#include "include/footer.ftl">

<div style="display: none">
    <div id="login_popup" class="lpcont">
        <h2>登录壹心理</h2>
        <p class="words">开始心理测试，收听FM，用心理学改变自己！</p>
        <div class="lpbox">
            <div class="lpart">
                <form id="lp_form" action="login-jsonp/" method="post">
                    <p class="eml">
                        <label for="email">邮箱</label>
                        <input type="text" id="lp_username" name="username" class="area">
                    </p>
                    <p class="psw">
                        <label for="password">密码</label>
                        <input type="password" id="lp_password" name="password" class="area">
                    </p>
                    <input id="lp_submit" type="submit" class="log_btn" value="登 录">
                    <br>
                    <a href="forgetpwd/" class="forget" target="_blank">忘记密码</a>
                    <a href="register/" class="signup" target="_blank">没有账号，去注册＞</a>
                </form>
            </div>
            <div class="rpart">
                <span>使用其它账号登录</span>
                <a href="qwb/login/" class="qq" target="_blank">使用腾讯账号登录</a>
                <a href="xwb/login/" class="wb" target="_blank">使用微博账号登录</a>
                <a href="renren/login/" class="rr" target="_blank">使用人人账号登录</a>
            </div>
            <br style="clear:both">
        </div>
    </div>
</div>

<div id="background"></div>

<script>
    var userinfoUrl = 'http://www.xinli001.com/userinfo/';
</script>

<script src="http://lapp.xinli001.com/jsmin/index.min.js"></script>

<script>
    $(function () {
        setFocusSlid('#roll_sels', '#rolls_imgs', 229);
        $.get(headerAuthUserUrl, function (resp) {
            $('#header-auth-user-div').html(resp);
        });
    });
</script>


<script>
    var _bdhmProtocol = (("https:" == document.location.protocol) ? " https://" : " http://");
    //document.write(unescape("%3Cscript src='" + _bdhmProtocol + "hm.baidu.com/h.js%3Fd64469e9d7bdbf03af6f074dffe7f9b5' type='text/javascript'%3E%3C/script%3E"));
    var _bdurl = unescape("%3Cscript src='" + _bdhmProtocol + "hm.baidu.com/h.js%3Fd64469e9d7bdbf03af6f074dffe7f9b5' type='text/javascript'%3E%3C/script%3E");
    //var _lzurl = '<script src="http://js.tongji.linezing.com/2646296/tongji.js"><\/script>';
    //document.write(_lzurl);
    document.write(_bdurl);
</script>
<script>
    (function (i, s, o, g, r, a, m) {
        i['GoogleAnalyticsObject'] = r;
        i[r] = i[r] || function () {
            (i[r].q = i[r].q || []).push(arguments)
        }, i[r].l = 1 * new Date();
        a = s.createElement(o),
            m = s.getElementsByTagName(o)[0];
        a.async = 1;
        a.src = g;
        m.parentNode.insertBefore(a, m)
    })(window, document, 'script', '//www.google-analytics.com/analytics.js', 'ga');

    ga('create', 'UA-74218902-1', 'auto');
    ga('send', 'pageview');
</script>

</html>