package org.framestudy.sh;

import java.util.List;

import javax.annotation.Resource;

import org.framestudy.sh.beans.Hus;
import org.framestudy.sh.beans.Wife;
import org.framestudy.sh.o2omag.service.IHusbandService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class TestHusbandService {

	@Resource
	private IHusbandService husbandServiceImpl;
	
	@Ignore
	public void testFindHusbandByWifeName() {
		List<?> list = husbandServiceImpl.findHusbandByWifeName("老");
		System.out.println(list);
	}
	
	@Test
	public void testGetHusbandById() {
		Hus hus = husbandServiceImpl.getHusbandById(1L);
		System.out.println(hus);
		
//		Wife wife = new Wife();
//		wife.setWifeName("老马");
//		
//		hus.setWife(wife);
//		wife.setHus(hus);
//		
//		husbandServiceImpl.updateHusband(hus);
	}
	
	@Ignore
	public void testSaveHusbandAndWife() {
		Hus hus = new Hus();
		hus.setHusName("老宋");
		
		Wife wife = new Wife();
		wife.setWifeName("老马");
		
		//如果需要在保存丈夫时，一起保存妻子的化，那么就需要双向设值
		hus.setWife(wife);
		wife.setHus(hus);
		
		husbandServiceImpl.saveHusband(hus);
	}
}
