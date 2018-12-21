package bankPrec;

public interface AccountService {
	// 서비스 로직에는 멤버변수를 두지 않는다.
	public String generatorAccountNum();

	public String today();

	public String info(String today, String name, String accountNum, int money);
	/**
	 * 입금하기
	 */
	public String deposit(int money);
	/**
	 * 출금하기
	 */
	public String withdraw(int money);

	public String interest(double money, int month);
}
