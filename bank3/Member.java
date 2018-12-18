package bank3;

public class Member {
	String name, ssn, id, pw;
	Member(String name, String ssn, String id, String pw){
		this.name = name;
		this.ssn = ssn;
		this.id = id;
		this.pw = pw;
	}
	public String info() {
		return String.format("[회원정보]\n"
				+ "이름 %s\n"
				+ "주민번호 %s\n"
				+ "아이디 %s\n"
				+ "비밀번호 %s",name, ssn, id, pw );
	}

}
