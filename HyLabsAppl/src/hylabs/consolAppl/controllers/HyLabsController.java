package hylabs.consolAppl.controllers;

<<<<<<< HEAD
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import hylabs.consolAppl.api.HyLabsApi;
import hylabs.consolAppl.dto.ResultReport;
import hylabs.consolAppl.dto.Task;
import hylabs.consolAppl.service.ILabs;


@RestController
public class HyLabsController {
	@Autowired
	ILabs lab;

	@PostMapping(value = HyLabsApi.ADD_TEST)
	public void addTest(@RequestBody Task task) {
		lab.addTest(task);
	}

	@PostMapping(value = HyLabsApi.SET_REPORT)
	public boolean setTest(@RequestBody ResultReport report) {
		return lab.setTest(report);
	}

	@DeleteMapping(value = HyLabsApi.REMOVE_TEST)
	public boolean removeTest(@RequestParam(name = HyLabsApi.ID) String id) {
		return lab.removeTest(id);
	}

	@GetMapping(value = HyLabsApi.COMPANY_TESTS)
	public List<ResultReport> getTestsByCompany(@RequestParam(name = HyLabsApi.COMPANY_NAME) String companyName) {
		return lab.getTestByCompany(companyName);
	}

	@GetMapping(value = HyLabsApi.NAME_TESTS)
	public List<ResultReport> getTestsByName(@RequestParam(name = HyLabsApi.DOER_NAME) String doerName) {
		return lab.getTestByName(doerName);
	}

	@GetMapping(value = HyLabsApi.GET_TESTS_AT_DATES)
	List<Task> getTestsAtDates(@RequestParam(name = HyLabsApi.DATE_FROM) String dateFrom,
			@RequestParam(name = HyLabsApi.DATE_TO) String dateTo) {
		LocalDate from = LocalDate.parse(dateFrom);
		LocalDate to = LocalDate.parse(dateTo);
		return lab.getTestsAtDates(from, to);
	}
	
	@GetMapping(value = HyLabsApi.UNDONE_TESTS)
	public void displayUndoneTests() {
		lab.displayUndoneTests();
	}
}
=======
import hylabs.consolAppl.service.ILabs;

public class HyLabsController {
	ILabs lab;
	

}
>>>>>>> branch 'master' of https://github.com/Ogo-Ogo/HyLabs.git
