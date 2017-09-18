package org.framestudy.sh;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.framestudy.sh.beans.UserBean;
import org.framestudy.sh.pojos.Pager;
import org.framestudy.sh.pojos.User;
import org.framestudy.sh.usermag.service.IUserService;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class TestUserService {

	@Resource
	private IUserService userServiceImpl;
	
	
	@Ignore
	public void testFindUserListByMap2Pager() {
		Map params = new HashMap();
		params.put("loginName", "a");
		params.put("password", "123456");
		params.put("age", 18);
		
		Pager pager = new Pager(1, 4);
		
		pager = userServiceImpl.findUserListByMap2Pager(params, pager);
				
		System.out.println(pager);
	}
	
	@Ignore
	public void testFindUserListByUser() {
		User user = new User("a", "123456", 18);
		List<?> users = userServiceImpl.findUserListByUser(user);
		System.out.println(users);
		
		
		user.setAge(19);
		List<?> users2 = userServiceImpl.findUserListByUser(user);
		System.out.println(users2);
	}
	
	@Ignore
	public void testFindUserListByMap() {
		Map params = new HashMap();
		params.put("loginName", "a");
		params.put("password", "123456");
		params.put("age", 18);
		
		List<?> users = userServiceImpl.findUserListByMap(params);
		System.out.println(users);
		List<?> users2 = userServiceImpl.findUserListByMap(params);
		System.out.println(users2);
		List<?> users3 = userServiceImpl.findUserListByMap(params);
		System.out.println(users3);
	}
	
	@Ignore
	public void testFindUserListByUserNameAndAge() {
		List<?> users = userServiceImpl.findUserListByUserNameAndAge("张", 18);
		System.out.println(users);
	}
	
	
	@Ignore
	public void testDeleteUserBean() {
		UserBean user = userServiceImpl.getUserInfoById(2l);
		
		System.out.println(user);
		
		UserBean user2 = userServiceImpl.getUserInfoById(2l);
		
		System.out.println(user);
//		userServiceImpl.deleteUserInfo(user);
	}
	
	@Ignore
	public void testUpdateUserBean() {
		UserBean user = userServiceImpl.getUserInfoById(1l);
		Assert.assertNotNull(user);
		
		System.out.println(user);
		user.setUserName("guanyu");
		userServiceImpl.updateUserInfo(user);
	}
	
	
	
	@Test
	public void testSaveUserBean() {
		UserBean user = new UserBean("小明3", 12);
		userServiceImpl.saveUserInfo(user);
		System.out.println(user);
		
		
		
		
		UserBean user2 = userServiceImpl.getUserInfoById(9l);
		System.out.println(user2);
		
		
		
		
	}
	
	
}
