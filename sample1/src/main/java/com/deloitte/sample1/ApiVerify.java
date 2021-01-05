package com.deloitte.sample1;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.reactive.function.client.WebClient.Builder;

import com.deloitte.VO.CompanyDetails;
import com.deloitte.dao.CompanyDao;

@RestController
@RequestMapping("/sample")
public class ApiVerify {

	@Autowired
	CompanyDao dao;
	
	@GetMapping(path="/hello")
	public String sample() {
		return("Hello There!!!");
	}
	
	@GetMapping(path="/company")
	public List<CompanyDetails> getCompanyDetails(){
		return dao.getCompanies();
	}
}
