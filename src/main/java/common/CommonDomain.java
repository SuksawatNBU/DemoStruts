package common;

import java.io.Serializable;

import domain.Active;
import domain.Language;
import domain.Transaction;


public class CommonDomain implements Serializable{

//	Data Type  ----------------------------------------------------------------------------
	private static final long serialVersionUID = 3149203868796166893L;
	private String id; // pk ของ data นั้นๆ
	private Language language = new Language(); // ภาษาของ data นั้นๆ
	private Active active = new Active(); // สถานะ ของ data นั้นๆ
	private Transaction transaction = new Transaction(); // transaction การบันทึกข้อมูลแสดงที่ หน้าแก้ไข/แสดง
	
	
//	Getter and Setter ----------------------------------------------------------------------
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}
	public Active getActive() {
		return active;
	}
	public void setActive(Active active) {
		this.active = active;
	}
	public Transaction getTransaction() {
		return transaction;
	}
	public void setTransaction(Transaction transaction) {
		this.transaction = transaction;
	}

}
