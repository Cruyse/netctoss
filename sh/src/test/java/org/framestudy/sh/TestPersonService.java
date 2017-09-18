package org.framestudy.sh;

import java.util.List;

import javax.annotation.Resource;

import org.framestudy.sh.beans.Person;
import org.framestudy.sh.personmag.service.IPersonService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class TestPersonService {

	@Resource
	private IPersonService personServiceImpl;
	
	@Ignore
	public void testGetPersonByPersonInfo() {
		List<?> datas = personServiceImpl.getPersonByPersonInfo("123");
		System.out.println(datas);
	}
	
	@Ignore
	public void testGetPersonByAddress() {
		List<?> datas = personServiceImpl.getPersonByAddress("九眼桥");
		System.out.println(datas);
		
	}
	
	
	@Test
	public void testGetPersonById() {
		Person person = personServiceImpl.getPersonById(2l);
//		System.out.println(person);
		System.out.println(person.getPersonName());
		
	}
	
}
