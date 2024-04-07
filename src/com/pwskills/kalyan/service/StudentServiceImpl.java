package com.pwskills.kalyan.service;

import java.sql.SQLException;

import com.pwskills.dto.Student;
import com.pwskills.kalyan.factory.StudentRepoFactory;
import com.pwskills.kalyan.repository.IStudentRepo;


public class StudentServiceImpl implements IStudentService {
	
	@Override
	public int insertRecord(Student student) throws SQLException {
		IStudentRepo  repo = StudentRepoFactory.getStudentRepo();
		return repo.insertRecord(student);
		
		
	}

}
