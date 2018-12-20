package tv;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		TVService tvService = new TVService();
		TVbean tv = null;
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료\n"
					+ "1.TV 스팩입력\n"
					+ "2.TV 정보보기\n"
					+ "3.TV 작동\n"
					)) {
			case "0": JOptionPane.showMessageDialog(null, "종료");return;
			case "1": 
//				brand, color, price 입력함;
//				TV 브랜드
//				TV 색상
//				가격
				String brand = JOptionPane.showInputDialog("브랜드 입력");
				String color = JOptionPane.showInputDialog("색상 입력");
				String price = JOptionPane.showInputDialog("가격 입력");
				tv = new TVbean();
				tv.setBrand(brand);
				tv.setColor(color);
				tv.setPrice(Integer.parseInt(price));
				break;
			case "2": 
				//구입 TV의 스팩
				JOptionPane.showMessageDialog(null, tvService.spec(tv.getBrand(), tv.getColor(), tv.getPrice()));
				break;
			case "3": 
				
				break;
			}
			
		}
	}
}
