package p10;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertTest {
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		Connection con;
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost:3307/kd","root","kd1824java");
			Statement stmt = con.createStatement();
			String sql = "INSERT INTO user_info(UI_ID, UI_PWD, UI_NAME)\r\n"
					+ "VALUES('TEST2','TEST1','연습1')";
			int resultCnt = stmt.executeUpdate(sql);
			System.out.println("행 갯수 : " + resultCnt);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
