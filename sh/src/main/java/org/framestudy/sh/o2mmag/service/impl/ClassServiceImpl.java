package org.framestudy.sh.o2mmag.service.impl;

import javax.annotation.Resource;

import org.framestudy.sh.beans.ClassBean;
import org.framestudy.sh.o2mmag.dao.IClassDao;
import org.framestudy.sh.o2mmag.service.IClassService;
import org.springframework.stereotype.Service;
@Service
public class ClassServiceImpl implements IClassService {

	@Resource
	private IClassDao classDaoImpl;
	
	@Override
	public void saveClassBean(ClassBean cls) {
		// TODO Auto-generated method stub
		classDaoImpl.saveClassBean(cls);
	}

	@Override
	public ClassBean getClassBeanById(Long id) {
		// TODO Auto-generated method stub
		return classDaoImpl.getClassBeanById(id);
	}

	@Override
	public void deleteClassBean(ClassBean cls) {
		// TODO Auto-generated method stub
		classDaoImpl.deleteClassBean(cls);
	}

}
