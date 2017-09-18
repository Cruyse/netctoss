package org.framestudy.sh.m2mmag.dao.impl;

import org.framestudy.sh.BaseDao;
import org.framestudy.sh.beans.GameBean;
import org.framestudy.sh.m2mmag.dao.IGameDao;
import org.springframework.stereotype.Repository;

@Repository
public class GameDaoImpl extends BaseDao implements IGameDao {

	@Override
	public void saveGame(GameBean game) {
		// TODO Auto-generated method stub
		getSession().saveOrUpdate(game);
	}

	@Override
	public GameBean getGameBeanById(Long id) {
		// TODO Auto-generated method stub
		return (GameBean) getSession().get(GameBean.class, id);
	}

}
