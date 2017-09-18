package org.framestudy.sh.beans;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="t_hus")
public class Hus implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2271689302927607828L;
	
	@Id
	@Column(name="id")
	@GenericGenerator(name="hibernate.identity",strategy="identity")
	@GeneratedValue(generator="hibernate.identity")
	private Long id;
	
	@Column(name="hus_name",length=20)
	private String husName;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="fk_wife_id",nullable=true)
	private Wife wife;
	public Hus() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getHusName() {
		return husName;
	}
	public void setHusName(String husName) {
		this.husName = husName;
	}
	public Wife getWife() {
		return wife;
	}
	public void setWife(Wife wife) {
		this.wife = wife;
	}
	@Override
	public String toString() {
		return "Hus [id=" + id + ", husName=" + husName + ", wife=" + wife + "]";
	}
	
	
}
