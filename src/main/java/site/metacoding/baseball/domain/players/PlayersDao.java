package site.metacoding.baseball.domain.players;

import java.util.List;

import site.metacoding.baseball.domain.positions.Positions;

public interface PlayersDao {
	public void insert(Players players);
	public List<Players> findAll();
	public void deleteById(Integer id);
	
//	public Players findById(Integer id);
//	public void update(Players players);
}
