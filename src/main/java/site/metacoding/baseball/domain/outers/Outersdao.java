package site.metacoding.baseball.domain.outers;

import java.util.List;

import site.metacoding.baseball.domain.positions.Positions;

public interface Outersdao {
	public void insert(Outers outers);
	public List<Outers> findAll();
	public void deleteById(Integer id);
	
//	public Outers findById(Integer id);
//	public void update(Outers outers);
}
