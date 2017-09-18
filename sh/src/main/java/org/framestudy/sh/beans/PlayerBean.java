package org.framestudy.sh.beans;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="t_player")
public class PlayerBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1021054509044053037L;
	@Id
	@Column(name="id")
	@GenericGenerator(name="hibernate.identity",strategy="identity")
	@GeneratedValue(generator="hibernate.identity")
	private Long id;
	
	@Column(name="player_name",length=20)
	private String playerName;
	
	@ManyToMany(fetch=FetchType.LAZY,cascade=CascadeType.REMOVE)
	@JoinTable(name="t_player_game",joinColumns=@JoinColumn(name="fk_player_id"),
	inverseJoinColumns=@JoinColumn(name="fk_game_id"))
	private Set<GameBean> games;
	public PlayerBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public Set<GameBean> getGames() {
		return games;
	}
	public void setGames(Set<GameBean> games) {
		this.games = games;
	}
	@Override
	public String toString() {
		return "PlayerBean [id=" + id + ", playerName=" + playerName + ", games=" + games + "]";
	}
}
