<div class="new-header">
    <div class="wrapper">
        <div class="logo">
            <a href="http://www.xinli001.com/"><img src="http://lapp.xinli001.com/images/website-www/logo.png"/></a>
        </div>
        <div class="nav">
            <ul>
                <li><a href="http://www.xinli001.com/" class="tit">首页</a></li>
                <li><a href="http://www.xinli001.com/info" class="tit">文章</a></li>
                <li><a href="http://qa.xinli001.com/" class="tit">问答</a></li>
                <li><a href="http://www.xinli001.com/zx/" class="tit">咨询</a></li>
                <li class="selected"><a href="http://www.xinli001.com/ceshi/" class="tit isNew">测试<span
                                class="newBrand"></span></a></li>
                <li><a href="http://fm.xinli001.com/" class="tit">心理FM</a></li>
                <li><a href="http://xy.xinli001.com/" class="tit">课程</a></li>
                <li class="droplist">
                    <a href="#" class="tit tit-more">更多</a>
                    <dl>
                        <dd><a href="http://www.xinli001.com/oxygen/">心灵氧吧</a></dd>
                        <dd><a href="http://www.xinli001.com/site/">心理圈</a></dd>
                        <dd><a href="http://group.xinli001.com/">小组</a></dd>
                        <dd><a href="http://app.xinli001.com/">心理应用</a></dd>
                        <dd><a href="http://www.xinli001.com/daka/">打卡学习</a></dd>
                        <dd><a href="http://www.xinli001.com/dream/">每日一梦</a></dd>
                    </dl>
                </li>
            </ul>
        </div>
        <div id="header-auth-user-div">
            <div class="reg">
                <ul>
                    <#--<li>欢迎您！${tUser.userName},<a href="/api/index/goLogin" style="text-decoration: none">&nbsp;退出</a></li>-->
                    <li><a href="/api/index/goLogin" target="_self" >登录</a></li>
                    <li><span class="line"></span></li>
                    <li><a href="/api/index/userRegister" target="_self">注册</a></li>
                </ul>
            </div>
        </div>
        <div class="sear">
            <form target="_blank" action="http://zhannei.baidu.com/cse/search" method="get">
                <input type="hidden" name="s" value="11434743956290276987">
                <input type="hidden" name="nsid" value="0">
                <input type="text" class="text" name="q" placeholder="搜索"/>
                <input type="submit" class="submit" value=""/>
            </form>
        </div>
    </div>
</div>
<!-- nav end -->
<div class="header cleara">
    <div class="wrap">
        <div class="lf_header">
            <a href="/api/index/index" class="headerlogo">心理测试</a>
            <ul class="hd_menu infos-menu">
                <#list tModuleList as tModule>
                    <li <#if tModule.isnew==1>class="isNew"</#if>>
                        <a href="/api/list/start?moduleCode=${tModule.moduleCode}">${tModule.moduleName}</a>
                        <#if tModule.isnew==1><span class="newBrand"></span></#if>
                    </li>
                </#list>
            </ul>
        </div>
        <div class="rt_header infos-search">
            <form method="get" action="http://zhannei.baidu.com/cse/search"
                  target="_blank">
                <p class="hd_searchBox">
                    <input name="q" class="hd_searchText" type="text" maxlength="30"
                           placeholder="搜索心理学内容/心理测试/心理圈"> <input type="hidden" name="s"
                                                                  value="11434743956290276987"> <input type="hidden"
                                                                                                       name="nsid"
                                                                                                       value="0"> <input
                            class="hd_search_btn" type="submit" value="搜索">
                </p>
            </form>
        </div>
    </div>
</div>
<!-- header end -->