package struts.core.config.parameter.domain;

import java.io.Serializable;

import resources.sql.tutorial.EmployeeSQL;


public enum SQLPath implements Serializable {

	EMPLOYEE_SQL (EmployeeSQL.class, "resources/sql/tutorial/employee/Employee.sql");

	private String path;
	private Class<?> className;
	
	private SQLPath(Class<?> className, String path) {
		this.path = path;
		this.className = className;
	}

	public String getPath() {
		return path;
	}

	public Class<?> getClassName() {
		return className;
	}
}