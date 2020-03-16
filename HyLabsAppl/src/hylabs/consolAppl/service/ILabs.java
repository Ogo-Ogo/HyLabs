package hylabs.consolAppl.service;
<<<<<<< HEAD
import java.time.LocalDate;
import java.util.List;

import hylabs.consolAppl.dto.ResultReport;
import hylabs.consolAppl.dto.Task;

public interface ILabs {
	void addTest(Task task);
	boolean removeTest(String id);
	void displayUndoneTests();
	List<Task> getTestsAtDates(LocalDate dateFrom, LocalDate dateTo);
	boolean setTest(ResultReport report);
	List<ResultReport> getTestByCompany(String companyName);
	List<ResultReport> getTestByName(String doerName);	
=======

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
>>>>>>> branch 'master' of https://github.com/Ogo-Ogo/HyLabs.git

}
