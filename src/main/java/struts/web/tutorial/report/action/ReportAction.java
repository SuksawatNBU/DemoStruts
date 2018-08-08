package struts.web.tutorial.report.action;

import common.CommonAction;
import interfaces.InterfaceAction;

public class ReportAction extends CommonAction implements InterfaceAction{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2418150410847793057L;

	@Override
	public String init() throws Exception {
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
	
	public String exportCalendar() throws Exception {
		System.out.println("Test -- exportCalendar");
		return "success";
	}

}
