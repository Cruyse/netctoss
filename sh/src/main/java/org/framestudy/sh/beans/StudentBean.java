package org.framestudy.sh.beans;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="t_stus")
public class StudentBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3916412321258612743L;
	
	@Id
	@Column(name="id")
	@GenericGenerator(name="hibernate.identity",strategy="identity")
	@GeneratedValue(generator="hibernate.identity")
	private Long id;
	
	@Column(name="stu_name",length=20)
	private String stuName;
	
	@ManyToOne(fetch=FetchType.EAGER)
	@JoinColumn(name="fk_cls_id")
	private ClassBean cls;
	public StudentBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public ClassBean getCls() {
		return cls;
	}
	public void setCls(ClassBean cls) {
		this.cls = cls;
	}
	@Override
	public String toString() {
		return "StudentBean [id=" + id + ", stuName=" + stuName + ", cls=" + cls + "]";
	}
	
	
	
	
	
}
