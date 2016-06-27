package com.practice.webapp.entity;

import java.util.Date;

public class Manager{
	private String managerAccount = null;
	private String managerPassword;
	private String managerName;
	private String managerOffice;
	public String getManagerAccount() {
		return managerAccount;
	}
	public void setManagerAccount(String managerAccount) {
		this.managerAccount = managerAccount;
	}
	public String getManagerPassword() {
		return managerPassword;
	}
	public void setManagerPassword(String managerPassword) {
		this.managerPassword = managerPassword;
	}
	public String getManagerName() {
		return managerName;
	}
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}
	public String getManagerOffice() {
		return managerOffice;
	}
	public void setManagerOffice(String managerOffice) {
		this.managerOffice = managerOffice;
	}
	
}