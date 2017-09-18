package org.framestudy.sh.o2mmag.dao;

import java.util.List;

import org.framestudy.sh.beans.StudentBean;

public interface IStudentDao {
	/**
	 * 新增学生
	 * @param stu
	 */
	public void saveStudentBean(StudentBean stu);
	
	public void deleteStudentBean(StudentBean stu);
	
	public List<?> findStudentListByClassName(String clsName);
}
