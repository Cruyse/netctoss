package org.framestudy.sh.pojos;

public class User {

	private String loginName;
	private String password;
	private Integer age;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public User(String loginName, String password, Integer age) {
		super();
		this.loginName = loginName;
		this.password = password;
		this.age = age;
	}


	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [loginName=" + loginName + ", password=" + password + ", age=" + age + "]";
	}
	
	
}
