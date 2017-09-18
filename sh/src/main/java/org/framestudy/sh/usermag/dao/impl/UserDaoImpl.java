package org.framestudy.sh.usermag.dao.impl;

import java.util.List;
import java.util.Map;

import org.framestudy.sh.BaseDao;
import org.framestudy.sh.beans.UserBean;
import org.framestudy.sh.pojos.Pager;
import org.framestudy.sh.pojos.User;
import org.framestudy.sh.usermag.dao.IUserDao;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl extends BaseDao implements IUserDao {
	
	public void saveUserInfo(UserBean user) {
		// TODO Auto-generated method stub
		getSession().save(user);
	}

	public void updateUserInfo(UserBean user) {
		// TODO Auto-generated method stub
		getSession().update(user);
	}

	public void deleteUserInfo(UserBean user) {
		// TODO Auto-generated method stub
		getSession().delete(user);
	}

	public UserBean getUserInfoById(Long id) {
		// TODO Auto-generated method stub
		return (UserBean) getSession().get(UserBean.class, id);
	}

	public UserBean loadUserInfoById(Long id) {
		// TODO Auto-generated method stub
		return (UserBean) getSession().load(UserBean.class, id);
	}

	public List<?> findUserListByUserNameAndAge(String userName, int age) {
		// TODO Auto-generated method stub
		String sql = "select * from t_user where user_name like CONCAT(?,'%') and age = ?";
		SQLQuery query = getSession().createSQLQuery(sql);
		query.setString(0, userName);
		query.setInteger(1, age);
		query.addEntity(UserBean.class);
		return query.list();
}

	public List<?> findUserListByMap(Map params) {
		// TODO Auto-generated method stub
		String hql = "From UserBean as u where u.loginName like CONCAT(:loginName,'%') AND "
				+ "u.password = :password AND u.age = :age";
		Query query = getSession().createQuery(hql).setCacheable(true);// 创建一个Query查询接口实例，并且对HQL语句进行预编译
		query.setProperties(params);
		return query.list();// 调用list()完成执行;
	}

	public List<?> findUserListByUser(User user) {
		// TODO Auto-generated method stub
		String hql = "From UserBean as u where u.loginName like CONCAT(:loginName,'%') AND "
				+ "u.password = :password AND u.age = :age";
		Query query = getSession().createQuery(hql);// 创建一个Query查询接口实例，并且对HQL语句进行预编译
		query.setProperties(user);
		return query.list();// 调用list()完成执行;
	}

	public Pager findUserListByMap2Pager(Map params, Pager pager) {
		// TODO Auto-generated method stub
		Criteria criteria = getSession().createCriteria(UserBean.class);// from UserBean
		// 使用Add()来完成对UserBean对象查询的查询条件
		criteria.add(Restrictions.like("loginName", params.get("loginName").toString(), MatchMode.START));// where
		criteria.add(Restrictions.eq("password", params.get("password")));
		criteria.add(Restrictions.between("id", 1l, 20l));
		criteria.add(Restrictions.eq("age", params.get("age")));

		// 分页我还需要添加count()
		criteria.setProjection(Projections.count("id"));// 在from UserBean之前添加count(id)
		Long total = (Long) criteria.uniqueResult();
		
		pager.setTotal(total);
		// 清理掉查询语句前面的数据库的内置函数
		criteria.setProjection(null);
		int index = (pager.getPage() - 1) * pager.getRows();
		criteria.setFirstResult(index);
		criteria.setMaxResults(pager.getRows());
		List<?> datas = criteria.list();
		pager.setDatas(datas);
		return pager;
	}

}
