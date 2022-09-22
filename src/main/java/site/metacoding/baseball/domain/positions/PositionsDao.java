package site.metacoding.baseball.domain.positions;

import java.util.List;

import site.metacoding.baseball.domain.reasons.Reasons;

public interface PositionsDao {
	public void insert(Positions positions);
	public List<Positions> findAll();
	public void deleteById(Integer id);
	
//	public Positions findById(Integer id);
//	public void update(Positions positions);
}
