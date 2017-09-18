package org.framestudy.sh.o2omag.service;

import java.util.List;

import org.framestudy.sh.beans.Hus;

public interface IHusbandService {
	/**
	 * 添加丈夫，并且添加妻子
	 * @param hus
	 */
	public void saveHusband(Hus hus);
	/**
	 * 根据丈夫的ID查询丈夫
	 * @param id
	 * @return
	 */
	public Hus getHusbandById(Long id);
	
	public void updateHusband(Hus hus);
	
	public void deleteHusband(Hus hus);
	
	public List<?> findHusbandByWifeName(String wifeName);
	
	
}
