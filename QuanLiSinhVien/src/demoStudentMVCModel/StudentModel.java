package demoStudentMVCModel;

import java.sql.*;
import java.util.Date;
public class StudentModel {
	static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/student?useUnicode=true&characterEncoding=UTF-8";
	
	static final String USER = "root";
	static final String PASS = "123456789";
	static Connection conn = null;
	static Statement st = null;
	public static void ConnectToData() {
		try {
			Class.forName(JDBC_DRIVER);
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			st = conn.createStatement();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public ResultSet getData(){
		ResultSet rs = null;
		String sql = "select st.student_id, st.student_name, st.student_code, sti.address," 
				+ " sti.average_score, sti.date_of_birth from STUDENT st inner join STUDENT_INFO sti "
				+ "on st.student_id = sti.student_id";
		try {
			rs = st.executeQuery(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return rs;
	}
	public ResultSet getSearchingData(String id){
		ResultSet rs = null;
		String sql = "select st.student_id, st.student_name, st.student_code, sti.address," 
				+ " sti.average_score, sti.date_of_birth from STUDENT st inner join STUDENT_INFO sti "
				+ "on st.student_id = sti.student_id where st.student_id = " + id;
		try {
			rs = st.executeQuery(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
}
