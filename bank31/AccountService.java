package bank31;

//메소드를 추상화 했다.
public interface AccountService {
	//서비스 로직에는 멤버변수를 두지 않는다.
	public String generatorAccountNum();
	/**
	 * 오늘날짜 구하기
	 * */
	public String today();
	/**
	 * 계좌 정보 보여주기
	 * */
	public String info(String today, String name, String accountNum, int money);
	/**
	 * 입금하기
	 * */
	public String deposit(int money);
	/**
	 * 출금하기
	 * */
	public String withdraw(int money);
	/**
	 * 이자액 구하기
	 * */
	public String interest(double money, int month);
}
