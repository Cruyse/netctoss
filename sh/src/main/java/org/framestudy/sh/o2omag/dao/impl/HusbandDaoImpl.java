package org.framestudy.sh.o2omag.dao.impl;

import java.util.List;

import org.framestudy.sh.BaseDao;
import org.framestudy.sh.beans.Hus;
import org.framestudy.sh.o2omag.dao.IHusbandDao;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;
@Repository
public class HusbandDaoImpl extends BaseDao implements IHusbandDao {

	@Override
	public void saveHusband(Hus hus) {
		// TODO Auto-generated method stub
		getSession().save(hus);
	}

	@Override
	public Hus getHusbandById(Long id) {
		// TODO Auto-generated method stub
		return (Hus) getSession().get(Hus.class, id);
	}

	@Override
	public void updateHusband(Hus hus) {
		// TODO Auto-generated method stub
		getSession().update(hus);
	}

	@Override
	public void deleteHusband(Hus hus) {
		// TODO Auto-generated method stub
		getSession().delete(hus);
	}

	@Override
	public List<?> findHusbandByWifeName(String wifeName) {
		// TODO Auto-generated method stub
		String hql = "from Hus as hus left join fetch hus.wife as wife where wife.wifeName like CONCAT(?,'%')";
		Query query = getSession().createQuery(hql);
		query.setString(0, wifeName);
		return query.list();
	}

}
