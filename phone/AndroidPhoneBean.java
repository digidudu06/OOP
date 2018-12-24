package phone;

public class AndroidPhoneBean extends IPhoneBean {	//커서의 방향
	private String display;
	
	public void setDisplay(String display) {
		this.display = display;
	}
	public String getDisplay() {
		return display;
	}
	public String toString() {
		return String.format("종류 : %s\n"
				+ "제조사 : %s\n"
				+ "이동가능 : %s\n"
				+ "큰 화면 : %s\n"
				+ "검색 : %s",
				super.getKind(), getCompany(), getMove(), display, getData());
	}
}
