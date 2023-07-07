package p10;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class LogIn {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("ID : ");
		String uiId = scan.nextLine();
		System.out.print("PASSWORD : ");
		String uiPwd = scan.nextLine();
		

		try {
			Connection con = DBCon.getCon();
			String sql = "SELECT * FROM MY_INFO1 ";
			sql += "WHERE MY_ID = '" + uiId + "'AND MY_PWD ='" + uiPwd + "'";
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(sql);

			if (rs.next()) {
				String muiName = rs.getString("MY_NAME");

				System.out.println(muiName + "님의 로그인을 환영합니다");
			} else {
				System.out.println("로그인 정보가 맞지 않습니다");
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}
