package p11;

import java.util.List;
import java.util.Map;

public class ClassInfoService {
	
	public List<Map<String, String>> getClassInfo(Map<String, String> parm){
		ClassInfoRepository clInfo = new ClassInfoRepository();
		return clInfo.getClassInfoList(parm);
	}
	
	public int insertClassInfo(Map<String, String> parm){
		ClassInfoRepository clInfo = new ClassInfoRepository();
		return clInfo.insertClassInfoList(parm);
	}
}
