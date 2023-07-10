package p11;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import p10.DBCon;

public class ClassInfoRepository {
	public List<Map<String, String>> getClassInfoList(Map<String, String> parm){
		List<Map<String, String>> clInfoList = new ArrayList<>();
		Connection con = DBCon.getCon();
		
		try {
			Statement stmt = con.createStatement();
			String sql = "SELECT * FROM CLASS_INFO; ";
			if(parm != null) {
				if(parm.get("ciName") != null) {
					sql += " WHERE CI_NAME LIKE '%" + parm.get("ciName") + "%'";
				}
			}
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				Map<String, String> clInfo = new HashMap<>();
				clInfo.put("ciNum",rs.getString("CI_NUM"));
				clInfo.put("ciName",rs.getString("CI_NAME"));
				clInfo.put("ciDesc",rs.getString("CI_DESC"));
				clInfoList.add(clInfo);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return clInfoList;
	}
	
	public int insertClassInfoList(Map<String, String> parm){
		Connection con = DBCon.getCon();
		Statement stmt;//여기부터 해야댐
		
		return 0;
	}
}
