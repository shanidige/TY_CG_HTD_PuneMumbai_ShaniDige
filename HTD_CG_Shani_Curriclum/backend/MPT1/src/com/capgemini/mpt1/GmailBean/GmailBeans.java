package com.capgemini.mpt1.GmailBean;

public class GmailBeans {
	private int user_id;
	private String user_name;
	private String Password;
	private String email;
	private int messsage_id;
	private int u_id;
	private String message;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getMesssage_id() {
		return messsage_id;
	}

	public void setMesssage_id(int messsage_id) {
		this.messsage_id = messsage_id;
	}

	public int getU_id() {
		return u_id;
	}

	public void setU_id(int u_id) {
		this.u_id = u_id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "GmailBeans [user_id=" + user_id + ", user_name=" + user_name + ", Password=" + Password + ", email="
				+ email + ", messsage_id=" + messsage_id + ", u_id=" + u_id + ", message=" + message + "]";
	}
}
