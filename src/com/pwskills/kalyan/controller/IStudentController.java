package com.pwskills.kalyan.controller;
import java.sql.SQLException;

import com.pwskills.dto.Student;
public interface IStudentController {
	//C-> create 
	//U-> upda te
	//R-> Read
	//D->Delete
	
	public int insertRecord(Student student) throws SQLException;
}
