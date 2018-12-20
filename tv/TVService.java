package tv;

public class TVService {
	public void power() {}
	public void channelUp() {}
	public void channeldown() {}
	public String spec(String brand, String color, int price) {
		return String.format("브랜드 이름 : %s\n"
				+ "색상 : %s\n"
				+ "가격 : %s", brand, color, price);
	}

}
