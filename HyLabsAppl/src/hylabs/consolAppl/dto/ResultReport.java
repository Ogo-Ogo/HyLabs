package hylabs.consolAppl.dto;

import java.time.LocalDateTime;



public class ResultReport  {
	
	String doerName;
	LocalDateTime time;
	String companyName;
	String itemId;
	String CheckMethod;
	
	public ResultReport() {}
	
	@Override
	public String toString() {
		return "ResultReport [doerName=" + doerName + ", time=" + time + ", companyName=" + companyName + ", itemId="
				+ itemId + ", CheckMethod=" + CheckMethod + "]";
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
		return CheckMethod;
	}
	public void setMethod(String method) {
		this.CheckMethod = method;
	}
	public ResultReport(String doerName, LocalDateTime time, String companyName, String itemId, String testMethod) {
		this.doerName = doerName;
		this.time = time;
		this.companyName = companyName;
		this.itemId = itemId;
		this.CheckMethod = testMethod;
	}
	
	
	

}
