package javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoradConfig {

	@Bean
	public Borad borad(){
		return new Borad();
	}
	@Bean
	public Memory memory(){
		return new Memory();
	}
}
