package bank31;

public interface MemberService {
	/**
	 * CREATE
	 * */
	public void join(String id,String name,String pass,String ssn);
	/**
	 * READ
	 * */
	public MemberBean[] findAll();
	public MemberBean[] findByName(String name);
	public MemberBean findById(String id);
	public boolean existId(String id);
	public boolean existMember(String id, String pass);
	public String countMember();
	/**
	 * UPDATE
	 * */
	public void updatePassword(String id, String pass, String newPass);
	/**
	 * DELETE
	 * */
	public void deleteMember(String id, String pass, String ssn);
}
