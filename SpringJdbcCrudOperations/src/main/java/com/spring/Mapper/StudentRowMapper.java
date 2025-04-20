package com.spring.Mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.bean.*;

//this class is created for the select query in the main method (app class) it's required for this.
public class StudentRowMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student std = new Student();

		std.setRollno(rs.getInt("std_roll"));
		std.setName(rs.getString("std_name"));
		std.setMarks(rs.getFloat("std_marks"));

		return std;
	}

}
