package common;

import java.io.Serializable;

import com.opensymphony.xwork2.ActionSupport;

import domain.SearchCriteria;
import exception.AuthorizationException;




public class CommonAction extends ActionSupport implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6790716738947871471L;
	
//	private Logger log = loggerInititial();
	
//	Function ---------------------------------------------------------------------
	public enum ReturnType {
		MAINPAGE("mainpage")
		, INIT("init")
		, SEARCH("search")
		, SEARCH_DO("searchDo")
		, DOWNLOAD(null)
		, UPLOAD("upload")
		, ADD_EDIT("addEdit")
		, CONFIRM_ADD_EDIT("confirmAddEdit")
		, ADD_DO("addDo")
		, EDIT_DO("editDo")
		, HOME("home")
		, THIS(null)
		, VIEW("view")
		, SEARCH_AJAX("searchResultAjax")
		, LOGIN("login")
		, PROFILE("profile");

		private String result;

		private ReturnType(String result) {
			this.result = result;
		}

		public String getResult() {
			return result;
		}
	}
	
//	Function Manage --------------------------------------------------------------
	public String manageSearchAjax(CommonModel model, SearchCriteria criteriaModel, String function) throws AuthorizationException {
		//
		String result = ReturnType.SEARCH_AJAX.getResult();
		
		//
		if ((model.getCriteria().getCriteriaKey() == null) || (model.getCriteria().getCriteriaKey().equals(""))) {
			
		}
		
		//
		model.setPage(CommonModel.PageType.SEARCH);
		
		return result;
		
	}

}
