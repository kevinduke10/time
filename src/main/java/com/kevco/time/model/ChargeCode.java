package com.kevco.time.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="ChargeCode")
public class ChargeCode{

	@Id private String id;

	private String level1Code;
	private String level2Code;
	private String level3Code;
	private String level4Code;
	private String fullCode;
	private Date startDate;
	private Date endDate;
	private String description;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLevel1Code() {
		return level1Code;
	}
	public void setLevel1Code(String level1Code) {
		this.level1Code = level1Code;
	}
	public String getLevel2Code() {
		return level2Code;
	}
	public void setLevel2Code(String level2Code) {
		this.level2Code = level2Code;
	}
	public String getLevel3Code() {
		return level3Code;
	}
	public void setLevel3Code(String level3Code) {
		this.level3Code = level3Code;
	}
	public String getLevel4Code() {
		return level4Code;
	}
	public void setLevel4Code(String level4Code) {
		this.level4Code = level4Code;
	}
	public String getFullCode() {
		return fullCode;
	}
	public void setFullCode(String fullCode) {
		this.fullCode = fullCode;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}
