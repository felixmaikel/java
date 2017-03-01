package es.tour.dataaccess.impl;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import es.tour.model.Hero;

public class HeroRowMapper implements RowMapper<Hero> {

	private static final String ID_COLUMN = "ID";
	private static final String NAME_COLUMN = "NAME";
	
	public Hero mapRow(ResultSet rs, int rowNum) throws SQLException {
		final Hero hero = new Hero();
		hero.setId(rs.getLong(ID_COLUMN));
		hero.setName(rs.getString(NAME_COLUMN));
		
		return hero;
	}

}
