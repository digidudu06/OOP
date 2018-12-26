package bank31;

import javax.swing.JOptionPane;

public class MemberServiceImpl implements MemberService {
	private MemberBean[] members;
	private int count;

	MemberServiceImpl() {
		members = new MemberBean[10];
		count = 0;
	}

	/**
	 * CREATE
	 */
	@Override
	public void join(String id, String name, String pass, String ssn) {
		MemberBean member = new MemberBean();
		member.setId(id);
		member.setName(name);
		member.setPass(pass);
		member.setSsn(ssn);
		members[count] = member; // 배열에 담길 때 MemberBean에 속성들의 타입이 달라도 괜찮음.
		count++;
	}

	/**
	 * READ
	 */
	@Override
	public MemberBean[] findAll() {
		return members;
	}

	// 검색 some
	@Override
	public MemberBean[] findByName(String name) {
		return members;
	}

	// 검색 one
	@Override
	public MemberBean findById(String id) {
		MemberBean member = new MemberBean();
		for (int i = 0; i < count; i++) {
			if (members[i].getId().equals(id)) {
				member = members[i];
				break;
			}
		}
		return member;
	}

	@Override
	public boolean existId(String id) {
		// TODO Auto-generated method stub
		return false;
	}

	// 검색 exist
	@Override
	public boolean existMember(String id, String pass) {
		boolean ok = false;
		for (int i = 0; i < count; i++) {
			if (members[i].getId().equals(id) && members[i].getPass().equals(pass)) {
				ok = true;
				break;
			}
		}
		return ok;
	}

	// 검색 count
	@Override
	public String countMember() {
		return count + "명";
	}

	/**
	 * UPDATE
	 */
	@Override
	public void updatePassword(String id, String pass, String newPass) {
		for (int i = 0; i < count; i++) {
			if (members[i].getId().equals(id) && members[i].getPass().equals(pass)) {
				members[i].setPass(newPass);
				JOptionPane.showMessageDialog(null, "수정완료");
				break;
			}
		}
	}

	/**
	 * DELETE
	 */
	@Override
	public void deleteMember(String id, String pass, String ssn) {
		for (int i = 0; i < count; i++) {
			System.out.println(i);
			if (members[i].getId().equals(id) && members[i].getPass().equals(pass) && members[i].getSsn().equals(ssn)) {
				members[i] = members[count-1];
				members[count-1] = null;
				count--;
				break;
			}
		}

	}

}
