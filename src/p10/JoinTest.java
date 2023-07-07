package p10;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class JoinTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("ID : ");
		String uiId = scan.nextLine();
		System.out.print("PASSWORD : ");
		String uiPwd = scan.nextLine();
		System.out.print("NAME : ");
		String uiName = scan.nextLine();
		System.out.print("AGE : ");
		String uiAge = scan.nextLine();
		

		try {
			Connection con = DBCon.getCon();
			String sql =  "INSERT INTO my_info1(MY_ID,MY_PWD,MY_NAME,MY_AGE)\r\n"
					+"VALUES( '"+uiId+"','"+uiPwd+"','"+uiName+"','"+uiAge+"')";
			Statement stmt = con.createStatement();
			int resultCnt = stmt.executeUpdate(sql);
			System.out.println("행 갯수 : " + resultCnt);
		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}
