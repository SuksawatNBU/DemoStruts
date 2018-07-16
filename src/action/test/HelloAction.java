package action.test;

import com.opensymphony.xwork2.ActionSupport;

class MyAction extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	public static String GOOD = SUCCESS;
	   public static String BAD = ERROR;
}


public class HelloAction extends ActionSupport {

//	Date Type ------------------------------------------------------------------------------------------------------
	private static final long serialVersionUID = 1L;
	private String name;

//	Function -------------------------------------------------------------------------------------------------------
	public String execute() throws Exception{
		if("SECRET".equals(name)) return MyAction.GOOD;
		return MyAction.BAD;
	}

//	Getter and Setter ----------------------------------------------------------------------------------------------
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}

class SomeOtherClass extends ActionSupport {

	private static final long serialVersionUID = 1L;

	public String execute() {
	      return MyAction.GOOD;
	}
}
