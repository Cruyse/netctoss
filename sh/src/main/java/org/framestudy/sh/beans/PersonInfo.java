package org.framestudy.sh.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="t_person_info")
public class PersonInfo implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2217402656539132092L;

	@Id
	@Column(name="id")
	@GenericGenerator(name="hibernate.identity",strategy="identity")
	@GeneratedValue(generator="hibernate.identity")
	private Long id;
	
	@Column(name="idcard",length=18)
	private String idcard;
	
	@Column(name="telephone",length=13)
	private String telephone;
	
	@Column(name="remark",length=120)
	private String remark;
	public PersonInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIdcard() {
		return idcard;
	}
	public void setIdcard(String idcard) {
		this.idcard = idcard;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	@Override
	public String toString() {
		return "PersonInfo [id=" + id + ", idcard=" + idcard + ", telephone=" + telephone + ", remark=" + remark + "]";
	}
}
