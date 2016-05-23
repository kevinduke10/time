package com.kevco.time.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="TimePeriod")
public class TimePeriod{

	@Id private String id;

	private Date startDate;
	private Date endDate;
	private List<String> dayIds;
	private boolean employeeApproved;
	private boolean managerApproved;
	private String revisionLogId;
	private Date employeeApprovedTime;
	private Date managerApprovedTime;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
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
	public List<String> getDayIds() {
		return dayIds;
	}
	public void setDayIds(List<String> dayIds) {
		this.dayIds = dayIds;
	}
	public boolean isEmployeeApproved() {
		return employeeApproved;
	}
	public void setEmployeeApproved(boolean employeeApproved) {
		this.employeeApproved = employeeApproved;
	}
	public boolean isManagerApproved() {
		return managerApproved;
	}
	public void setManagerApproved(boolean managerApproved) {
		this.managerApproved = managerApproved;
	}
	public String getRevisionLogId() {
		return revisionLogId;
	}
	public void setRevisionLogId(String revisionLogId) {
		this.revisionLogId = revisionLogId;
	}
	public Date getEmployeeApprovedTime() {
		return employeeApprovedTime;
	}
	public void setEmployeeApprovedTime(Date employeeApprovedTime) {
		this.employeeApprovedTime = employeeApprovedTime;
	}
	public Date getManagerApprovedTime() {
		return managerApprovedTime;
	}
	public void setManagerApprovedTime(Date managerApprovedTime) {
		this.managerApprovedTime = managerApprovedTime;
	}
	
	
	
}
