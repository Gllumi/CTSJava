package configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloworldCon {
	@Bean
	public Helloworld hello() {
		return new Helloworld();
	}
}
