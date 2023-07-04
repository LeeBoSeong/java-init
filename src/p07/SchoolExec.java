package p07;

public class SchoolExec {
	
	public static void main(String[] args) {
//		Object obj = new MiddelSchool();
//		MiddelSchool ms = (MiddelSchool)obj;
//		ms.name = "d";
//		ms.address = "wnthda";
//		ms.studentType = "중학생";
		
		School middleSchool = new MiddelSchool();
		middleSchool.name = "양주";
		School higSchool = new HighSchool();
		higSchool.name = "양주";
		School school = new School();
		school.name = "학교";
		
		School[] schools = new School[3];
		schools[0] = middleSchool;
		schools[1] = higSchool;
		schools[2] = school;
		
		for(int i = 0; i < schools.length; i++) {
			System.out.print(schools[i].name);
			if(schools[i] instanceof MiddelSchool) {
				MiddelSchool ms = (MiddelSchool)schools[i];
				ms.studentType = "중학교";
				System.out.println(ms.studentType);
			}else if(schools[i] instanceof HighSchool) {
				HighSchool hs = (HighSchool)schools[i];
				hs.studentType = "고등학교";
				System.out.println(hs.studentType);

			}else {
				System.out.println();
			}
		}
	}
}
