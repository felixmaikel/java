package es.tour.dataaccess.impl;

import java.util.List;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

import es.tour.dataaccess.HeroDao;
import es.tour.model.Hero;

public class HeroDaoImpl extends JdbcDaoSupport implements HeroDao{

	public void remove(long id) {
		final String sql = "DELETE FROM HERO WHERE ID = ?";
		final Object [] args = new Object[]{id};
		this.getJdbcTemplate().update(sql, args);
	}

	public Hero insert(Hero hero) {
		final String sql = "INSERT INTO HERO (NAME) VALUES (?)";
		final Object [] args = new Object[]{hero.getName()};
		this.getJdbcTemplate().update(sql, args);
		return findLast();
	}

	private Hero findLast() {
		final String sql = "SELECT * FROM HERO ORDER BY ID DESC";
		final List<Hero> list = this.getJdbcTemplate().query(sql, new HeroRowMapper());
		return list.get(0);
	}

	public Hero update(Hero hero) {
		final String sql = "UPDATE HERO SET NAME = ? WHERE ID = ?";
		final Object [] args = new Object[]{hero.getName(), hero.getId()};
		this.getJdbcTemplate().update(sql, args);
		return hero;
	}

	public Hero find(long id) {
		final String sql = "SELECT * FROM HERO WHERE ID = ?";
		final Object [] args = new Object[]{id};
		final Hero hero = this.getJdbcTemplate().queryForObject(sql, args, new HeroRowMapper());
		return hero;
	}

	public List<Hero> findAll() {
		final String sql = "SELECT * FROM HERO ORDER BY ID ASC";
		final List<Hero> heroes = this.getJdbcTemplate().query(sql, new HeroRowMapper());
		return heroes;
	}

}
