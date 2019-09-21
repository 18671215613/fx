<!DOCTYPE html>
<head xmlns="http://www.w3.org/1999/html">
    <meta charset="utf-8">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-title" content="">
    <meta name="format-detection" content="telephone=no">
    <title>心理测试_心理测试题_答案_大全-壹心理</title>
    <meta name="keywords" content="心理测试,心理测试题及答案,心理测试题,心理测试大全">
    <meta name="description" content="壹心理心理测试频道，这里有爱情测试、性格测试、能力测试、会员测试、精选测试、专业测评，包含了心理测试题及答案。">

    <link rel="stylesheet" href="http://lapp.xinli001.com/css/index.min.css">
    <script src="http://lapp.xinli001.com/jsmin/jquery-1.11.2.min.js"></script>
    <script src="http://lapp.xinli001.com/jsmin/common.min.js"></script>
    <script src="http://lapp.xinli001.com/jsmin/website-addons.min.js"></script>
    <script>var headerAuthUserUrl = "http://www.xinli001.com/ajax/header-auth-user-div.json";</script>

</head>
<body>
<#include "include/header.ftl">
<div class="infos-wrap">
    <div class="fish-left main-left">
        <div class="focus">
            <h2>发现未知的自己 ：</h2>
            <div class="focus_box">
                <div class="focus_show" id="rolls_imgs">
                    <div id="rolls">
                        <#list tSuiteList as tSuite>
                            <div class="roll_box">
                                <dl>
                                    <dt>
                                        <p class="pbox">
                                            <a href="/api/details/details?suiteCode=${tSuite.suiteCode}">
                                                <img src="${tSuite.picture}" width="200" height="134" hover="true"
                                                     alt="${tSuite.title}">
                                            </a>
                                        </p>
                                        <p class="pinfo">
                                            <a href="/api/details/details?suiteCode=${tSuite.suiteCode}"
                                               class="t">${tSuite.title}</a><br>
                                            <span class="fgrey">测试人数：</span>${tSuite.testnum}人<br>
                                            <span class="fgrey">评论：</span>${tSuite.replyNum}条<br>
                                            <a href="/api/details/details?suiteCode=${tSuite.suiteCode}"
                                               class="start">开始测试</a>
                                        </p>

                                    </dt>
                                    <dd>${tSuite.description}<a
                                                href="/api/details/details?suiteCode=${tSuite.suiteCode}">[详细]</a>
                                    </dd>
                                </dl>
                            </div>
                        </#list>
                        <!--part-->
                    </div>
                </div>
                <!--滚动集-->
                <div id="roll_sels">
                    <#list tSuiteList as tSuite>
                        <ul>
                            <li class="act ">
                                <p class="pbox">
                                    <a href="/api/details/details?suiteCode=${tSuite.suiteCode}" hover=" true">
                                        <img src="${tSuite.picture}"
                                             width="60" height="40" alt="${tSuite.title}">
                                    </a></p>
                                <p class="pinfo">
                                    <a href="/api/details/details?suiteCode=${tSuite.suiteCode}"
                                       title="${tSuite.title}">${tSuite.title}</a>
                                    <br>测试人数：${tSuite.testnum}人</p>
                                <br class="clear">
                                <span class="arrow"></span>
                            </li>
                        </ul>
                    </#list>
                </div>
            </div>
        </div>

        <#list tModuleList as tModule>
            <div class="category">
                <h2 class="title"><a href="/api/list/start?moduleCode=${tModule.moduleCode}">${tModule.moduleName}</a></h2>
                <div class="lists">
                    <div class="parts">
                        <dl>
                            <#list tSuiteAllMap[tModule.moduleCode] as tSuite>
                                <#if tSuite_index%2==0>
                                    <#if tSuite_index==0>
                                        <dt>
                                            <p class="pbox">
                                                <a href="/api/details/details?suiteCode=${tSuite.suiteCode}">
                                                    <img class="lazyload" src="${tSuite.picture}"
                                                         width="120" height="80" alt="${tSuite.title}" hover="true"/>
                                                </a></p>
                                            <p class="cinfo">
                                                <a href="/api/details/details?suiteCode=${tSuite.suiteCode}"
                                                   title="${tSuite.title}">${tSuite.title}</a><br>
                                                ${tSuite.description} <span class="testers">${tSuite.testnum}人测试</span>
                                            </p>
                                        </dt>
                                    </#if>
                                    <#if tSuite_index gt 0>
                                        <dd>
                                            <span class="fcn">·</span>
                                            <a href="/api/details/details?suiteCode=${tSuite.suiteCode}"
                                               title="${tSuite.title}">${tSuite.title}</a>
                                            <span class="testers">${tSuite.testnum}人测试</span>
                                        </dd>
                                    </#if>
                                </#if>
                            </#list>
                        </dl>
                    </div>
                    <div class="parts">
                        <dl>
                            <#list tSuiteAllMap[tModule.moduleCode] as tSuite>
                                <#if tSuite_index%2==1>
                                    <#if tSuite_index==1>
                                        <dt>
                                            <p class="pbox">
                                                <a href="/api/details/details?suiteCode=${tSuite.suiteCode}">
                                                    <img class="lazyload" src="${tSuite.picture}"
                                                         width="120" height="80" alt="${tSuite.title}" hover="true"/>
                                                </a></p>
                                            <p class="cinfo">
                                                <a href="/api/details/details?suiteCode=${tSuite.suiteCode}"
                                                   title="${tSuite.title}">${tSuite.title}</a><br>
                                                ${tSuite.description} <span class="testers">${tSuite.testnum}人测试</span>
                                            </p>
                                        </dt>
                                    </#if>
                                    <#if tSuite_index gt 1>
                                        <dd>
                                            <span class="fcn">·</span>
                                            <a href="/api/details/details?suiteCode=${tSuite.suiteCode}"
                                               title="${tSuite.title}">${tSuite.title}</a>
                                            <span class="testers">${tSuite.testnum}人测试</span>
                                        </dd>
                                    </#if>
                                </#if>
                            </#list>
                        </dl>
                    </div>
                </div>
            </div>
        </#list>
    </div>
    <!--left-->
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
                        <!--<label for="email">邮箱</label>-->
                        <input type="text" id="lp_username" name="username" class="area">
                    </p>
                    <p class="psw">
                        <!--<label for="password">密码</label>-->
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
<style>
    .footer .links {
        text-align: center;
        padding: 15px 30px;
        line-height: 22px;
    }

    .footer .links dt {
        color: #999999;
        display: inline;
        margin: 0 10px;
        font-weight: normal;
        font-size: 12px;
    }

    .footer a {
        color: #999;
    }
</style>

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
</body>
</html>