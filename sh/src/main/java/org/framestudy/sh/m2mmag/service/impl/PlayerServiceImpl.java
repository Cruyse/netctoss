package org.framestudy.sh.m2mmag.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.framestudy.sh.beans.PlayerBean;
import org.framestudy.sh.m2mmag.dao.IPlayerDao;
import org.framestudy.sh.m2mmag.service.IPlayerService;
import org.springframework.stereotype.Service;
@Service
public class PlayerServiceImpl implements IPlayerService {

	@Resource
	private IPlayerDao playerDaoImpl;
	
	@Override
	public void playerChooseGames(PlayerBean player) {
		// TODO Auto-generated method stub
		playerDaoImpl.playerChooseGames(player);
	}

	@Override
	public List<?> findPlayerByGameName(String name) {
		// TODO Auto-generated method stub
		return playerDaoImpl.findPlayerByGameName(name);
	}

}
