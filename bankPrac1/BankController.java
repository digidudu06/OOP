package bankPrac1;

import javax.swing.JOptionPane;

public class BankController { //은닉화

	public static void main(String[] args) {
		MemberBean member = null;
		AccountBean account = null;
		AccountService accountService = new AccountService();
		MemberService memberService = new MemberServiceImpl();
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료\n"
					+ "1.회원가입\n"
					+ "2.회원정보\n"
					+ "3.계좌개설\n"
					+ "4.계좌정보\n"
					+ "5.입금 \n"
					+ "6.출금\n"
					+ "7.이자계산\n"
					+ "8.비번변경")) {
			case "0": JOptionPane.showMessageDialog(null, "종료됩니다.");return;
			case "1":
				member = memberService.join(JOptionPane.showInputDialog("아이디 입력"),
						JOptionPane.showInputDialog("이름 입력"),
						JOptionPane.showInputDialog("주민번호 입력"),
						JOptionPane.showInputDialog("비밀번호 입력"));
				JOptionPane.showMessageDialog(null, "회원 가입 완료 ^_~");
				break;
			case "2": 
				JOptionPane.showMessageDialog(null, member.toString());
				break;
			case "3":
				account = new AccountBean();
				account.setAccountNum(accountService.generatorAccountNum());
				account.setToday(accountService.today());
				account.setMoney(Integer.parseInt(JOptionPane.showInputDialog("입금")));
				String info = accountService.info(account.getToday(), member.getName(), account.getAccountNum(),  account.getMoney());
				
				break;
			case "4":
				JOptionPane.showMessageDialog(null, account.toString());
				break;	
			case "5":
				String inputMoney = JOptionPane.showInputDialog("입금액");
//				JOptionPane.showMessageDialog(null,account.deposit(Integer.parseInt(inputMoney)));
				break;	
			case "6":
				String outputMoney = JOptionPane.showInputDialog("출금액");
//				JOptionPane.showMessageDialog(null, account.withdraw(Integer.parseInt(outputMoney)));
				break;	
			case "7": 
				String automoney = JOptionPane.showInputDialog("매달의 자동 이체 금액");
				String month = JOptionPane.showInputDialog("몇 개월?");
//				JOptionPane.showMessageDialog(null, 
//						account.interest(Double.parseDouble(automoney), 
//								Integer.parseInt(month)));
				break;
			case "8": 
				String pw = JOptionPane.showInputDialog("바꿀 비밀번호 입력");
				member.setPass(pw);
				JOptionPane.showMessageDialog(null, member.toString());
				break;
			}
		}
	}

}
