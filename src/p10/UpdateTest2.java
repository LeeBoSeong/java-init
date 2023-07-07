package p10;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UpdateTest2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("ID : ");
		String uiId = scan.nextLine();
		System.out.print("수정 사항을 적으세요");
		System.out.print("PASSWORD : ");
		String uiPwd = scan.nextLine();

		

		try {
			Connection con = DBCon.getCon();
			String sql = "UPDATE my_info1\r\n"
					+ "SET MY_PWD = '"+uiPwd+"' WHERE MY_ID = '"+uiId+"'";
			Statement stmt = con.createStatement();
			int resultCnt = stmt.executeUpdate(sql);
			System.out.println("행 갯수 : " + resultCnt);
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}
