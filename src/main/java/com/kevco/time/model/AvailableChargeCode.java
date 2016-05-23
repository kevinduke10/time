package com.kevco.time.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="AvailableChargeCode")
public class AvailableChargeCode{

	@Id private String id;

	private String plcId;
	private String chargeCodeId;
	private String userId;
	private boolean availableForCharging;
	private Date dateAssigned;
	
	@PersistenceConstructor
	public AvailableChargeCode(String chargeCodeId, String userId){
		this.chargeCodeId = chargeCodeId;
		this.userId = userId;
		this.availableForCharging = true;
		this.dateAssigned = new Date();
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPlcId() {
		return plcId;
	}
	public void setPlcId(String plcId) {
		this.plcId = plcId;
	}
	public String getChargeCodeId() {
		return chargeCodeId;
	}
	public void setChargeCodeId(String chargeCodeId) {
		this.chargeCodeId = chargeCodeId;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public boolean isAvailableForCharging() {
		return availableForCharging;
	}
	public void setAvailableForCharging(boolean availableForCharging) {
		this.availableForCharging = availableForCharging;
	}
	public Date getDateAssigned() {
		return dateAssigned;
	}
	public void setDateAssigned(Date dateAssigned) {
		this.dateAssigned = dateAssigned;
	}
}
