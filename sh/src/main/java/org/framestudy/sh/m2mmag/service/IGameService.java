package org.framestudy.sh.m2mmag.service;

import org.framestudy.sh.beans.GameBean;

public interface IGameService {

	public void saveGame(GameBean game);
	
	public GameBean getGameBeanById(Long id);
}
