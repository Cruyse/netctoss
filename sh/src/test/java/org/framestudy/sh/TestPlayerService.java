package org.framestudy.sh;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;

import org.framestudy.sh.beans.GameBean;
import org.framestudy.sh.beans.PlayerBean;
import org.framestudy.sh.m2mmag.service.IGameService;
import org.framestudy.sh.m2mmag.service.IPlayerService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class TestPlayerService {

	@Resource
	private IPlayerService playerServiceImpl;
	@Resource
	private IGameService gameServiceImpl;
	
	@Ignore
	public void findPlayerByGameName() {
		
		List<?> list = playerServiceImpl.findPlayerByGameName("L");
		System.out.println(list);
	}
	
	@Test
	public void playerChooseGames() {
		PlayerBean player = new PlayerBean();
		player.setPlayerName("22222");
		
		GameBean game2 = gameServiceImpl.getGameBeanById(2l);
		GameBean game1 = gameServiceImpl.getGameBeanById(1l);
		
		//设值(一定要注意，新增时才使用new HashSet)
		Set<GameBean> games = new HashSet<GameBean>();
		games.add(game1);
		games.add(game2);
		player.setGames(games);
		
		game1.getPlayers().add(player);
		game2.getPlayers().add(player);
		
		
		playerServiceImpl.playerChooseGames(player);
	}
	
	@Ignore
	public void getGameById() {
		GameBean game = gameServiceImpl.getGameBeanById(2l);
		System.out.println(game.getPlayers());
	}
	
	@Ignore
	public void saveGameBean() {
		GameBean game = new GameBean();
		game.setGameName("LOL");
		gameServiceImpl.saveGame(game);
	}
	
}
