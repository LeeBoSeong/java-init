package p11;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class UserInfoController {
	
	public List<Map<String,String>> getUserInfoList(Map<String,String> parm){
		UserInfoService uiService = new UserInfoService();
		
		return uiService.getUserInfoList(parm);
	}
	
	public int insertUserInfo(Map<String, String> userinfo) {
		UserInfoService uiService = new UserInfoService();
		return uiService.insertUserInfo(userinfo);
	}
	
	public int deleteUserInfo(Map<String, String> userinfo){
		UserInfoService uiService = new UserInfoService();
		return uiService.deleteUserInfo(userinfo);
	}
	
	public static void main(String[] args) {
		UserInfoController uinfoController = new UserInfoController();
		Map<String, String> parm = new HashMap<>();
		parm.put("uiName", "동");
//		parm.put("uiNum", "12");
		List<Map<String,String>> userInfoList =	uinfoController.getUserInfoList(parm);
		for(Map<String, String> userInfo : userInfoList) {
			System.out.print("번호 : "+userInfo.get("uiNum")+"|| 이름은 : "+userInfo.get("uiName")+"|| 아이디 : "+userInfo.get("uiId")+"|| 비밀번호 : "+ userInfo.get("uiPwd"));
		}
		
		parm.put("uiName", "이바보");
		parm.put("uiId", "cs");
		parm.put("uiPwd", "1234");
		int result = uinfoController.insertUserInfo(parm);
		System.out.println("결과 : " + result);

		parm.put("uiNum", "20");
		int result1 = uinfoController.deleteUserInfo(parm);
		System.out.println("결과 : " + result1);
	}
}
