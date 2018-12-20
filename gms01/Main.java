package gms01;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료\n"
					+ "1.학생 정보\n"
					+ "2.점수 입력\n"
					+ "3.시험결과")) {
			case "0.": JOptionPane.showMessageDialog(null, "종료");return;
			case "1":
				String hakjum = JOptionPane.showInputDialog("학점");
				break;
			case "2": break;
			case "3": break;
			}
		}
	}

}
