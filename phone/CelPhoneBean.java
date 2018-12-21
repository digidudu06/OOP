package phone;

public class CelPhoneBean extends PhoneBean {
	private String move; //이동가능함
	public void setMove(String move) {
		this.move = move;
	}
	public String getMove() {
		return move;
	}
//	@Override
	public String toString() {
		return String.format("종류 : %s\n"
				+ "제조사 : %s\n"
				+ "이동가능 : %s\n"
				+ "통화 내용 : %s", getKind(), getCompany(), move, getCall());
	}

}
