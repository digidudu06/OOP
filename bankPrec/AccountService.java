package bankPrec;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class AccountService {
	// 서비스 로직에는 멤버변수를 두지 않는다.
	public String generatorAccountNum() {
		String accountNum = "";
		Random random = new Random();
		for(int i=0; i<8; i++) {
			if(i!=0 && i!=3) {
				accountNum += random.nextInt(10);
			}else if(i==0) {
				accountNum += random.nextInt(9)+1;
			}else {
				accountNum += random.nextInt(10)+" - ";
			}
		}
		return accountNum;
	}
	public String today() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(date);
	}
	public String info(String today, String name, String accountNum, int money) {
		return String.format("[계좌 정보]\n"
				+ "은행이름 %s은행\n"
				+ "개설일 %s\n"
				+ "이름 %s\n"
				+ "계좌번호 %s\n"
				+ "잔액 %s원\n", AccountBean.BANK_NAME, today, name, accountNum, money); //상수는 클래스이름.상수이름
	}
	/**
	 * 입금하기
	 * */
	public String deposit(int money) {
		String message = "";
		/*if(money > 0) {
			this.money += money;
			message = "입금완료쓰";
		}else {
			message = "잘못된 거래쓰";
		}*/
		return message;
	}
	/**
	 * 출금하기
	 * */
	public String withdraw(int money) {
		String message = "";
		/*if(money > 0 && this.money >= money) {
			this.money -= money;
			message = "출금완료쓰";
		}else {
			message = "잘못된 거래쓰";
		}*/
		return message;
	}
	public String interest(double money, int month) {
		double interestMoney = 0.0;
		DecimalFormat decimalFormat = new DecimalFormat("#,##0");
		if(month>=12){
			interestMoney = money * 5.5;
		}
		return decimalFormat.format(interestMoney);
	}
}
