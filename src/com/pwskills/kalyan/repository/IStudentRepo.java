package com.pwskills.kalyan.repository;

import java.sql.SQLException;

import com.pwskills.dto.Student;

public interface IStudentRepo {
	public int insertRecord(Student student)throws SQLException;
}
