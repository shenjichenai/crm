package spitter.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
public class WebConfig extends WebMvcConfigurerAdapter{

	@Bean
	public ViewResolver viewResoler(){
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");//前缀
		resolver.setSuffix(".jsp");//后缀
		resolver.setExposeContextBeansAsAttributes(true);//开放属性
		return resolver;
	}

	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		super.configureDefaultServletHandling(configurer);
		configurer.enable();
	}
	
}
