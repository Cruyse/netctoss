package org.framestudy.sh.beans;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="t_cls")
public class ClassBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5873006754480777623L;

	@Id
	@Column(name="id")
	@GenericGenerator(name="hibernate.identity",strategy="identity")
	@GeneratedValue(generator="hibernate.identity")
	private Long id;
	
	@Column(name="cls_name",length=20)
	private String clsName;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="cls")
	private Set<StudentBean> stus;
	
	public ClassBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getClsName() {
		return clsName;
	}
	public void setClsName(String clsName) {
		this.clsName = clsName;
	}
	public Set<StudentBean> getStus() {
		return stus;
	}
	public void setStus(Set<StudentBean> stus) {
		this.stus = stus;
	}
	@Override
	public String toString() {
		return "ClassBean [id=" + id + ", clsName=" + clsName + "]";
	}
}
