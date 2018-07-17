package bundle;

import com.opensymphony.xwork2.ActionSupport;

public class WelcomeAction  extends ActionSupport {

	private static final long serialVersionUID = 8768606260803664840L;
	private String username;
	private String address;
	
	@Override
	public String execute() {
		return SUCCESS;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
