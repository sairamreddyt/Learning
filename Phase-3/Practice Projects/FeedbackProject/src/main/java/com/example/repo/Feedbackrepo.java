package com.example.repo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.example.entity.Feedback;

@Repository
public class Feedbackrepo {
    @Autowired
	JdbcTemplate jdbcTemplate;
	
	public int save(Feedback feedback)
	{
		return jdbcTemplate.update("insert into feedback (Id,uname,rating,message) values(?,?,?,?)",
				new Object[] {feedback.getId(),feedback.getUname(),feedback.getRating(),feedback.getMessage()});
	}
    
	public List<Feedback> getProducts()
	{
		return jdbcTemplate.query("select * from feedback",
				new RowMapper<Feedback>(){

					public Feedback mapRow(ResultSet rs, int rowNum) throws SQLException {
						Feedback e=new Feedback();
						e.setId(rs.getInt(1));
						e.setUname(rs.getString(2));
						e.setRating(rs.getInt(3));
						e.setMessage(rs.getString(4));
						return e;
					}});
	}
}
