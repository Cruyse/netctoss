package org.framestudy.sh.personmag.dao.impl;

import java.util.List;

import org.framestudy.sh.BaseDao;
import org.framestudy.sh.beans.Person;
import org.framestudy.sh.personmag.dao.IPersonDao;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

@Repository
public class PersonDaoImpl extends BaseDao implements IPersonDao {
	
	
	@Override
	public Person getPersonById(Long id) {
		// TODO Auto-generated method stub
		return (Person) getSession().get(Person.class, id);
	}

	@Override
	public List<?> getPersonByAddress(String address) {
		// TODO Auto-generated method stub
		String hql = "select new map(p.personName,add.address) From Person as p left join p.adds as add where add.address like CONCAT(?,'%')";
		Query query = getSession().createQuery(hql);
		query.setString(0, address);
		return query.list();
	}

	@Override
	public List<?> getPersonByPersonInfo(String info) {
		// TODO Auto-generated method stub
		String hql = "from Person as p left join fetch p.info as info where info.idcard like CONCAT(?,'%')";
		Query query = getSession().createQuery(hql);
		query.setString(0, info);
		return query.list();
	}

}
