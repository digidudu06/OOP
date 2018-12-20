package bank01;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.text.DecimalFormat;
/**
 * 계좌 클래스
 * [속성]
 * 상수 : BANK_NAME
 * 멤버변수 : 
 * 1.accountNum 계좌번호
 * 2.money 잔액
 * 3.today 해당일
 * [기능]
 * 1.generatorAccountNum() 계좌번호 생성(랜덤)
 * 2.today() 개설일
 * 3.deposit() 입금하기
 * 4.withdraw() 출금하기
 * 5.info() 개인정보
 * */
public class Account {
	final static String BANK_NAME = "신한";
	String accountNum, today;
	int money;
	Account(int money){
		this.accountNum = generatorAccountNum();
		this.today = today();
		this.money = money;
	}
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
	/**
	 * 입금하기
	 * */
	public String deposit(int money) {
		String message = "";
		if(money > 0) {
			this.money += money;
			message = "입금완료쓰";
		}else {
			message = "잘못된 거래쓰";
		}
		return message;
	}
	/**
	 * 출금하기
	 * */
	public String withdraw(int money) {
		String message = "";
		if(money > 0 && this.money >= money) {
			this.money -= money;
			message = "출금완료쓰";
		}else {
			message = "잘못된 거래쓰";
		}
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
	public String info(String name) {
		return String.format("[계좌 정보]\n"
				+ "은행이름 %s은행\n"
				+ "개설일 %s\n"
				+ "이름 %s\n"
				+ "계좌번호 %s\n"
				+ "잔액 %s원\n", BANK_NAME, today, name, accountNum, money);
	}

}
