package com.Abdul.SpringLooseCoupling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Runner {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Runner.class, args);
		GameRunner bean = context.getBean(GameRunner.class);
		bean.run();
		GameRunner bean1 = context.getBean(GameRunner.class);
		bean1.run();
	
		
		
	}

}
