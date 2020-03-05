package hylabs.consolAppl.dto;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Task implements Serializable{
	String companyName;
	String itemId;
	String CheckMethod;
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
	public String getCheckMethod() {
		return CheckMethod;
	}
	public void setCheckMethod(String checkMethod) {
		CheckMethod = checkMethod;
	}
	public Task(String companyName, String itemId, String checkMethod) {
		super();
		this.companyName = companyName;
		this.itemId = itemId;
		CheckMethod = checkMethod;
	}
	@Override
	public String toString() {
		return "Task [companyName=" + companyName + ", itemId=" + itemId + ", CheckMethod=" + CheckMethod + "]";
	}
	
	
	
	

}
