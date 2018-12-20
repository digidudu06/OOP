package card;

public class CardBean {
	String cardKind, cardNum;
	public void setCardKind(String cardKind) {
		this.cardKind = cardKind;
	}
	public String getCarKind() {
		return cardKind;
	}
	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}
	public String getCardNum() {
		return cardNum;
	}
	@Override
	public String toString() {
		return String.format("카드 종류 : %s\n"
				+ "카드 번호 : %s", cardKind, cardNum);
	}

}
