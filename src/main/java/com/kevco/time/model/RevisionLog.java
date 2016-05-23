package com.kevco.time.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="RevisionLog")
public class RevisionLog{

	@Id private String id;

	private String timePeriodId;
	private List<String> revisionIds;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTimePeriodId() {
		return timePeriodId;
	}
	public void setTimePeriodId(String timePeriodId) {
		this.timePeriodId = timePeriodId;
	}
	public List<String> getRevisionIds() {
		return revisionIds;
	}
	public void setRevisionIds(List<String> revisionIds) {
		this.revisionIds = revisionIds;
	}
	
	
}

