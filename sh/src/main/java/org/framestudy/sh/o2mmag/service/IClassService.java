package org.framestudy.sh.o2mmag.service;

import org.framestudy.sh.beans.ClassBean;

public interface IClassService {

	public void saveClassBean(ClassBean cls);
	
	public ClassBean getClassBeanById(Long id);
	
	public void deleteClassBean(ClassBean cls);
	
}
