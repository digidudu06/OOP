package phone;
import javax.swing.JOptionPane;
public class Main {
	public static void main(String[] args) {
		PhoneBean phone = null;
		CelPhoneBean celPhone = null;
		IPhoneBean iPhone = null;
		AndroidPhoneBean aPhone = null;
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료\n"
					+ "1.일반폰\n"
					+ "2.휴대폰\n"
					+ "3.아이폰\n"
					+ "4.안드로이드 폰"
					)) {
			case "0": JOptionPane.showMessageDialog(null, "종료");return;
			case "1":
				phone = new PhoneBean();
				String kind = JOptionPane.showInputDialog("전화기 종류");
				String company = JOptionPane.showInputDialog("어느 회사 제품"); //금성
				String call = JOptionPane.showInputDialog("통화 내용");
				phone.setCall(call);
				phone.setCompany(company);
				phone.setKind(kind);
				JOptionPane.showMessageDialog(null, phone.toString());
				// 종류 : 일반 전화기 
				// 제조사 : 금성
				// 통화 내용 : 안녕
				break;
			case "2":
				celPhone = new CelPhoneBean();
				kind = JOptionPane.showInputDialog("전화기 종류");
				company = JOptionPane.showInputDialog("어느 회사 제품");
				String move = JOptionPane.showInputDialog("이동가능");
				call = JOptionPane.showInputDialog("통화 내용");
				celPhone.setCall(call);
				celPhone.setCompany(company);
				celPhone.setKind(kind);
				celPhone.setMove(move);
				JOptionPane.showMessageDialog(null,celPhone.toString());
				//종류 : 휴대폰
				//제조사 : 모토로라
				//이동가능 : 가능
				//통화내용  : 안녕
				break;
			case "3": 
				iPhone = new IPhoneBean();
				kind = JOptionPane.showInputDialog("전화기 종류");
				company = JOptionPane.showInputDialog("어느 회사 제품");
				move = JOptionPane.showInputDialog("이동가능");
				String data = JOptionPane.showInputDialog("검색");
				iPhone.setData(data);
				iPhone.setCompany(company);
				iPhone.setKind(kind);
				iPhone.setMove(move);
				JOptionPane.showMessageDialog(null,iPhone.toString());
				//종류 : 아이폰
				//제조사 : 애플
				//이동성 : 가능
				//검색 : 노래검색
				break;
			case "4": 
				aPhone = new AndroidPhoneBean();
				kind = JOptionPane.showInputDialog("전화기 종류");
				company = JOptionPane.showInputDialog("어느 회사 제품");
				move = JOptionPane.showInputDialog("이동가능");
				String display = JOptionPane.showInputDialog("몇 인치");
				data = JOptionPane.showInputDialog("검색");
				aPhone.setData(data);
				aPhone.setCompany(company);
				aPhone.setKind(kind);
				aPhone.setMove(move);
				aPhone.setDisplay(display);
				JOptionPane.showMessageDialog(null,aPhone.toString());
				//종류 : 아이폰
				//제조사 : 애플
				//이동성 : 가능
				//디스플레이 : 6인치
				//검색 : 노래검색
				break;
			}
		}
	}
}
