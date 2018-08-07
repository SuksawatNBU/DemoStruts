package struts.web.tutorial.employee.action;

import java.util.List;

import com.opensymphony.xwork2.ModelDriven;

import common.CommonAction;
import interfaces.InterfaceAction;
import struts.core.tutorial.employee.domain.EmployeeModel;
import struts.core.tutorial.employee.domain.EmployeeSearch;
import struts.core.tutorial.employee.service.EmployeeManager;

public class EmployeeAction extends CommonAction implements ModelDriven<EmployeeModel>, InterfaceAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = 333838767418278234L;
	private EmployeeModel model = new EmployeeModel();
	
	public EmployeeAction() {
		
	}

	@Override
	public EmployeeModel getModel() {
		return model;
	}

	@Override
	public String init() throws Exception {
		String result = null;
		try {
			result = manageSearchAjax(model, model.getCriteria(), null);
			
			EmployeeManager manager = new EmployeeManager();
			List<EmployeeSearch> listResult = manager.search(getModel().getCriteria());
			
		} catch (Exception e) {
			
		}
		return result;
	}

	@Override
	public String search() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String gotoAdd() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String gotoEdit() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String add() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String edit() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String gotoView() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String updateActive() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String delete() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String export() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void getComboForSearch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getComboForAddEdit() {
		// TODO Auto-generated method stub
		
	}

}
