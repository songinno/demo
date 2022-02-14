package info.moviepedia.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@SpringBootApplication
public class DemoApplication {
	//viewResolver
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");

		return resolver;
	}

	public static void main(String[] args) {
		//devtools livereload 설정 (안됨)
//		System.setProperty("spring.devtools.restart.enabled", "false");
//		System.setProperty("spring.devtools.livereload.enabled", "true");
		SpringApplication.run(DemoApplication.class, args);
	}

}
