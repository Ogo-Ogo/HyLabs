package hylabs.consolAppl.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "hyLabs_tasks")
public class Task {
	String companyName;
	@Id
	String itemId;
	String CheckMethod;
	ResultReport rr;
	
	public Task() {}
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
	
	public ResultReport getResultReport() {
		return rr;
	}
	public void setResultReport(ResultReport rr) {
		this.rr = rr;
	}
	
	
	public Task(String companyName, String itemId, String checkMethod, ResultReport rr) {
		super();
		this.companyName = companyName;
		this.itemId = itemId;
		CheckMethod = checkMethod;
		this.rr = rr;
	}
	@Override
	public String toString() {
		return "Task [companyName=" + companyName + ", itemId=" + itemId + ", CheckMethod=" + CheckMethod + ", rr=" + rr
				+ "]";
	}
	
	
	
	
	
	

}
