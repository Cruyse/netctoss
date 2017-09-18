package org.framestudy.sh.personmag.dao;

import java.util.List;

import org.framestudy.sh.beans.Person;

public interface IPersonDao {
	
	public Person getPersonById(Long id);
	
	public List<?> getPersonByAddress(String address);
	
	public List<?> getPersonByPersonInfo(String info);
}
