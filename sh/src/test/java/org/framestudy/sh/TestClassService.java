package org.framestudy.sh;

import javax.annotation.Resource;

import org.framestudy.sh.beans.ClassBean;
import org.framestudy.sh.beans.StudentBean;
import org.framestudy.sh.o2mmag.service.IClassService;
import org.framestudy.sh.o2mmag.service.IStudentService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class TestClassService {

	@Resource
	private IClassService classServiceImpl;
	
	@Resource
	private IStudentService studentServiceImpl;
	
	@Test
	public void saveStudentBean() {
		ClassBean cls = classServiceImpl.getClassBeanById(1l);
		StudentBean stus = new StudentBean();
		stus.setStuName("小马");
		
		//双向设值
		stus.setCls(cls);
		cls.getStus().add(stus);
		
		studentServiceImpl.saveStudentBean(stus);
	}
	
	
	@Ignore
	public void saveClassBean() {
		ClassBean cls = new ClassBean();
		cls.setClsName("J142");
		//关系维护的权利已经交给了学生，班级不再需要进行维护
		classServiceImpl.saveClassBean(cls);
	}
}
