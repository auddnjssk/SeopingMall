package com.vo;

public class JoinVO {
	
	// logIn
	private String login_id = "";
	private String login_password = "";
	
	// signUp
	private String usrId = "";
	private String usrPassword1 = "";
	private String usrPassword2 = "";
	
	
	
	
	@Override
	public String toString() {
		return "JoinVO [login_id=" + login_id + ", login_password=" + login_password + ", usrId=" + usrId
				+ ", usrPassword1=" + usrPassword1 + ", usrPassword2=" + usrPassword2 + ", getLogin_id()="
				+ getLogin_id() + ", getLogin_password()=" + getLogin_password() + ", getUsrId()=" + getUsrId()
				+ ", getUsrPassword1()=" + getUsrPassword1() + ", getUsrPassword2()=" + getUsrPassword2()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	public String getLogin_id() {
		return login_id;
	}
	public void setLogin_id(String login_id) {
		this.login_id = login_id;
	}
	public String getLogin_password() {
		return login_password;
	}
	public void setLogin_password(String login_password) {
		this.login_password = login_password;
	}
	public String getUsrId() {
		return usrId;
	}
	public void setUsrId(String usrId) {
		this.usrId = usrId;
	}
	public String getUsrPassword1() {
		return usrPassword1;
	}
	public void setUsrPassword1(String usrPassword1) {
		this.usrPassword1 = usrPassword1;
	}
	public String getUsrPassword2() {
		return usrPassword2;
	}
	public void setUsrPassword2(String usrPassword2) {
		this.usrPassword2 = usrPassword2;
	}
	
	

}
