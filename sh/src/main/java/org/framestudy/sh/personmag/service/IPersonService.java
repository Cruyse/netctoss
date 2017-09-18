package org.framestudy.sh.personmag.service;

import java.util.List;

import org.framestudy.sh.beans.Person;

public interface IPersonService {

	public Person getPersonById(Long id);
	
	public List<?> getPersonByAddress(String address);
	
	public List<?> getPersonByPersonInfo(String info);
	
}
