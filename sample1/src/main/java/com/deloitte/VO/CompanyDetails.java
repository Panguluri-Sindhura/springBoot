package com.deloitte.VO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="Company")
public class CompanyDetails {
	@Id
	@GeneratedValue
	private int id;
	@Column(name="company_name")
	private String name;
	@Column(name="code")
	private String companyCode;
	
	
	public CompanyDetails() {
		
	}
	
	public CompanyDetails(int id, String name, String companyCode) {
		this.id = id;
		this.name = name;
		this.companyCode = companyCode;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompanyCode() {
		return companyCode;
	}
	public void setCompanyCode(String companyCode) {
		this.companyCode = companyCode;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Company Id : ").append(id).append("\n");
		sb.append("Company Name : ").append(name).append("\n");
		sb.append("Company Code : ").append(companyCode).append("\n");
		return sb.toString();
	}
}
