package org.framestudy.sh.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="t_user")
public class UserBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1369437460177251957L;

	@Id
	@Column(name="id")
	@GenericGenerator(name="hibernate.identity",strategy="identity")
	@GeneratedValue(generator="hibernate.identity")
	private Long id;
	
	@Column(name="user_name",length=20)
	private String userName;
	
	@Column(name="age")
	private Integer age;
	
	@Column(name="address",length=120)
	private String address;
	
	@Column(name="login_name",length=20)
	private String loginName;
	
	@Column(name="password",length=32)
	private String password;
	
	@Column(name="telephone",length=13)
	private String telephone;
	
	public UserBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UserBean(Long id, String userName) {
		super();
		this.id = id;
		this.userName = userName;
	}




	public UserBean(String userName, Integer age) {
		super();
		this.userName = userName;
		this.age = age;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	@Override
	public String toString() {
		return "UserBean [id=" + id + ", userName=" + userName + ", age=" + age + ", address=" + address
				+ ", loginName=" + loginName + ", password=" + password + ", telephone=" + telephone + "]";
	}
}
