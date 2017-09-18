package org.framestudy.sh.personmag.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.framestudy.sh.beans.Person;
import org.framestudy.sh.personmag.dao.IPersonDao;
import org.framestudy.sh.personmag.service.IPersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements IPersonService {

	@Resource
	private IPersonDao personDaoImpl;
	
	@Override
	public Person getPersonById(Long id) {
		// TODO Auto-generated method stub
		return personDaoImpl.getPersonById(id);
	}

	@Override
	public List<?> getPersonByAddress(String address) {
		// TODO Auto-generated method stub
		return personDaoImpl.getPersonByAddress(address);
	}

	@Override
	public List<?> getPersonByPersonInfo(String info) {
		// TODO Auto-generated method stub
		return personDaoImpl.getPersonByPersonInfo(info);
	}

}
