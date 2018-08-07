package struts.core.tutorial.employee.service;

import java.util.List;

import abstracts.AbstractDAO;
import struts.core.tutorial.employee.domain.Employee;
import struts.core.tutorial.employee.domain.EmployeeSearch;
import struts.core.tutorial.employee.domain.EmployeeSearchCriteria;

public class EmployeeDao extends AbstractDAO<EmployeeSearchCriteria, EmployeeSearch, Employee> {

	@Override
	protected long countData(EmployeeSearchCriteria criteria) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected List<EmployeeSearch> search(EmployeeSearchCriteria criteria) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Employee searchById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected boolean checkDup(Employee obj) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected int add(Employee obj) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected int edit(Employee obj) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	protected int delete(String ids) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

}
