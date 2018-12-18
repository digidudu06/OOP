package bank2;

import javax.swing.JOptionPane;

public class Member {
	String name, ssn, id, pw;
	Member(String name, String ssn, String id, String pw){
		this.name = name;
		this.ssn = ssn;
		this.id = id;
		this.pw = pw;
	}
	public String info() {
		return String.format
				("[회원 정보]\n"
						+ "이    름: %s\n"
						+ "주민번호: %s\n"
						+ "아 이 디: %s\n"
						+ "비밀번호: %s", name, ssn, id, pw);
	}

}
