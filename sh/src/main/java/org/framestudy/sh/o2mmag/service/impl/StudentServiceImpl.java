package org.framestudy.sh.o2mmag.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.framestudy.sh.beans.StudentBean;
import org.framestudy.sh.o2mmag.dao.IStudentDao;
import org.framestudy.sh.o2mmag.service.IStudentService;
import org.springframework.stereotype.Service;
@Service
public class StudentServiceImpl implements IStudentService {

	@Resource
	private IStudentDao studentDaoImpl;
	
	@Override
	public void saveStudentBean(StudentBean stu) {
		// TODO Auto-generated method stub
		studentDaoImpl.saveStudentBean(stu);
	}

	@Override
	public void deleteStudentBean(StudentBean stu) {
		// TODO Auto-generated method stub
		studentDaoImpl.deleteStudentBean(stu);
	}

	@Override
	public List<?> findStudentListByClassName(String clsName) {
		// TODO Auto-generated method stub
		return studentDaoImpl.findStudentListByClassName(clsName);
	}

}
