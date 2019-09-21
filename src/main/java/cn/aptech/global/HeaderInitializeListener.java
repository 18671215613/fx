package cn.aptech.global;

import cn.aptech.pojo.TModule;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * 监听器
 * header.ftl
 */
@Component
public class HeaderInitializeListener implements ApplicationListener<MyEvent> {
    @Override
    public void onApplicationEvent(MyEvent event) {
        // 把事件中的信息获取到
        List<TModule> tModuleList = event.gettModuleList();
        header(tModuleList);
    }

    public void header(List<TModule> tModuleList) {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        HttpSession session = request.getSession();
        session.setAttribute("tModuleList", tModuleList);
    }
}
