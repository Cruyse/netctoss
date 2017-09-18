package org.framestudy.sh.o2mmag.dao.impl;

import java.util.List;

import org.framestudy.sh.BaseDao;
import org.framestudy.sh.beans.StudentBean;
import org.framestudy.sh.o2mmag.dao.IStudentDao;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl extends BaseDao implements IStudentDao {

	
	
	@Override
	public void saveStudentBean(StudentBean stu) {
		// TODO Auto-generated method stub
		getSession().save(stu);
	}

	@Override
	public void deleteStudentBean(StudentBean stu) {
		// TODO Auto-generated method stub
		getSession().delete(stu);
	}

	@Override
	public List<?> findStudentListByClassName(String clsName) {
		// TODO Auto-generated method stub
		String hql = "From StudentBean as stu left join fetch stu.cls as cls where cls.clsName like CONCAT(?,'%')";
		Query query = getSession().createQuery(hql);
		query.setString(0, clsName);
		return query.list();
	}
}
