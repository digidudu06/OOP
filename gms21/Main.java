package gms21;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		StudentService studentService = new StudentService();
		StudentBean studentBean = null;
		SubjectService subjectService = new SubjectService();
		SubjectBean subjectBean = null;
		while(true) {
//			성적표 보기 -> 학번, 이름, 과목명, 점수
			switch(JOptionPane.showInputDialog("0.종료\n"
					+ "1.학생부 등록\n"
					+ "2.비번 변경\n"
					+ "3.학생 정보\n"
					+ "4.수강과목등록\n"
					+ "5.교수등록\n"
					+ "6.점수등록\n"
					+ "7.성적표보기")) {
			case "0": JOptionPane.showMessageDialog(null, "종료");return;
			case "1":
				String name = JOptionPane.showInputDialog("이름 입력");
				String ssn = JOptionPane.showInputDialog("주민번호 입력");
				String pass = JOptionPane.showInputDialog("비밀번호 입력");
				studentBean = new StudentBean();
				studentBean.setName(name);
				studentBean.setSsn(ssn);
				studentBean.setPass(pass);
				studentBean.setHakbun(studentService.makeHakbun());
				break;
			case "2": 
				String newpw = JOptionPane.showInputDialog("바꿀 비밀번호 입력");
				studentBean.setPass(newpw);
				JOptionPane.showMessageDialog(null, "비밀번호 변경 완료.");
				break;
			case "3": 
				JOptionPane.showMessageDialog(null, 
						studentService.info(studentBean.getSsn(), studentBean.getHakbun(), studentBean.getName(), studentBean.getPass()));
				break;
			case "4"://수강과목 등록
				String subjName = JOptionPane.showInputDialog("수강과목 입력");
				subjectBean = new SubjectBean();
				subjectBean.setSubjName(subjName);
				break;
			case "5"://교수등록
				String profName = JOptionPane.showInputDialog("교수 이름 입력");
				subjectBean.setProfName(profName);
				break;
			case "6": //점수등록
				String score = JOptionPane.showInputDialog("점수 입력");
				subjectBean.setScore(Integer.parseInt(score));
				break;
			case "7"://성적표보기
				JOptionPane.showMessageDialog
				(null,subjectService.info(studentBean.getHakbun(), studentBean.getName(), subjectBean.getSubjName(), 
						subjectBean.getProfName(), subjectBean.getScore())); 
				break;
		
			}
		}
	}

}
