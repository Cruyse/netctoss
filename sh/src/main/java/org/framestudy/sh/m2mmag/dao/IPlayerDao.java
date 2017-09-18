package org.framestudy.sh.m2mmag.dao;

import java.util.List;

import org.framestudy.sh.beans.PlayerBean;

public interface IPlayerDao {
	
	public List<?> findPlayerByGameName(String name);
	
	public void playerChooseGames(PlayerBean player);

}
