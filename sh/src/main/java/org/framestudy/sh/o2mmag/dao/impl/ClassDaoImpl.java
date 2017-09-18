package org.framestudy.sh.o2mmag.dao.impl;

import org.framestudy.sh.BaseDao;
import org.framestudy.sh.beans.ClassBean;
import org.framestudy.sh.o2mmag.dao.IClassDao;
import org.springframework.stereotype.Repository;

@Repository
public class ClassDaoImpl extends BaseDao implements IClassDao {

	@Override
	public void saveClassBean(ClassBean cls) {
		// TODO Auto-generated method stub
		getSession().save(cls);
	}

	@Override
	public ClassBean getClassBeanById(Long id) {
		// TODO Auto-generated method stub
		return (ClassBean) getSession().get(ClassBean.class, id);
	}

	@Override
	public void deleteClassBean(ClassBean cls) {
		// TODO Auto-generated method stub
		getSession().delete(cls);
	}

}
