package cn.aptech.global;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.ArrayList;
import java.util.List;
@Configuration
public class LoginConfig extends WebMvcConfigurationSupport {
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        List<String> list=new ArrayList<>();
        list.add("/api/index/index");
        list.add("/api/index/goLogin");
        list.add("/api/index/userLogin");
        registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/api/**").excludePathPatterns(list);
    }
}
