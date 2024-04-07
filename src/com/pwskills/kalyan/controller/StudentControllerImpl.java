package com.pwskills.kalyan.controller;

import java.sql.SQLException;

import com.pwskills.dto.Student;
import com.pwskills.kalyan.factory.StudentServiceFactory;
import com.pwskills.kalyan.service.IStudentService;

public class StudentControllerImpl implements IStudentController {

	@Override
	public int insertRecord(Student student) throws SQLException {

		//asking the factory to give the object of the implementation class of the service layer
		
		IStudentService service =  StudentServiceFactory.getStudentService();
		
		return service.insertRecord(student);
		
		//this is the custom file that i was talking obout

	
	}

}
