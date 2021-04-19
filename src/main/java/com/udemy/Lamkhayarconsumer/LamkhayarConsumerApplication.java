package com.udemy.Lamkhayarconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class })
//@EnableJpaRepositories("com.udemy.Lamkhayarconsumer.consumer.repository")
//@EntityScan("com.udemy.Lamkhayarconsumer.consumer.domain")
//@ComponentScan({"com.udemy.Lamkhayarconsumer.consumer.request"})

public class LamkhayarConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(LamkhayarConsumerApplication.class, args);
	}

}
