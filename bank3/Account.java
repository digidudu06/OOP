package bank3;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Account {
	final static String BANK_NAME = "지우";
	String accountNum, date;
	int money;
	Account(int money){
		this.accountNum = newAccount();
		this.date = today();
		this.money = money;
	}
	public String newAccount() {
		Random random = new Random();
		return random.nextInt(9000)+1000+"-"+random.nextInt(9000)+1000;
	}
	public String today() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(date);
	}
	public String open(String name) {
		return String.format("[정보]\n"
				+ "은행이름 %s은행\n"
				+ "이름 %s\n"
				+ "계좌번호 %s\n"
				+ "개설일 %s\n"
				+ "돈 %s", BANK_NAME, name, accountNum, date, money);
	}

}
