package hylabs.consolAppl.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import hylabs.consolAppl.dao.ILabRepository;
import hylabs.consolAppl.dto.ResultReport;
import hylabs.consolAppl.dto.Task;

public class LabImpl implements ILabs {
	@Autowired
	ILabRepository repository;

	@Override
	public void addTest(Task task) {
		
	}

	@Override
	public boolean removeTest(String id) {
		// TODO Auto-generated method stub
		return false;
	}


	@Override
	public List<Task> getTestsAtDates(LocalDate dateFrom, LocalDate dateTo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setTest(ResultReport test) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ResultReport getTestByCompany(String companyName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResultReport getTestByName(String doerName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void displayUndoneTests() {
		// TODO Auto-generated method stub
		
	}
	

}
