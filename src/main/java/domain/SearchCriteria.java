package domain;

import java.io.Serializable;

public abstract class SearchCriteria implements Serializable{

//	Data Type  ----------------------------------------------------------------------------
	private static final long serialVersionUID = -226800432624117003L;
	private String criteriaKey;
	private int linePerPage;
	private int start = 0;
	private long totalResult = 0;
	
//	Getter and Setter ---------------------------------------------------------------------
	public String getCriteriaKey() {
		return criteriaKey;
	}
	public void setCriteriaKey(String criteriaKey) {
		this.criteriaKey = criteriaKey;
	}
	public int getLinePerPage() {
		return linePerPage;
	}
	public void setLinePerPage(int linePerPage) {
		this.linePerPage = linePerPage;
	}
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public long getTotalResult() {
		return totalResult;
	}
	public void setTotalResult(long totalResult) {
		this.totalResult = totalResult;
	}

}
