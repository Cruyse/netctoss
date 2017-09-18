package org.framestudy.sh.m2mmag.service;

import java.util.List;

import org.framestudy.sh.beans.PlayerBean;

public interface IPlayerService {

	public void playerChooseGames(PlayerBean player);
	
	public List<?> findPlayerByGameName(String name);
	
}
