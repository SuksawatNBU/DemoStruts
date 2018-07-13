package action.authentication;

import java.util.HashMap;
import java.util.Map;

import org.apache.struts2.dispatcher.SessionMap;
import org.apache.struts2.interceptor.SessionAware;


import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

import manager.authentication.AuthenManager;
import bean.User;

public class AuthenAction extends ActionSupport implements SessionAware {
	
	private static final long serialVersionUID = 1L;
//	Date Type --------------------------------------------------
	private User user;
	private String email;
	private String password;
	private int counter;
	
	SessionMap<String, Object> sessionmap;
	
//	Function ---------------------------------------------------
	public String signIn(){
		ValueStack stack = ActionContext.getContext().getValueStack();
		
		if(counter > 3){
			Map<String, Object> context = new HashMap<String, Object>();
			context.put("againMsg", new String("Counter!")); 
			stack.push(context);
			return INPUT;
		}
		
		if((email == null && !"".equals(email)) || (password == null && !"".equals(password))){
			return "again";
		}
		try{
			// ดึงข้อมูลในฐานข้อมูล
			AuthenManager manager = new AuthenManager();
			User userResult = manager.validateLogin(email, password);
				
			//ตรวจสอบค่าว่าง
			if(userResult == null || "".equals(userResult) || userResult.getId() == 0){
				
				Map<String, Object> context = new HashMap<String, Object>();
				context.put("againMsg", new String("Invalid email or password. Try again.")); 
				stack.push(context);
				counter += 1 ;
				return INPUT;
			}
			
			// น้ำข้อมูลที่ได้ เอาไปใส่ไว้ใน Class User 
			setUser(userResult);
				
			return SUCCESS;  
		}catch (NullPointerException e) {
			e.printStackTrace();
		}
		return ERROR;
	}
	
	public String signOut(){
		sessionmap.invalidate(); 
		return "success";
	}
	
	public void validate(){
		if("".equals(getEmail())){
			addFieldError("email", getText("email.required"));
		}
		if("".equals(getPassword())){
			addFieldError("password", getText("password.required"));
		}
	}
	
//	Getter and Setter ------------------------------------------
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}

	@Override
	public void setSession(Map<String, Object> map) {
		sessionmap = (SessionMap<String, Object>) map;  
	    sessionmap.put("login","true");
	}
	
}
