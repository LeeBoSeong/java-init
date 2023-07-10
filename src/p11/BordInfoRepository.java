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

public class BordInfoRepository {

	public List<Map<String, String>> getBoardInfoList() {
		List<Map<String, String>> boardInfoList = new ArrayList<>();
		Connection con = DBCon.getCon();
		try {
			Statement stmt = con.createStatement();
			String sql = "SELECT * FROM BOARD_INFO";
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				Map<String, String> boards = new HashMap<>();
				boards.put("biNum", rs.getString("BI_NUM"));
				boards.put("biTitle", rs.getString("BI_TITLE"));
				boards.put("biContent", rs.getString("BI_CONTENT"));
				boards.put("biWriter", rs.getString("BI_WRITER"));
				boards.put("biCredat", rs.getString("BI_CREDAT"));
				boards.put("biCnt", rs.getString("BI_CNT"));
				boardInfoList.add(boards);
			}
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return boardInfoList;
	}

	public int updateBoardInfo(Map<String, String> boardInfo) {
		Connection con = DBCon.getCon();

		try {
			Statement stmt = con.createStatement();
			if (boardInfo != null) {
				String sql = "UPDATE BOARD_INFO SET ";
				if (boardInfo.get("biTitle") != null) {
					sql += " BI_TITLE ='" + boardInfo.get("biTitle") + "',";
				}
				if (boardInfo.get("biContent") != null) {
					sql += " BI_CONTENT ='" + boardInfo.get("biContent") + "',";
				}
				if (boardInfo.get("biWriter") != null) {
					sql += " BI_WRITER ='" + boardInfo.get("biWriter") + "',";
				}
				if (boardInfo.get("biCnt") != null) {
					sql += " BI_CNT ='" + boardInfo.get("biCnt") + "',";
				}
				sql = sql.substring(0, sql.length() - 1);
				sql += " WHERE BI_NUM =" + boardInfo.get("biNum");
				return stmt.executeUpdate(sql);
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
		return 0;
	}

	public int insertBoardList(Map<String, String> boardInfo) {
		Connection con = DBCon.getCon();

		try {
			Statement stmt = con.createStatement();
			String sql = "INSERT INTO BOARD_INFO(BI_TITLE, BI_CONTENT, BI_WRITER, BI_CREDAT, BI_CNT)";
			sql += " VALUES('" + boardInfo.get("biTitle") + "','" + boardInfo.get("biContent") + "','"
					+ boardInfo.get("biWriter") + "','" + boardInfo.get("biCredat") + "','" + boardInfo.get("biCnt")
					+ "')";
			ResultSet rs = stmt.executeQuery(sql);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return 0;
	}

	public int deleteBoardList(Map<String, String> boardInfo) {
		Connection con = DBCon.getCon();
		try {
			Statement stmt = con.createStatement();
			String sql = "DELETE FROM BOARD_INFO WHERE BI_NUM = " + boardInfo.get("biNum");
			ResultSet rs = stmt.executeQuery(sql);
		} catch (SQLException e) {

			e.printStackTrace();
		}
		return 0;
	}

	public static void main(String[] args) {
		BordInfoRepository bordInfoRepository = new BordInfoRepository();
		Map<String, String> parm = new HashMap<>();
		List<Map<String, String>> boradInfoList = bordInfoRepository.getBoardInfoList();
		for (Map<String, String> boardlist : boradInfoList) {
			System.out.println(boardlist);

			// insert
//			parm.put("biTitle", "명관이 정처기 필기 합격");
//			parm.put("biContent", "명관이 정처기 필기 합격기원합니다 아멘");
//			parm.put("biWriter", "이보성");
//			parm.put("biCredat", "2023-07-10-16-08");
//			parm.put("biCnt", "1");
//			int result = bordInfoRepository.insertBoardList(parm);
			//
			// delete
//			parm.put("biNum", "1");
//			int result = bordInfoRepository.deleteBoardList(parm);
//			System.out.println(result);
			//
		}
		Map<String, String> boardInfo = new HashMap<>();
		boardInfo.put("biNum", "2");
		boardInfo.put("biCnt", "3");
		int result = bordInfoRepository.updateBoardInfo(parm);
		System.out.println(result);
	}
}
