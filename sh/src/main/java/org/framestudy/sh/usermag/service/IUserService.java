package org.framestudy.sh.usermag.service;

import java.util.List;
import java.util.Map;

import org.framestudy.sh.beans.UserBean;
import org.framestudy.sh.pojos.Pager;
import org.framestudy.sh.pojos.User;

public interface IUserService {

	
	
	
	
	public UserBean saveUserInfo(UserBean user);
	
	public UserBean updateUserInfo(UserBean user);
	
	public void deleteUserInfo(UserBean user);
	/**
	 * 根据id查询对象
	 * @param id
	 */
	public UserBean getUserInfoById(Long id);
	/**
	 * 根据id查询对象
	 * @param id
	 */
	public UserBean loadUserInfoById(Long id);
	/**
	 * 根据用户名与年龄查询用户
	 * @param userName
	 * @param age
	 * @return
	 */
	public List<?> findUserListByUserNameAndAge(String userName,int age);	
	/**
	 * 多参数查询方法一
	 * @param params
	 * @return
	 */
	public List<?> findUserListByMap(Map params);
	
	/**
	 * 多参数查询方法二
	 * @param user
	 * @return
	 */
	public List<?> findUserListByUser(User user);
	/**
	 * 分页查询
	 * @param params
	 * @return
	 */
	public Pager findUserListByMap2Pager(Map params,Pager pager);
	
	
}
