package bank2;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Account account = null;
		Member member = null;
		while(true) {
			switch(JOptionPane.showInputDialog
					("0.종료\n"
					+ "1.회원가입\n"
					+ "2.계좌개설\n"
					+ "3.계좌정보\n")) {
			case "0": JOptionPane.showMessageDialog(null, "종료"); return;
			case "1":
				String name = JOptionPane.showInputDialog("이름 입력");
				String ssn = JOptionPane.showInputDialog("주민번호 입력");
				String id = JOptionPane.showInputDialog("ID 입력");
				String pw = JOptionPane.showInputDialog("비밀번호 입력");
				member = new Member(name, ssn, id, pw);
				JOptionPane.showMessageDialog(null, member.info());
				break;
			case "2":
				account = new Account(0);
				break;
			case "3":
				JOptionPane.showMessageDialog(null, account.open(member.name));
				break;
			}
			
		}
	}

}
