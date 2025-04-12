package model;

public class User {
	private String login;
	private char[] password;

	public User(String login, String password) {
		this.login = login;
		this.password = password.toCharArray();
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public char[] getPassword() {
		return password;
	}

	public void setPassword(char[] password) {
		this.password = password;
	}
}
