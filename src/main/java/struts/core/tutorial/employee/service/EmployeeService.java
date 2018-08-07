package struts.core.tutorial.employee.service;

import java.util.List;

import abstracts.AbstractService;
import struts.core.config.parameter.domain.SQLPath;
import struts.core.tutorial.employee.domain.Employee;
import struts.core.tutorial.employee.domain.EmployeeSearch;
import struts.core.tutorial.employee.domain.EmployeeSearchCriteria;

public class EmployeeService extends AbstractService {
	
	private EmployeeDao dao;
	
	public EmployeeService(){
		this.dao = new EmployeeDao();
		this.dao.setSqlPath(SQLPath.EMPLOYEE_SQL);
	}
	
	protected long countData(EmployeeSearchCriteria criteria) throws Exception {
		return 0;
	}
	
	protected boolean checkDup(Employee obj) throws Exception {
		return false;
	}
	
	protected int add(Employee obj) throws Exception {
		return 0;
	}
	
	protected int edit(Employee obj) throws Exception {
		return 0;
	}
	
	protected int delete(String ids) throws Exception {
		return 0;
	}
	
	protected List<EmployeeSearch> search(EmployeeSearchCriteria criteria) throws Exception {
		return null;	
	}
	
	protected Employee searchById(String id) throws Exception {
		return null;
	}

}
