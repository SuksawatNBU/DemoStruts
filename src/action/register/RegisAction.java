package action.register;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import model.User;

public class RegisAction extends ActionSupport implements ModelDriven<User> {
	
//	Date Type ------------------------------------------------------------------------------------------------------
	private static final long serialVersionUID = 1L;
	private User user = new User();

	
//	Function -------------------------------------------------------------------------------------------------------
	public void regisUser(){
		
		
	}
	
	
//	Getter and Setter ----------------------------------------------------------------------------------------------
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public User getModel() {
		return user;
	}
	
	
	
}
