package com.pwskills.kalyan.service;

import java.sql.SQLException;

import com.pwskills.dto.Student;

public interface IStudentService {
	//C-> create 
	//U-> update
	//R-> Read
	//D->Delete
	
	public int insertRecord(Student student) throws SQLException;
}
