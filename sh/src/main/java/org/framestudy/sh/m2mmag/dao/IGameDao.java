package org.framestudy.sh.m2mmag.dao;

import org.framestudy.sh.beans.GameBean;

public interface IGameDao {
	
	public void saveGame(GameBean game);
	
	public GameBean getGameBeanById(Long sid);
}
