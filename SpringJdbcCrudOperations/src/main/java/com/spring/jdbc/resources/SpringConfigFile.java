package com.spring.jdbc.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration		//@Configuration indicates that SpringConfigFile is a configuration class.
public class SpringConfigFile {
	@Bean		//@Bean is used to define the myDataSource bean that will likely configure the database connection.
	public DriverManagerDataSource myDataSource()
	{
		DriverManagerDataSource datasource = new DriverManagerDataSource();	
		
		datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		datasource.setUrl("jdbc:mysql://localhost:3306/Spring_JDBC_db");
		datasource.setUsername("root");
		datasource.setPassword("Sumit4403");
		
		return datasource;
	}
	@Bean	//Defines a JdbcTemplate bean, a Spring class for executing SQL queries.
	public JdbcTemplate myJdbcTemplate() {
		JdbcTemplate jdbctemplate = new JdbcTemplate();
		
		jdbctemplate.setDataSource(myDataSource());
		
		return jdbctemplate;
	}
}
