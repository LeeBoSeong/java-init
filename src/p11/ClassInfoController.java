package p11;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClassInfoController {
	
	public List<Map<String, String>> getClassInfoList(Map<String, String> parm){
		ClassInfoService clInfo = new ClassInfoService();
		return clInfo.getClassInfo(parm);
	}
	
	public int insertClassInfoList(Map<String, String> parm){
		ClassInfoService clInfo = new ClassInfoService();
		return clInfo.insertClassInfo(parm);
	}
	
	public static void main(String[] args) {
		ClassInfoController clInfoControl = new ClassInfoController();
		Map<String, String> parm = new HashMap<>();
		parm.put("ciName", "보");
		List<Map<String, String>> clInfoList = clInfoControl.getClassInfoList(parm);
		for(Map<String, String> cliInfo : clInfoList) {
			System.out.print("번호 : "+cliInfo.get("ciNum")+"|| 이름은 : "+cliInfo.get("ciName")+"|| 아이디 : "+cliInfo.get("ciDesc"));
		}
	}
}
