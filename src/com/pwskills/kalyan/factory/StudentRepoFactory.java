package com.pwskills.kalyan.factory;


import com.pwskills.kalyan.repository.IStudentRepo;
import com.pwskills.kalyan.repository.StudentRepoImpl;

public class StudentRepoFactory {
	
	//only one object should be created
	private static StudentRepoImpl studentRepo = null;
	
	static {
		
	}
	
	public static IStudentRepo getStudentRepo() {
		
		if(studentRepo == null) {
			studentRepo = new StudentRepoImpl();
		}

		return studentRepo;
		
	}

}
