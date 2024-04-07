package com.pwskills.kalyan.factory;

import com.pwskills.kalyan.controller.IStudentController;
import com.pwskills.kalyan.controller.StudentControllerImpl;

public class StudentControllerFactory {
	
	private static IStudentController  controller= null;
	
	public static IStudentController getStudentIStudentControllerObj() {
		
		if(controller == null) {
			controller =  new StudentControllerImpl();
		}
		return controller;
	}
	
}
