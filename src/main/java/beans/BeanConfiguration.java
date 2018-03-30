package beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public ChildDao childDao() {
		ChildDaoInMemoryImpl bean = new ChildDaoInMemoryImpl();
		return bean;
	}
		
	@Bean
	public ChildService childService() {
		ChildServiceImpl bean = new ChildServiceImpl();
		bean.setChildDao(childDao());
		return bean;
	}
	
	
}

