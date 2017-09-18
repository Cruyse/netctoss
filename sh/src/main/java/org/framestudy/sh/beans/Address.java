package org.framestudy.sh.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="t_address")
public class Address implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2419784268771872057L;

	@Id
	@Column(name="id")
	@GenericGenerator(name="hibernate.identity",strategy="identity")
	@GeneratedValue(generator="hibernate.identity")
	private Long id;
	
	@Column(name="address",length=120)
	private String address;
	
	@Column(name="fk_person_id")
	private Long fkPersonId;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Long getFkPersonId() {
		return fkPersonId;
	}
	public void setFkPersonId(Long fkPersonId) {
		this.fkPersonId = fkPersonId;
	}
	
	@Override
	public String toString() {
		return "Address [id=" + id + ", address=" + address + ", fkPersonId=" + fkPersonId + "]";
	}
}
