package bank31;

import javax.swing.JOptionPane;

public class MemberServiceImpl implements MemberService{
	private MemberBean[] members;	
	private int count;
	MemberServiceImpl(){
		members = new MemberBean[10];
		count = 0;
	}
	@Override
	public void join(String id, String name, String pass, String ssn) {
		MemberBean member = new MemberBean();
		member.setId(id);
		member.setName(name);
		member.setPass(pass);
		member.setSsn(ssn);
		members[count] = member; //배열에 담길 때 MemberBean에 속성들의 타입이 달라도 괜찮음.
		count++;
	}
	@Override
	public MemberBean[] list() {
		return members;
	}
	@Override
	public MemberBean find(String id) {
		MemberBean member = new MemberBean();
		for(int i=0;i<count;i++) {
			if(members[i].getId().equals(id)) {
				member = members[i];
				break;
			}
		}
		return member;
	}
	@Override
	public boolean login(String id, String pass) {
		boolean ok = false;
		for(int i=0 ; i<count ; i++) {
			if(members[i].getId().equals(id) && members[i].getPass().equals(pass)) {
				ok = true;
				break;
			}
		}
		return ok;
	}
	@Override
	public int count() {
		return count;
	}
	@Override
	public void update(String id, String pass, String newPass) {
		for(int i=0;i<count;i++) {
			if(members[i].getId().equals(id) && members[i].getPass().equals(pass)) {
				members[i].setPass(newPass);
//				JOptionPane.showMessageDialog(null, "수정완료");
				break;
			}else {
//				JOptionPane.showMessageDialog(null, "다시 입력하세요.");
				break;
			}
		}
	}
	@Override
	public void delete(String id, String pass, String ssn) {
		for(int i=0;i<count;i++) {
			if(members[i].getId().equals(id) && members[i].getPass().equals(pass) && members[i].getSsn().equals(ssn)) {
				members[i] = null;
//				JOptionPane.showMessageDialog(null, "탈퇴 완료");
				break;
			}else {
//				JOptionPane.showMessageDialog(null, "다시");
				break;
			}
		}
		
	}
}
