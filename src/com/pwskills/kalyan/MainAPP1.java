package com.pwskills.kalyan;

import java.sql.SQLException;
import java.util.Scanner;

import com.pwskills.dto.Student;
import com.pwskills.kalyan.controller.IStudentController;
import com.pwskills.kalyan.factory.StudentControllerFactory;

public class MainAPP1 {

	public static void main(String[] args) {
		//this is a UI code which I will give to the end user
		IStudentController controller = StudentControllerFactory.getStudentIStudentControllerObj();
		Student student = new Student();
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Enter the sid :: ");
		int sid = scanner.nextInt();

		System.out.print("Enter the sname :: ");
		String sname = scanner.next();
		

		System.out.print("Enter the sage :: ");
		int sage = scanner.nextInt();

		System.out.print("Enter the saddress :: ");
		String saddress = scanner.next();
		
		student.setSid(sid);
		student.setSname(sname);
		student.setSaddress(saddress);
		student.setSage(sage);
		
		
		
		try {
			System.out.println("No. of recorded inserted " + controller.insertRecord(student));;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("Insertion failure");
		}
		scanner.close();
	}

}
