package common;

import java.io.Serializable;

import domain.SearchCriteria;
import domain.Transaction;

public class CommonModel implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8341005837001401370L;
	private String language;
	private Transaction transaction = new Transaction();
	private SearchCriteria criteria;
	private PageType page;
	
//	Function ---------------------------------------------------------------------
	public enum PageType {
		SEARCH("search")
		, ADD("add")
		, EDIT("edit")
		, VIEW("view")
		, PRINT("print")
		, REPORT("report")
		, SEARCH_DIALOG("search_dialog")
		, CHOOSE_DIALOG("choose_dialog")
		, CONFIRM_ADD("confirm_add")
		, CONFIRM_EDIT("confirm_edit")
		;

		private String page;

		private PageType(String page) {
			this.page = page;
		}

		public String getPage() {
			return page;
		}
	}

//	Getter and Setter ---------------------------------------------------------------------
	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public Transaction getTransaction() {
		return transaction;
	}

	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

	public SearchCriteria getCriteria() {
		return criteria;
	}

	public void setCriteria(SearchCriteria criteria) {
		this.criteria = criteria;
	}

	public PageType getPage() {
		return page;
	}

	public void setPage(PageType page) {
		this.page = page;
	}
	
	
}
