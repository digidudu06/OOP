package card;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		CardService cardService = new CardService();
		CardBean card = null;
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료\n"
					+ "1.카드선택\n"
					+ "2.카드정보\n"
					)) {
			case "0": JOptionPane.showMessageDialog(null, "종료");return;
			case "1": 
//				카드종류
//				카드번호
				String cardKind = JOptionPane.showInputDialog("카드 종류");
				String cardNum = JOptionPane.showInputDialog("카드번호");
				card = new CardBean();
				card.setCardKind(cardKind);
				card.setCardNum(cardNum);
				break;
			case "2": 
				//제출한 카드의 스펙
				JOptionPane.showMessageDialog(null, card.toString() );
				break;
			}
			
		}
	}
}
