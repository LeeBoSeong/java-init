package p10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class UpdateTest {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3307/kd","root","kd1824java");
			String sql = "UPDATE user_info\r\n"
					+ "SET UI_NAME = '이원기짱멋져'\r\n"
					+ "WHERE UI_NUM = 14";
			Statement stmt = con.createStatement();
			int resultCnt = stmt.executeUpdate(sql);
			System.out.println("행 갯수 : " + resultCnt);		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
}
