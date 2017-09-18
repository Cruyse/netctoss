package org.framestudy.sh.beans;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="t_wife")
public class Wife implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6745961219396322552L;
	
	@Id
	@Column(name="id")
	@GenericGenerator(name="hibernate.identity",strategy="identity")
	@GeneratedValue(generator="hibernate.identity")
	private Long id;
	
	@Column(name="wife_name",length=20)
	private String wifeName;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="wife")
	private Hus hus;
	public Wife() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getWifeName() {
		return wifeName;
	}
	public void setWifeName(String wifeName) {
		this.wifeName = wifeName;
	}
	public Hus getHus() {
		return hus;
	}
	public void setHus(Hus hus) {
		this.hus = hus;
	}
	@Override
	public String toString() {
		return "Wife [id=" + id + ", wifeName=" + wifeName + "]";
	}
}
