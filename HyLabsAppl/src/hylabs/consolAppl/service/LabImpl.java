package hylabs.consolAppl.service;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hylabs.consolAppl.dao.ILabRepository;
import hylabs.consolAppl.dto.ResultReport;
import hylabs.consolAppl.dto.Task;

@Service
public class LabImpl implements ILabs {
	@Autowired
	ILabRepository repository;

	//Добавляет задание в репозиторий без поля "репорт" (оно налл)
	@Override
	public void addTest(Task task) {
		repository
				.save(new Task(task.getCompanyName(), task.getItemId(), task.getCheckMethod(), new ResultReport(null, null, null, null, null)));
	}

	@Override
	public boolean removeTest(String id) {
		repository.deleteByitemId(id);
		if(repository.findByitemId(id).isPresent()) {
		return false;
		}
		return true;
	}

	//берёт все тесты которые попадают в данный промежуток дат. 
	//Это только тесты где есть ЛокалДейт (тоесть таски уже выполнены),
	// поскольку поле ЛокалДейтТайм есть только в классе РезалтРепорт.
	
	@Override
	public List<Task> getTestsAtDates(LocalDate dateFrom, LocalDate dateTo) {
		return repository.findAll().stream()
				.filter(t->t.getResultReport()!=null)
				.filter(t-> t.getResultReport().getTime()!=null)
				.filter(t->(t.getResultReport().getTime().toLocalDate().isAfter(dateFrom) &&
						t.getResultReport().getTime().toLocalDate().isBefore(dateTo)))
				.collect(Collectors.toList());
	}
 
	//я точно не помню, но мы вроде говорили что этот метод посылает выполненные репорты в репозиторий,
	// после выполнения даного метода в репозитории появляеться поле резалтРепорт(Object) 
	@Override
	public boolean setTest(ResultReport report) {
		Task task = repository.findByitemId(report.getItemId()).orElse(null);
		{
			task.setResultReport(new ResultReport(report.getDoerName(), report.getTime(), report.getCompanyName(),
					report.getItemId(), report.getMethod()));
			repository.save(task);
			return true;
		} 
	}

	@Override
	public List<ResultReport> getTestByCompany(String companyName) {
		List<Task> tasks =  repository.findAllBycompanyName(companyName);
		return tasks.stream().map(t->t.getResultReport()).collect(Collectors.toList());
	}

	@Override
	public List<ResultReport> getTestByName(String doerName) {
		return repository.findAll().stream()
				.map(t->t.getResultReport())
				.filter(t->t.getDoerName()!=null && t.getDoerName().equals(doerName))
				.collect(Collectors.toList());
	}

	//печатает на консоль, надо подумать подходит ли нам такое, или лучше
	//всё же сохранить и вернуть список
	@Override
	public void displayUndoneTests() {
		repository.findAll().stream()
				.filter(t-> t.getResultReport().getTime()==null)
				.forEach(System.out::println);

	}

}
