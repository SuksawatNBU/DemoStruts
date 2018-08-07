package struts.core.tutorial.employee.service;

import java.util.List;

import abstracts.AbstractManager;
import struts.core.tutorial.employee.domain.Employee;
import struts.core.tutorial.employee.domain.EmployeeSearch;
import struts.core.tutorial.employee.domain.EmployeeSearchCriteria;

public class EmployeeManager extends AbstractManager<EmployeeSearchCriteria, EmployeeSearch, Employee>{

	
	private EmployeeService service = null;
	
	public EmployeeManager(){
		service = new EmployeeService();
	}
	
	@Override
	public List<EmployeeSearch> search(EmployeeSearchCriteria criteria) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Employee searchById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(Employee obj) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int edit(Employee obj) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(String ids) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
