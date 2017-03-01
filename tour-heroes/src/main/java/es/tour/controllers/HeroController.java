package es.tour.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import es.tour.model.Hero;
import es.tour.services.HeroService;

@RestController
@CrossOrigin
@RequestMapping("/heroes")
public class HeroController {

	private HeroService heroService;
	
	@Autowired
	public HeroController(HeroService heroService) {
		this.heroService = heroService;
	}
	
	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Hero> findAll(){
		return heroService.findAll();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public Hero find(@PathVariable long id){
		return heroService.find(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Hero newHero(@RequestBody Hero hero) {
		return heroService.newHero(hero);
	}
	
	@RequestMapping(method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Hero updateHero(@RequestBody Hero hero) {
		return heroService.updateHero(hero);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void removeHero(@PathVariable long id) {
		heroService.removeHero(id);
	}
}
