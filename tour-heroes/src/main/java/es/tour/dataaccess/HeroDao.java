package es.tour.dataaccess;

import java.util.List;

import es.tour.model.Hero;

public interface HeroDao {

	void remove(long id);
	Hero insert(Hero hero);
	Hero update(Hero hero);
	Hero find(long id);
	List<Hero> findAll();
}
