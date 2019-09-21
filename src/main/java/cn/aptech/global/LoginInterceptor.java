package cn.aptech.global;

import cn.aptech.pojo.TUser;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //获取session
        HttpSession session = request.getSession();
        TUser tUser = (TUser) session.getAttribute("tUser");
        //判断session中是否有用户数据，如果有，则返回true，继续向下执行
        if (tUser != null) {
            return true;
        } else {
            //不符合条件的给出提示信息，并转发到登录页面
            request.setAttribute("msg", "您还没有登录，请先登录！");
            request.getRequestDispatcher("/api/index/goLogin").forward(request, response);
            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
