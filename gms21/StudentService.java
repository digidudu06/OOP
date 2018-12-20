package gms21;
import java.util.Random;
public class StudentService {
	
	public String makeHakbun() {
		Random random = new Random();
		String hakbun = random.nextInt(9000)+1000+"";
		return hakbun;
	}
	public String info(String ssn, String hakbun, String name, String pass) {
		return String.format("[학생 정보]\n"
				+ "주민번호 : %s\n"
				+ "학      번 : %s\n"
				+ "이      름 : %s\n"
				+ "비밀번호 : %s\n", ssn, hakbun, name, pass);
	}

}
