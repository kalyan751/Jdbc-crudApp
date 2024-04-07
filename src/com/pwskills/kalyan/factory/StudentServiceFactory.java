package com.pwskills.kalyan.factory;
import  com.pwskills.kalyan.service.*;
import com.pwskills.kalyan.service.IStudentService;
import com.pwskills.kalyan.service.StudentServiceImpl;
//import com.pwskills.kalyan.service.IStudentService;
public class StudentServiceFactory {

	private static IStudentService studentService = null;

	private StudentServiceFactory() {

	}

	public static IStudentService getStudentService() {
		if (studentService == null) {
			studentService = new StudentServiceImpl();
		}
		return studentService;
	}

}
