package web.exceptionHandling;

import com.opensymphony.xwork2.ActionSupport;

public class ExceptionHandlingAction extends ActionSupport{
	
	private static final long serialVersionUID = 1L;
	private String name;

	@SuppressWarnings("null")
	public String execute(){
		String x = null;
		x = x.substring(0);
		return SUCCESS;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
