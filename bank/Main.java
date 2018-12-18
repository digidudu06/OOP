package bank;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Account a = null;
		Member m = null;
		while(true) {
			switch (JOptionPane.showInputDialog("0.종료\n"
					+ "1.회원가입 2.계좌 개통 3.계좌 보기")) {
			
			case "0":JOptionPane.showMessageDialog(null, "종료"); return;
			case "1": 
				String id = JOptionPane.showInputDialog("ID 등록");
				String name = JOptionPane.showInputDialog("이름 입력");
				String ssn = JOptionPane.showInputDialog("주민번호 입력");
				String pw = JOptionPane.showInputDialog("비밀번호 입력");
				m = new Member(id, name, ssn, pw);
				String info = m.info();
				JOptionPane.showMessageDialog(null, info);
				break;
			case "2":
				a = new Account(0);
				JOptionPane.showMessageDialog(null, "계좌 생성^_~");
				break;
			case "3":
				String open = a.open(m.name);
				JOptionPane.showMessageDialog(null, open);
				//파라미타오 아규먼트는 타입과 개수가 같아야한다.
				break;
				
			}
		}
	}

}
