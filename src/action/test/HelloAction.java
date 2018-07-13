package action.test;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import model.User;

public class HelloAction extends ActionSupport implements ModelDriven<User> {

//	Date Type ------------------------------------------------------------------------------------------------------
	private static final long serialVersionUID = 1L;
	private User user = new User();


//	Function -------------------------------------------------------------------------------------------------------
	public String execute(){
		if(getModel().getUsername() == "login" || "login".equals(getModel().getUsername())){
			return SUCCESS;
		}else{
			return ERROR;
		}
	}
	
	public void testModelDrivaen(){
		
	}
	
//	Getter and Setter ----------------------------------------------------------------------------------------------

	@Override
	public User getModel() {
		return user;
	}
	
	
	
	

}
