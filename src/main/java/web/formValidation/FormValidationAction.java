package web.formValidation;

import com.opensymphony.xwork2.ActionSupport;

import core.model.User;

public class FormValidationAction extends ActionSupport {

//	Data Type
	private static final long serialVersionUID = 7859271110891851034L;
	private User user;

//	Function
	public String addUser(){
		
		return SUCCESS;
		
	}
	
	
//	Getter and Setter
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	

}
