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
    <title></title>
    <meta name="keywords" content="">
    <meta name="description" content="">

    <link rel="stylesheet" href="http://lapp.xinli001.com/css/index.min.css">
    <script src="http://lapp.xinli001.com/jsmin/jquery-1.11.2.min.js"></script>
    <script src="http://lapp.xinli001.com/jsmin/common.min.js"></script>
    <script src="http://lapp.xinli001.com/jsmin/website-addons.min.js"></script>
    <script>var headerAuthUserUrl = "http://www.xinli001.com/ajax/header-auth-user-div.json";</script>
    <script type="text/javascript" src="/static/script/echarts.common.min.js"></script>
    <script type="text/javascript" src="/static/js/results.js"></script>
</head>
<body>

<!-- nav end -->
<#include "include/header.ftl">
<!-- header end -->

<link rel="stylesheet" href="http://lapp.xinli001.com/pysite/ceshi/result.css">
<style>
    .infos-wrap .main-left .qcShareQQDiv {
        position: inherit;
        margin-left: 100px;
        margin-top: -38px;
        display: block;
    }

    .infos-wrap .main-left .btn {
        text-align: center;
        margin-top: 20px;
    }

    .infos-wrap .main-left .btn a {
        color: #FFFFFF;
        font-size: 14px;
        padding: 10px 50px;
        background: #88BD58;
        border-radius: 3px;
        margin-right: 30px;
        text-decoration: none;
    }
</style>

<div class="infos-wrap">

    <div class="fish-left main-left">
        <div class="mbox tshow_index tshow_result">
            <div class="tshow">
                <div class="title" style="position: relative">
                    <a href="http://www.xinli001.com/ceshi/41365306"><span>${title}</span></a>
                    <iframe src="http://open.qzone.qq.com/like?url=http%3A%2F%2Fuser.qzone.qq.com%2F2528644034&type=button_num&width=400&height=30&style=2"
                            allowtransparency="true" scrolling="no" border="0" frameborder="0"
                            style="width:110px;height:30px;border:none;overflow:hidden;position: absolute;left: 350px"></iframe>
                    <wb:follow-button uid="1894475142" type="gray_2" width="136" height="24"
                                      style="position: absolute;left: 470px"></wb:follow-button>
                </div>
                <div class="t_result">
                    <input type="hidden" id="suiteCode" value="${tResult.suiteCode}">
                    <span class="rs">我的结果 : ${tResult.title}</span>
                    <span class="desc">${tResult.description}<br/><br/>
