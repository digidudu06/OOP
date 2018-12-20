package bank01;

public class Member {
	String id, name, ssn, pass; //인스턴스 변수(=멤버 변수)
	Member(String id, String name, String ssn, String pass){
		this.id = id;
		this.name = name;
		this.ssn = ssn;
		this.pass = pass;
	}
	/*
	 * 회원정보 보여주기
	 * */
	public String info() {
		return String.format("[회원 정보]\n"
				+ "아이디 %s\n"
				+ "이름 %s\n"
				+ "주민번호 %s\n"
				+ "비밀번호 %s", id, name, ssn, pass);
	}

}
