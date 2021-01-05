package com.deloitte.dao;

import java.sql.SQLException;

import javax.sql.DataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import oracle.jdbc.pool.OracleDataSource;

@Configuration
public class CustomDataSource {
	

	@Bean
	public DataSource dataSource() throws SQLException {
		OracleDataSource dataSource = new OracleDataSource();
		dataSource.setURL("jdbc:oracle:thin@//localhost:1521/xe");
		dataSource.setUser("system");
		dataSource.setPassword("oracle");
		return dataSource;
		
	}

}
