package org.framestudy.sh.o2omag.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.framestudy.sh.beans.Hus;
import org.framestudy.sh.o2omag.dao.IHusbandDao;
import org.framestudy.sh.o2omag.service.IHusbandService;
import org.springframework.stereotype.Service;

@Service
public class HusbandServiceImpl implements IHusbandService {

	@Resource
	private IHusbandDao husbandDaoImpl;
	
	@Override
	public void saveHusband(Hus hus) {
		// TODO Auto-generated method stub
		husbandDaoImpl.saveHusband(hus);
	}

	@Override
	public Hus getHusbandById(Long id) {
		// TODO Auto-generated method stub
		return husbandDaoImpl.getHusbandById(id);
	}

	@Override
	public void updateHusband(Hus hus) {
		// TODO Auto-generated method stub
		husbandDaoImpl.updateHusband(hus);
	}

	@Override
	public void deleteHusband(Hus hus) {
		// TODO Auto-generated method stub
		husbandDaoImpl.deleteHusband(hus);
	}

	@Override
	public List<?> findHusbandByWifeName(String wifeName) {
		// TODO Auto-generated method stub
		return husbandDaoImpl.findHusbandByWifeName(wifeName);
	}

}
