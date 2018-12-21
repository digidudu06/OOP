package bankPrec;

public class MemberBean {
	private String id, name, ssn, pass; //인스턴스 변수(=멤버 변수) 메모리에 저장되는 변수라서 private 접근제어자로 은닉화하여 보이지 않게한다.
	//생성자는 디폴트로 존재한다.
	//멤버 변수를 은닉화 하여 세터와 게터를 만들어줌 
	public void setPass(String pass) {
		this.pass = pass; //read
	}
	public String getPass() {
		return pass;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	//setSsn을 없앰으로써 ssn을 바꿀 수 없게 함
	public String getSsn() {
		return ssn;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getId() {
		return id;	// getter에서는 외부에서 받아오는 값이 없으므로 this.을 빼도 된다 
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() { //getter 게터
		return name; //read
	}
	/*
	 * 회원정보 보여주기
	 * */
	public String toString() { //info보다는 toString이라고 함
		return String.format("[회원 정보]\n"
				+ "아이디 %s\n"
				+ "이름 %s\n"
				+ "주민번호 %s\n"
				+ "비밀번호 %s", id, name, ssn, pass);
	}

}
