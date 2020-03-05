package hylabs.consolAppl.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

@SuppressWarnings("serial")
public class ResultReport implements Serializable{
	
	String doerName;
	LocalDateTime time;
	String companyName;
	String itemId;
	String testMethod;
	
	@Override
	public String toString() {
		return "ResultReport [doerName=" + doerName + ", time=" + time + ", companyName=" + companyName + ", itemId="
				+ itemId + ", testMethod=" + testMethod + "]";
	}
	public String getDoerName() {
		return doerName;
	}
	public void setDoerName(String doerName) {
		this.doerName = doerName;
	}
	public LocalDateTime getTime() {
		return time;
	}
	public void setTime(LocalDateTime time) {
		this.time = time;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getMethod() {
		return testMethod;
	}
	public void setMethod(String method) {
		this.testMethod = method;
	}
	public ResultReport(String doerName, LocalDateTime time, String companyName, String itemId, String testMethod) {
		super();
		this.doerName = doerName;
		this.time = time;
		this.companyName = companyName;
		this.itemId = itemId;
		this.testMethod = testMethod;
	}
	
	
	

}
