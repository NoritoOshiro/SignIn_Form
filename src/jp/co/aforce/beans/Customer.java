package jp.co.aforce.beans;

import java.io.Serializable;

public class Customer implements Serializable {

	private int id;
	private String login;
	private String password;

	public int getId() {

		return id;

	}

	public String getLogin() {

		return login;

	}

	public String getPassword() {

		return password;

	}

	public void setId(int id) {

		this.id = id;

	}

	public void setLogin(String login) {

		this.login=login;

	}

	public void setPassword(String password) {

		this.password = password;

	}

}
