package org.framestudy.sh.usermag.service.impl;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.framestudy.sh.beans.UserBean;
import org.framestudy.sh.pojos.Pager;
import org.framestudy.sh.pojos.User;
import org.framestudy.sh.usermag.dao.IUserDao;
import org.framestudy.sh.usermag.service.IUserService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements IUserService {

	//如果缓存使用不记得了，请参考：http://blog.csdn.net/u014381863/article/details/48788199
	@Resource
	private IUserDao userDaoImpl;
	
	//CachePut用于向缓存中添加方法的执行结果，并且一定会执行真实方法
	@CachePut(value="users",key="#user.id")
	public UserBean saveUserInfo(UserBean user) {
		// TODO Auto-generated method stub
		userDaoImpl.saveUserInfo(user);
		return user;
	}

	@CachePut(value="users",key="#user.id")
	public UserBean updateUserInfo(UserBean user) {
		// TODO Auto-generated method stub
		userDaoImpl.updateUserInfo(user);
		return user;
	}

	//CacheEvict用于从缓存中移除对象，并且一定会执行真实方法
	@CacheEvict(value="users", allEntries=false,key="#user.id")
	public void deleteUserInfo(UserBean user) {
		// TODO Auto-generated method stub
		userDaoImpl.deleteUserInfo(user);
	}

	//Cacheable 当缓存中如果存在key对应的结果，那么就执行从缓存中获取结果，不会执行真实方法，
	//如果缓存中没有key对应的结果，那么将执行真实方法，并且将执行结果加入缓存中
	@Cacheable(value="users",key="#id")
	public UserBean getUserInfoById(Long id) {
		// TODO Auto-generated method stub
		return userDaoImpl.getUserInfoById(id);
	}
	@Cacheable(value="users",key="#id")
	public UserBean loadUserInfoById(Long id) {
		// TODO Auto-generated method stub
		return userDaoImpl.loadUserInfoById(id);
	}

	@Cacheable(value="users")
	public List<?> findUserListByUserNameAndAge(String userName, int age) {
		// TODO Auto-generated method stub
		return userDaoImpl.findUserListByUserNameAndAge(userName, age);
	}
	
	@Cacheable(value="users")
	public List<?> findUserListByMap(Map params) {
		// TODO Auto-generated method stub
		return userDaoImpl.findUserListByMap(params);
	}
	
	@Cacheable(value="users",condition="#user.age > 17")
	public List<?> findUserListByUser(User user) {
		// TODO Auto-generated method stub
		return userDaoImpl.findUserListByUser(user);
	}
	
	@Cacheable(value="users")
	public Pager findUserListByMap2Pager(Map params,Pager pager) {
		// TODO Auto-generated method stub
		return userDaoImpl.findUserListByMap2Pager(params,pager);
	}

}
