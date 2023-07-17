package p10_alonStudy;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import p10.DBCon;

public class SelectTest {
	public static void main(String[] args) {
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			Connection con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/mytest","root","ll09130731");
			String sql = "SELECT * FROM TEST";
			Statement stmt = con.createStatement();
			ResultSet rs = 	stmt.executeQuery(sql);
			
			while(rs.next()) {
				String uiId = rs.getString("UI_ID");
				String uiPwd = rs.getString("UI_PWD");
				String uiName = rs.getString("UI_NAME");
				int uiNum = rs.getInt("UI_NUM");
				System.out.print("uiId : "+uiId+", ");
				System.out.print("uiPwd : "+uiPwd+", ");
				System.out.print("uiName : "+uiName+", ");
				System.out.println("uiNum : "+uiNum);
				
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}
