package gms21;

public class SubjectService {
	
	public String info(String hakbun, String name, String subjName, String profName, int score) {
		return String.format("[과목 정보]\n"
				+ "학     번 : %s\n"
				+ "이     름 : %s\n"
				+ "과 목 명 : %s\n"
				+ "교수이릅 : %s 교수\n"
				+ "점     수 : %s 점", hakbun, name, subjName, profName, score);
	}
}
