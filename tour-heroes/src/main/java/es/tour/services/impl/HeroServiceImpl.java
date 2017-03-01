package es.tour.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import es.tour.dataaccess.HeroDao;
import es.tour.model.Hero;
import es.tour.services.HeroService;

@Service("heroService")
public class HeroServiceImpl implements HeroService{

	private HeroDao heroDao;
	
	@Autowired
	public HeroServiceImpl(HeroDao heroDao){
		this.heroDao = heroDao;
	}
	
	public void removeHero(long id) {
		heroDao.remove(id);
	}

	public Hero newHero(Hero hero) {
		return heroDao.insert(hero);
	}

	public Hero updateHero(Hero hero) {
		return heroDao.update(hero);
	}

	public Hero find(long id) {
		return heroDao.find(id);
	}

	public List<Hero> findAll() {
		return heroDao.findAll();
	}

}
