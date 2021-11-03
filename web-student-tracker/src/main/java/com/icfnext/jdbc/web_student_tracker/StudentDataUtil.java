/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.icfnext.jdbc.web_student_tracker;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 *
 * @author 55683
 */
public class StudentDataUtil {

	@Resource(name = "jdbc/web_student_tracker")
	private static DataSource dataSource;

	public StudentDataUtil(DataSource theDataSource) {
		dataSource = theDataSource;
	}

	@SuppressWarnings({ "null" })
	public static List<Student> getStudents() throws Exception {

		List<Student> students = new ArrayList<>();

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		try {
			conn = dataSource.getConnection();

			String sql = "select * from student";

			stmt = conn.createStatement();

			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				int id = rs.getInt("id");
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				String email = rs.getString("email");
				// out.println(firstName +" - "+lastName+" - "+email);
				Student tempStudent = new Student(id, firstName, lastName, email);
				students.add(tempStudent);
			}
		} finally {
			rs.close();
			stmt.close();
			conn.close();
		}
		return students;
	}

	void addStudent(Student theStudent) throws SQLException {
		// To change body of generated methods, choose Tools | Templates.

		Connection conn = null;
		PreparedStatement stmt = null;

		try {
			conn = dataSource.getConnection();

			String sql = "insert into student (id,first_name,last_name,email) values (?,?,?,?)";

			stmt = conn.prepareStatement(sql);

			stmt.setInt(1, theStudent.getId());
			stmt.setString(2, theStudent.getFirstName());
			stmt.setString(3, theStudent.getLastName());
			stmt.setString(4, theStudent.getEmail());

			stmt.execute();

		} finally {
			stmt.close();
			conn.close();
		}
	}

	public Student getStudents(String theStudentId) throws Exception {

		Student theStudent = null;

		Connection conn = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		int studentId;

		try {

			studentId = Integer.parseInt(theStudentId);

			conn = dataSource.getConnection();

			String sql = "select * from student where id=?";

			stmt = conn.prepareStatement(sql);

			stmt.setInt(1, studentId);

			rs = stmt.executeQuery();

			if (rs.next()) {
				String firstName = rs.getString("first_name");
				String lastName = rs.getString("last_name");
				String email = rs.getString("email");

				theStudent = new Student(studentId, firstName, lastName, email);

			} else {
				throw new Exception("Could not found student id : " + studentId);
			}

		} finally {
			rs.close();
			stmt.close();
			conn.close();
		}

		return theStudent;
	}

	public void updateStudent(Student theStudent) throws SQLException {

		Connection conn = null;
		PreparedStatement stmt = null;

		try {

			conn = dataSource.getConnection();

			String sql = "update student set first_name=?,last_name=?,email=? where id=?";

			stmt = conn.prepareStatement(sql);

			stmt.setString(1, theStudent.getFirstName());
			stmt.setString(2, theStudent.getLastName());
			stmt.setString(3, theStudent.getEmail());
			stmt.setInt(4, theStudent.getId());

			stmt.execute();

		} 
		finally {
			stmt.close();
			conn.close();
		}

	}

	public void deleteStudent(String theStudentId) throws Exception {
		
		Connection conn = null;
		PreparedStatement stmt = null;

		try {

			int studentId = Integer.parseInt(theStudentId);
						
			conn = dataSource.getConnection();

			String sql = "delete from student where id=?";

			stmt = conn.prepareStatement(sql);

			stmt.setInt(1, studentId);
			
			stmt.execute();

		} 
		finally {
			stmt.close();
			conn.close();
		}
		
	}
}