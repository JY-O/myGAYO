package gayo.spring.web.customer.impl;

import java.util.Date;

public class CustomerVO {
	private String cusId;
	private String cusName;
	private String cusPass;
	private String cusEmail;
	private String cusPhone; // int?
	private Date joinDate;
	private Date lastLogin;
	private String cusState; // char?
	private String cusPostcode; // int?
	private String cusAdd1;
	private String cusAdd2;
	private String cusBirth; // int?
	private String cusTermAgree;
	private String cusGender; // String?

	public String getCusId() {
		return cusId;
	}

	public void setCusId(String cusId) {
		this.cusId = cusId;
	}

	public String getCusName() {
		return cusName;
	}

	public void setCusName(String cusName) {
		this.cusName = cusName;
	}

	public String getCusPass() {
		return cusPass;
	}

	public void setCusPass(String cusPass) {
		this.cusPass = cusPass;
	}

	public String getCusEmail() {
		return cusEmail;
	}

	public void setCusEmail(String cusEmail) {
		this.cusEmail = cusEmail;
	}

	public String getCusPhone() {
		return cusPhone;
	}

	public void setCusPhone(String cusPhone) {
		this.cusPhone = cusPhone;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public String getCusState() {
		return cusState;
	}

	public void setCusState(String cusState) {
		this.cusState = cusState;
	}

	public String getCusPostcode() {
		return cusPostcode;
	}

	public void setCusPostcode(String cusPostcode) {
		this.cusPostcode = cusPostcode;
	}

	public String getCusAdd1() {
		return cusAdd1;
	}

	public void setCusAdd1(String cusAdd1) {
		this.cusAdd1 = cusAdd1;
	}

	public String getCusAdd2() {
		return cusAdd2;
	}

	public void setCusAdd2(String cusAdd2) {
		this.cusAdd2 = cusAdd2;
	}

	public String getCusBirth() {
		return cusBirth;
	}

	public void setCusBirth(String cusBirth) {
		this.cusBirth = cusBirth;
	}

	public String getCusTermAgree() {
		return cusTermAgree;
	}

	public void setCusTermAgree(String cusTermAgree) {
		this.cusTermAgree = cusTermAgree;
	}

	public String isCusGender() {
		return cusGender;
	}

	public void setCusGender(String cusGender) {
		this.cusGender = cusGender;
	}

	@Override
	public String toString() {
		return "CustomerVO [cusId=" + cusId + ", cusName=" + cusName + ", cusPass=" + cusPass + ", cusEmail=" + cusEmail
				+ ", cusPhone=" + cusPhone + ", joinDate=" + joinDate + ", lastLogin=" + lastLogin + ", cusState="
				+ cusState + ", cusPostcode=" + cusPostcode + ", cusAdd1=" + cusAdd1 + ", cusAdd2=" + cusAdd2
				+ ", cusBirth=" + cusBirth + ", cusTermAgree=" + cusTermAgree + ", cusGender=" + cusGender + "]";
	}

}
