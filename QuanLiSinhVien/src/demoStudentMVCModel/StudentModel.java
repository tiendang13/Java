package demoStudentMVCModel;

import java.sql.*;
import java.util.Date;
public class StudentModel {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/student?useUnicode=true&characterEncoding=UTF-8";
	
	static final String USER = "root";
	static final String PASS = "123456789";
	
	public static Student student = new Student();
	public static void ConnectToData() {
		Connection conn = null;
		Statement st = null;
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			st = conn.createStatement();
			String sql = "select st.student_id, st.student_name, st.student_code, sti.address," 
					+ " sti.average_score, sti.date_of_birth from STUDENT st inner join STUDENT_INFO sti "
					+ "on st.student_id = sti.student_id";
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()){
				int id = rs.getInt("student_id");
				String name = rs.getString("student_name");
				String code = rs.getString("student_code");
				double averageScore = rs.getDouble("average_score");
				String address = rs.getString("address");;
				Date dateOfBirth = rs.getDate("date_of_birth");

				student.setId(id);
				student.setName(name);
				student.setCode(code);
				student.setAverageScore(averageScore);
				student.setAddress(address);
				student.setDateOfBirth(dateOfBirth);
				
				System.out.println(student.getName());
				System.out.println(student.getDateOfBirth());
			}
			rs.close();
			st.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}

