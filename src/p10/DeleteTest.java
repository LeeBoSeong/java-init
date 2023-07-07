package p10;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteTest {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3307/kd","root","kd1824java");
			Statement stmt = con.createStatement();
			String sql = "DELETE FROM user_info WHERE UI_NUM = 10";
			int resultCnt = stmt.executeUpdate(sql);
			System.out.println("행 갯수 : " + resultCnt);		
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}
