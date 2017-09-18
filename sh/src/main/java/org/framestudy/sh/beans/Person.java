package org.framestudy.sh.beans;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="t_person")
public class Person implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6349365372294170378L;
	
	@Id
	@Column(name="id")
	@GenericGenerator(name="hibernate.identity",strategy="identity")
	@GeneratedValue(generator="hibernate.identity")
	private Long id;
	
	@Column(name="person_name",length=20)
	private String personName;
	
	@OneToOne(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="fk_info_id")
	private PersonInfo info;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="fk_person_id")
	private Set<Address> adds;
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPersonName() {
		return personName;
	}
	public void setPersonName(String personName) {
		this.personName = personName;
	}
	public PersonInfo getInfo() {
		return info;
	}
	public void setInfo(PersonInfo info) {
		this.info = info;
	}
	public Set<Address> getAdds() {
		return adds;
	}
	public void setAdds(Set<Address> adds) {
		this.adds = adds;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", personName=" + personName + ", info=" + info + ", adds=" + adds + "]";
	}
}