※听说关注壹心理测试的微信/QQ公众号（xinlics），桃花运会变好哦！※</span>
                    <div class="btn">
                        <a id="invitea" href="#invite" class="invite">邀请好友测试</a>
                        <a href="http://app.xinli001.com/mobile/#xinliceshi" class="download"
                           target="_blank">下载心理测试客户端</a>
                    </div>
                </div>
                <div class="heart_rmd fixed">
                    <span class="fb">心灵处方 ：</span>
                    <ul>
                        <li>
                            <span class="fcn">·</span>
                            <a href="http://www.xinli001.com/info/100348893">心理杂志：婚姻让你的朋友圈变小了吗？</a>
                            </a>
                        </li>
                        <li>
                            <span class="fcn">·</span>
                            <a href="http://www.xinli001.com/info/100348860">心理杂志：球迷心理学：我们为什么这么喜欢看足球比赛？</a>
                            </a>
                        </li>
                        <li>
                            <span class="fcn">·</span>
                            <a href="http://fm.xinli001.com/99389321">心理FM：让人欲罢不能的同学情，是怎样的？</a>
                            </a>
                        </li>
                        <li>
                            <span class="fcn">·</span>
                            <a href="http://fm.xinli001.com/99389303">心理FM：学会放下</a>
                            </a>
                        </li>
                    </ul>
                </div>
                <div class="all_result">
                    <span class="fb">全部测试结果 ：</span>
                    <p>
                    <div style="width: 600px;height: 450px;" id="main"></div>
                    </p>
                </div>
                <div class="shares nshares">
                    <span class="icons fav"></span>
                    <a href="http://www.xinli001.com/ceshi/41365306/favorite" class="add_fav"
                       onclick="return favorite(this)">喜欢？！收藏</a>
                    <div class="bdsharebuttonbox sbar">
                        <a href="#" class="bds_weixin" data-cmd="weixin" title="分享到微信"></a>
                        <a href="#" class="bds_qzone" data-cmd="qzone" title="分享到QQ空间"></a>
                        <a href="#" class="bds_sqq" data-cmd="sqq" title="分享到QQ好友"></a>
                        <a href="#" class="bds_tsina" data-cmd="tsina" title="分享到新浪微博"></a>
                        <a href="#" class="bds_douban" data-cmd="douban" title="分享到豆瓣网"></a>
                        <a class="bds_count" data-cmd="count"></a>
                        <a href="#" class="bds_more" data-cmd="more"></a>
                    </div>
                    <script>
                        window._bd_share_config = {
                            "common": {
                                "bdSnsKey": {},
                                "bdText": "",
                                "bdMini": "1",
                                "bdMiniList": false,
                                "bdPic": "",
                                "bdStyle": "0",
                                "bdSize": "24"
                            },
                            "share": {}
                        };
                        with (document)
                            0[(getElementsByTagName('head')[0] || body).appendChild(createElement('script')).src = 'http://bdimg.share.baidu.com/static/api/js/share.js?v=89343201.js?cdnversion=' + ~(-new Date() / 36e5)];
                    </script>
                </div>
            </div>
            <!--分享-->
            <div class="test_expert">
                <div class="head">测试相关专家</div>
                <ul>
                    <li>
                        <div class="img">
                            <a href="/user/3446509"><img src="http://image.xinli001.com/20150424/170543/817385.png"
                                                         id="btn-user-home"/></a>
                        </div>
                        <div class="text">
                            <h4>陈燕</h4>
                            <p>国家二级心理咨询师
                                浙江大学硕士
                                林紫EAP咨询师

                                咨询风格：细腻敏锐，包容稳定，有着对内心世界温和的好奇，对人生而有之的痛苦的悲悯，以及愿意与之一起工作的耐心。

                                擅长领域：1抑郁、焦...</p>
                            <dl>
                                <dd class="ico1">已咨询 <span class="f_orange">17</span></dd>
                                <dd class="ico3">200元/50分钟</dd>
                            </dl>
                        </div>
                        <div class="btnwp">
                            <a href="/user/3446509/yuyue" class="btn" id="btn-yuyue">预约</a>
                        </div>
                    </li>
                </ul>
                <div class="more">
                    <a href="/zx">更多专家 </a>
                </div>
            </div>
        </div>
        <!--测试显示首页-->
        <div class="result_tools" style="margin-bottom: 20px;">
        <span class="replay">
        	<a href="http://www.xinli001.com/ceshi/41365306" class="test_again">再测一次</a>
        	<a href="/contact" id="err_report">错误报告</a>
        </span>
        </div>
        <!--分享-->

        <div class="mbox comments_show" id="comments_area">
            <h2>发表留言 ：<a name="comments"></a></h2>
            <form id="id_comment_form" class="comments_form" style="display: none"
                  action="http://www.xinli001.com/ceshi/41365306/comment" method="post" onsubmit="return false">
                <textarea id="id_comment_content" class="txt" name="content" nullmsg="请输入留言内容"
                          resultCode="${tResult.resultCode}"></textarea>
                <p class="cbtns">
                    <span id="id_comment_content_msg" class="inputmsg"></span>
                    <input id="id_comment_submit" type="button" class="btns" value="发表留言"/>
                </p>
            </form>
        </div>
        <div id="id_comment_page">
            <!-- start div为了就是让引擎抓取-->
            <div class="mbox comments_list fixed" id="replyTemplate" style="display:none;">
                <div class="items" id="">
                    <div class="ct">
                        <span class="arrow"></span>
                        <a href="" class="nickname ua">[ipAddress]</a>
                        ：[createTime]
                    </div>
                    <div class="c_contents fixed">
                        <div class="pbox fl">
                            <a href="">
                                <img src="http://ossimg.xinli001.com/20160329/9fe4842afb2c58c2200a1b9ae7a68ca9.png!50"
                                     alt="[IP]" width="50" height="50" hover="true"/>
                            </a>
                        </div>
                        <div class="cshow">
                            [content]
                        </div>
                    </div>
                </div>
                <!--items-->
            </div>
            <div class="mbox comments_list fixed" id="comments_list">
                <!--items-->
            </div>
            <!--end-->
            <!--留言列表-->
            <div class="pagebar" id="pages" page="1" rows="5">
                <span style="padding: 10px;border: 1px dashed #ccc;font-size: 16px;">
                    <a href="javascript:void(0)" style="text-decoration: none" id="moreComments" nextPage="2">查看更多评论</a>
                </span>
            </div>
        </div>
        <!--评论列表-->
    </div>
    <!--left-->
    <div style="display:none">
        <div id="ceshi-invite" class="invite">
            <div class="top">
                邀请好友测试
            </div>
            <div class="share">
                <a href="#" class="tsina"></a>
                <a href="#" class="qzone"></a>
                <a href="#" class="douban"></a>
                <a href="#" class="renren"></a>
                <a href="#" class="sqq"></a>
            </div>
        </div>
    </div>

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
<script src="http://lapp.xinli001.com/ceshi/js/jquery.plugin.js"></script>
<script src="http://lapp.xinli001.com/ceshi/js/show.js"></script>
<script>
    function getItemsByPage(page) {
        var data = {t: $.now(), page: page};
        $.get(pageUrl, data, function (resp) {
            $('#id_comment_page').html(resp);
        });
        return false;
    }

    var pageUrl = 'http://www.xinli001.com/ceshi/41365306/comment';
    $(function () {
        $('#quoteBox a.close').click(rmCommentReply);
        $('.items .reply').click(addCommentReply);
        $('#id_comment_form').submit(postCommentByAjax);
        $('#id_comment_form').show();
    });
    $('#invitea').click(function () {
        ui.dialog($('#ceshi-invite')).effect('slide').modal().overlay().show();
        return false;
    });
    $as = $('#invite .share a');
    $as.click(function (e) {
        sharetobaidusns(e, this.className, '单身汪专属：测测你保持单身的小心思', 'http://www.xinli001.com/ceshi/41365306', '「单身汪专属：测测你保持单身的小心思」单身专测！如果你已经有伴侣了，请不要继续读下去了。');
        return;
    });
</script>
