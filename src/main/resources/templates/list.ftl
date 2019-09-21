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
    <title>${tModule.moduleName}_题_答案_大全-壹心理</title>
    <meta name="keywords"
          content="${tModule.moduleName},${tModule.moduleName}题及答案,${tModule.moduleName}题,${tModule.moduleName}大全">
    <meta name="description" content="壹心理${tModule.moduleName}，提供专业的${tModule.moduleName}题及答案，帮助你了解自己。">

    <link rel="stylesheet" href="//lapp.xinli001.com/css/index.min.css">
    <meta charset="utf-8">
    <base target="_self">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, maximum-scale=1, initial-scale=1, user-scalable=yes">
    <title>${tModule.moduleName}_题_答案_大全-壹心理</title>
    <meta name="keywords"
          content="${tModule.moduleName},${tModule.moduleName}题及答案,${tModule.moduleName}题,${tModule.moduleName}大全">
    <meta name="description" content="壹心理${tModule.moduleName}，提供专业的${tModule.moduleName}题及答案，帮助你了解自己。">
    <meta property="qc:admins" content="21604337436016410016375"/>
    <link rel="shortcut icon" type="image/x-icon" href="//static.xinli001.com/favicon.ico">
    <!--<script src="//lapp.xinli001.com/jsmin/jquery-1.11.2.min.js"></script>-->

    <!-- 上一次最新-->
    <link rel="stylesheet" href="//lapp.xinli001.com/css/sweetalert.css">
    <link rel="stylesheet" href="//lapp.xinli001.com/css/website/jq.activePhone.css">
    <link rel="stylesheet" href="//lapp.xinli001.com/iconfont/iconfont.css">
    <link rel="stylesheet" href="//lapp.xinli001.com/dist/zixun_website.build_15002b1683.css">
    <script>
        var headerAuthUserUrl = "https://www.xinli001.com/ajax/header-auth-user-div.json";
    </script>
    <script src="//lapp.xinli001.com/dist/website_04bf8ccdc0.js"></script>
    <!--html5shiv让ie678支持html5，respond_min让ie支持css3 query-->
    <!--[if lt IE 9 ]>
    <script src="//lapp.xinli001.com/jsmin/html5shiv.min.js"></script>
    <script src="//lapp.xinli001.com/jsmin/respond.min.js"></script>    <![endif]-->
    <script src="//lapp.xinli001.com/js/website/nprogress.js"></script>
    <script src="//lapp.xinli001.com/js/website/message.min.js"></script>
    <script type="text/javascript" charset="utf-8" src="//g.alicdn.com/sd/ncpc/nc.js?t=1561544901"></script>
    <!--<script src="//static.geetest.com/static/tools/gt.js"></script>-->
    <script>
    </script>
    <link rel="stylesheet" href="//static.xinli001.com/yixinliPC/commons/style_5f3e8a74.css"/>
    <link rel="stylesheet" href="//static.xinli001.com/yixinliPC/nav/detail/style_c5000418.css"/>
    <script src="//lapp.xinli001.com/jsmin/common.min.js"></script>
    <script src="//lapp.xinli001.com/jsmin/website-addons.min.js"></script>
    <script src="//lapp.xinli001.com/js/zhuge.sdk.js"></script>
    <script>
        var headerAuthUserUrl = "//www.xinli001.com/ajax/header-auth-user-div.json";
        //设置cooperation cookie
        $(function () {
            setCooperationCookie();
        });

        function getCookie(name) {
            var arr, reg = new RegExp("(^| )" + name + "=([^;]*)(;|$)");
            if (arr = document.cookie.match(reg))
                return unescape(arr[2]);
            else
                return null;
        }

        function setCooperationCookie() {
            //cookie不存在或channel值不相等都要重新设置cookie
            var channel_name = '';
            var channel_id = '';
            var urldomain = '.xinli001.com';
            var cooperation = getCookie('cooperation');
            var setcookie = false;
            if (cooperation) {
                var cookiedata = JSON.parse(cooperation);
                var old_channel_id = cookiedata.channel_id;
                if (channel_id && old_channel_id != channel_id) {
                    setcookie = true;
                } else {
                    setcookie = false;
                }
            } else {
                setcookie = true;
            }
            if (setcookie == true) {
                var url = encodeURI(window.location.href);
                var cookievalue = {"channel_id": channel_id, "url": url};
                var cookiestr = JSON.stringify(cookievalue);
                //渠道名
                if (channel_id) {
                    var domain = "domain=" + urldomain;
                    document.cookie = "cooperation=" + cookiestr + ";path=/;" + domain;
                    zhuge.track('测评_PC渠道_访问次数', {'channel_id': channel_id, 'channel_name': channel_name});
                }
            }
        }
    </script>
    <script>
        $(function () {
            $.get(headerAuthUserUrl, function (resp) {
                $('#header-auth-user-div').html(resp);
            });
        });
    </script>


