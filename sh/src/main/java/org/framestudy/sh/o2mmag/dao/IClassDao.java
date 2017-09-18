package org.framestudy.sh.o2mmag.dao;

import org.framestudy.sh.beans.ClassBean;

public interface IClassDao {
	
	public void saveClassBean(ClassBean cls);
	
	public ClassBean getClassBeanById(Long id);
	
	public void deleteClassBean(ClassBean cls);
}
