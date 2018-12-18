package bank2;
import java.util.Random;
import java.text.SimpleDateFormat;
import java.util.Date;
public class Account {
	final static String BANK_NAME = "은지";
	String accountNum, date;
	int money;
	Account(int money){
		this.accountNum = this.generatorAccountment();
		this.money = money;
		this.date = this.date();
	}
	public String generatorAccountment() {
		Random random = new Random();
		return random.nextInt(9000)+1000+ "-" +random.nextInt(10000);
	}
	public String date() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(date);
	}
	public String open(String name) {
		return String.format("은행이름: %s은행\n"
				+ "이    름: %s\n"
				+ "계좌번호: %s\n"
				+ "개 설 일: %s\n"
				+ "금    액: %s원", BANK_NAME, name, accountNum, date, money);
	}

}