</head>
<body>
<!-- 导航条内容 -->
<#include "include/header.ftl">
<script>
    $(function () {
        $('.search .search_a').on('click', function () {
            $(this).parent().submit();
        })
    })
</script>
<!-- header end -->
<div class="infos-wrap" style="clear:both;overflow: hidden;">
    <div class="fish-left main-left">
        <div class="list_rmd">
            <div class="title bor_bot">${tModule.moduleName}人气推荐</div>
            <div class="lists bor_top fixed">
                <ul>
                    <#list tSuiteList as tSuite>
                        <li class="fl payTest">
                            <a href="/api/details/details?suiteCode=${tSuite.suiteCode}">
                                <img src="${tSuite.picture}" width="180" height="120" hover="true"
                                     alt="${tSuite.title}">
                                <p>${tSuite.title}</p>
                            </a>
                        </li>
                    </#list>
                </ul>
            </div>
        </div>
        <!--推荐-->
        <h2 class="list_title">${tModule.moduleName}：</h2>
        <div class="list_show">
            <dl>
                <#list tSuiteListLimit.pageData as tSuite>
                    <dd class="fixed">
                        <p class="pbox fl">
                            <a href="/api/details/details?suiteCode=${tSuite.suiteCode}">
                                <img class="lazyload"
                                     src="${tSuite.picture}"
                                     width="120" height="80" alt="${tSuite.title}" hover="true"/>
                            </a></p>
                        <p class="linfo fl">
                            <a href="/api/details/details?suiteCode=${tSuite.suiteCode}">${tSuite.title}</a><br/>
                            ${tSuite.description}
                            <span class="total">
                                <span class="icons" title="测试人数"></span>
                                    ${tSuite.testnum}人测试过
                            </span>
                        </p>
                    </dd>
                </#list>
            </dl>
        </div>
        <!--列表-->
        <div class="pagebar" id="pages">
<#--            <#list tSuiteListLimit as tSuite>
                <a href="list?tModule.module_code=${tModule.moduleCode}&pageInfo.page=${tSuite?size}&pageInfo.rows=10"
                   target="_self"
                   style="<#if tSuiteListLimit.page==tSuite?size>color:#88bd58</#if>">${tSuite?size}</a> |
            </#list>-->
            <a href="?moduleCode=${tModule.moduleCode}&page=1&rows=10"
                    <#--class="last"--> target="_self">首页</a>
            <a href="?moduleCode=${tModule.moduleCode}&page=${tSuiteListLimit.prePage}&rows=10"
               <#--class="last"--> target="_self">上一页</a>
            <a href="?moduleCode=${tModule.moduleCode}&page=${tSuiteListLimit.nextPage}&rows=10"
               <#--class="next"--> target="_self">下一页</a>
            <a href="?moduleCode=${tModule.moduleCode}&page=${tSuiteListLimit.pageCount}&rows=10"
                    <#--class="last"--> target="_self">末页</a>
        </div>
    </div>
    <!--left-->
    <#include "include/right.ftl">
    <!--right-->
</div>

<#--include动态引用-->
<#include "include/footer.ftl">
<script>
    var _bdhmProtocol = (("https:" == document.location.protocol) ? " https://" : " http://");
    //document.write(unescape("%3Cscript src='" + _bdhmProtocol + "hm.baidu.com/h.js%3Fd64469e9d7bdbf03af6f074dffe7f9b5' type='text/javascript'%3E%3C/script%3E"));
    var _bdurl = unescape("%3Cscript src='" + _bdhmProtocol + "hm.baidu.com/h.js%3Fd64469e9d7bdbf03af6f074dffe7f9b5' type='text/javascript'%3E%3C/script%3E");
    document.write(_bdurl);
</script>

<script type="text/javascript" src="//static.xinli001.com/yixinliPC/commons/runtime.070f7bfe81110f917b70.js"></script>


<script type="text/javascript" src="//static.xinli001.com/yixinliPC/dll/dll_e160e61f7f277febfad5.js"></script>


<script type="text/javascript" src="//static.xinli001.com/yixinliPC/commons/bundle_d548eb4f8b252b8b6219.js"></script>


<script type="text/javascript" src="//static.xinli001.com/yixinliPC/nav/detail/index_2216b1671ced4bb10ec4.js"></script>





