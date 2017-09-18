package org.framestudy.sh.m2mmag.dao.impl;

import java.util.List;

import org.framestudy.sh.BaseDao;
import org.framestudy.sh.beans.PlayerBean;
import org.framestudy.sh.m2mmag.dao.IPlayerDao;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;
@Repository
public class PlayerDaoImpl extends BaseDao implements IPlayerDao {

	@Override
	public List<?> findPlayerByGameName(String name) {
		// TODO Auto-generated method stub
		String hql = "from PlayerBean as p left join fetch p.games as g where g.gameName like CONCAT(?,'%')";
		Query query = getSession().createQuery(hql);
		query.setString(0, name);
		return query.list();
	}

	@Override
	public void playerChooseGames(PlayerBean player) {
		// TODO Auto-generated method stub
		getSession().saveOrUpdate(player);
	}

}
