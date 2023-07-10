package p11;

import java.util.List;
import java.util.Map;

public class UserInfoService {
	
	public List<Map<String, String>> getUserInfoList(Map<String,String> parm){
		UserInfoRepository uiRepo = new UserInfoRepository();

		return uiRepo.getUserInfoList(parm);
	}
	
	public int insertUserInfo(Map<String, String> userInfo) {
		UserInfoRepository uiRepo = new UserInfoRepository();
		return uiRepo.insertUserInfo(userInfo);
	}
	
	public int deleteUserInfo(Map<String, String> userInfo) {
		UserInfoRepository uiRepo = new UserInfoRepository();
		return uiRepo.deleteUserInfo(userInfo);
	}
}
