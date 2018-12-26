package bank31;

import javax.swing.JOptionPane;

public class BankController {

	public static void main(String[] args) {
		MemberBean member = null;
		AccountBean account = null;
		AccountService accountService = new AccountServiceImpl();
		MemberService memberService = new MemberServiceImpl();
		while (true) {
			switch (JOptionPane.showInputDialog("0.종료\n" + "1.회원가입\n" + "2.회원정보\n" + "3.계좌개설\n" + "4.계좌정보\n" + "5.입금 \n"
					+ "6.출금\n" + "7.회원탈퇴\n" + "8.비번변경\n" + "9.목록보기\n" + "10.\n" + "11.로그인\n" + "12.가입자 수")) {
			case "0":
				JOptionPane.showMessageDialog(null, "종료됩니다.");
				return;
			case "1":
				memberService.join(JOptionPane.showInputDialog("아이디 입력"), JOptionPane.showInputDialog("이름 입력"),
						JOptionPane.showInputDialog("주민번호 입력"), JOptionPane.showInputDialog("비밀번호 입력"));
				break;
			case "2":
				String id = JOptionPane.showInputDialog("검색 할 아이디");
				JOptionPane.showMessageDialog(null, memberService.findById(id));
				break;
			case "3":
				account = new AccountBean();
				account.setAccountNum(accountService.generatorAccountNum());
				account.setToday(accountService.findToday());
				account.setMoney(Integer.parseInt(JOptionPane.showInputDialog("입금")));
				String info = accountService.info(account.getToday(), member.getName(), account.getAccountNum(),
						account.getMoney());

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
				id = JOptionPane.showInputDialog("아이디 입력");
				String pass = JOptionPane.showInputDialog("비밀번호 입력");
				String ssn = JOptionPane.showInputDialog("주민번호 입력");
				memberService.deleteMember(id, pass, ssn);
				break;
			case "8":
				id = JOptionPane.showInputDialog("현재 아이디 입력");
				pass = JOptionPane.showInputDialog("현재 비밀번호 입력");
				String newPass = JOptionPane.showInputDialog("바꿀 비밀번호 입력");
				memberService.updatePassword(id, pass, newPass);
				break;
			case "9": 
				JOptionPane.showMessageDialog(null, memberService.findAll());
				break;
			case "10": 
//				JOptionPane.showMessageDialog(null, memberService.find(JOptionPane.showInputDialog("찾을 아이디")));
				break;
			case "11": 
				if(memberService.existMember(JOptionPane.showInputDialog("로그인 아이디"), JOptionPane.showInputDialog("로그인 비번"))) {
					JOptionPane.showMessageDialog(null, "로그인 성공");
				}else {
					JOptionPane.showMessageDialog(null, "로그인 실패");
				}
//				JOptionPane.showMessageDialog(null, (id,pass) ? "로그인 성공" : "로그인 실패");
				break;
			case "12": 
				JOptionPane.showMessageDialog(null, "가입자 수 : " + memberService.countMember());
				break;

			}
		}
	}

}
