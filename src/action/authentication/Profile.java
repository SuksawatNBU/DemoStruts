package action.authentication;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

public class Profile {
	
	public String signIn(){  
		HttpServletRequest request = ServletActionContext.getRequest();  
		HttpSession session = request.getSession();  
		  
		String ses = (String) session.getAttribute("login");
		if(ses != null && !"".equals(ses)){
		    return "success";  
		}  
		else{  
		    return "error";  
		}
		  
	}

}
