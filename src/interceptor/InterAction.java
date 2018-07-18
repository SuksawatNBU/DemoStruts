package interceptor;

import com.opensymphony.xwork2.ActionSupport;

public class InterAction extends ActionSupport {
	
	private static final long serialVersionUID = -4089459612658433999L;
	private String name;
	
//	Function
	public String execute() throws Exception {
	      System.out.println("Inside action....");
	      return SUCCESS;
	}  

//	Getter and Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	

}
