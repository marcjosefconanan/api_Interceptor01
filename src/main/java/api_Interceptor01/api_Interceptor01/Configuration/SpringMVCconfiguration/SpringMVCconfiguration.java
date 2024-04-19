package api_Interceptor01.api_Interceptor01.Configuration.SpringMVCconfiguration;

import api_Interceptor01.api_Interceptor01.Interceptors.APILoggingInterceptor;
import api_Interceptor01.api_Interceptor01.Interceptors.LegacyIntercepotr;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Component
public class SpringMVCconfiguration implements WebMvcConfigurer {
    @Autowired
    private APILoggingInterceptor apiLoggingInterceptor;
    @Autowired
    private LegacyIntercepotr legacyIntercepotr;
    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(apiLoggingInterceptor);
        registry.addInterceptor(legacyIntercepotr);
    }
}
