package com.pwskills.kalyan.repository;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import com.pwskills.dto.Student;
import com.pwskills.utility.JDBCUtil;

public class StudentRepoImpl implements IStudentRepo {
	
	private static Connection connection = null;
	
	static {
		try {
			connection = JDBCUtil.getDBConnection();
		}catch(IOException e) {
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public int insertRecord(Student student)throws SQLException {
		Statement statement = null;
		if(connection != null) {
			 statement = connection.createStatement();
			
		}
		
		String sqlInsertQuery = null;
		
		Integer sid = student.getSid();
		
		String sname = student.getSname();
		
		Integer sage = student.getSage();
		
		String saddress = student.getSaddress();
		
		
		
		
		//sqlInsertQuery = "insert into student(`sid`,`sname`,`sage`,`saddress`) values("+ sid + sname + sage + saddress + ")";
		
		//using the String.format style
		
		sqlInsertQuery = String.format("INSERT INTO student VALUES (%d,'%s',%d,'%s') ", sid,sname,sage,saddress);
		
		if(statement != null) {
			return  statement.executeUpdate(sqlInsertQuery);
		}
		
		return 0;
	}

}
