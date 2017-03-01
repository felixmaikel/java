package es.tour.services;

import java.util.List;

import es.tour.model.Hero;

public interface HeroService {

	void removeHero(long id);
	Hero newHero(Hero hero);
	Hero updateHero(Hero hero);
	Hero find(long id);
	List<Hero> findAll();
}
