package bank31;
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
public class AccountBean {
	public final static String BANK_NAME = "신한";
	private String accountNum, today;
	private int money;
	
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public String getAccountNum() {
		return accountNum;
	}
	public void setToday(String today) {
		this.today = today;
	}
	public String getToday() {
		return today;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getMoney() {
		return money;
	}
	public String toString() {
		return String.format("개설일 %s\n"
				+ "계좌번호 %s\n"
				+ "잔액 %s원\n", today, accountNum, money);
	}

}
