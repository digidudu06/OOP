package bank;
import java.util.Random;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Account {
	final static String BANK_NAME="코코";	//상수 //필드에는 연산자가 오면 안되지만 static(독립적인 공간으로 만듦)으로 예외를 만듦.
	String accountNum, today;
	int money;
	Account(int money){
		this.accountNum = this.generatorAccountNum();
		this.money = money;
		this.today = this.today();
	}
	public String generatorAccountNum() {
		String accountNum = "";
		Random random = new Random();
		// 1234-5678 계좌
		accountNum = random.nextInt(9000)+1000 +"-"+ random.nextInt(10000);
		return accountNum;
	}
	public String today() {
		String today = "";
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		today = sdf.format(date);

		return today;
	}
	public String open(String name) {
		
		return String.format("은행 이름: %s은행\n"
				+ "계좌번호: %s\n"
				+ "이  름: %s\n"
				+ "날  짜: %s\n"
				+ "입.출금 금액: %d원", BANK_NAME, accountNum, name, today, money);
	}
}
