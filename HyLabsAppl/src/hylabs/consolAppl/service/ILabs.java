package hylabs.consolAppl.service;

import java.time.LocalDate;
import java.util.List;

import hylabs.consolAppl.dto.ResultReport;
import hylabs.consolAppl.dto.Task;

public interface ILabs {
	void addTest(Task task);
	boolean removeTest(String id);
	void displayUndoneTests();
	List<Task> getTestsAtDates(LocalDate dateFrom, LocalDate dateTo);
	void setTest(ResultReport test);
	ResultReport getTestByCompany(String companyName);
	ResultReport getTestByName(String doerName);	

}
