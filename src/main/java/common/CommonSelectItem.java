package common;

import java.io.Serializable;

public class CommonSelectItem implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2237434411200967454L;
	private String key;
	private String value;

	
//	Getter and Setter ---------------------------------------------------------------------
	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
}
