package com.SpringBootConfigProps.Runner;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;


@Component
@Data
@ConfigurationProperties(prefix = "my.app")
public class DataReadRunner implements CommandLineRunner {
	//@Value("${my.app.id}")
	private Integer id;
	//@Value("${my.app.code}")
	private String code;
	//@Value("${my.app.version}")
	private Double version;
	@Override
	public void run(String... args) throws Exception {
		System.out.println(this);

	}

}
