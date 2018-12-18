package gms;

import javax.swing.JOptionPane;
public class Main {

	public static void main(String[] args) {
		while(true) {
			String menu = JOptionPane.showInputDialog
					("0.종료\n"
					+ "1.회원관리\n"
					+ "2.계산기\n"
					+ "3.로또\n"
					+ "4.달력\n");
			switch(menu) {
			case "0":
				JOptionPane.showMessageDialog(null, "시스템 종료");
				return;
			case "1":
				Member m = new Member();
				String name = JOptionPane.showInputDialog("이름 입력");
				m.name = name;
				JOptionPane.showMessageDialog(null, String.format("%s님 환영합니다.", m.name));
				String mMenu = JOptionPane.showInputDialog("[회원관리 메뉴]\n"
						+ "1)BMI(키,몸무게) \n2)학점(국,영,수,사,과) \n3)성적체크(SSN)");
				switch (mMenu) {
				case "1":
					String temp = JOptionPane.showInputDialog(null,"키,몸무게 입력");
					//홍길동, 180.4, 60.5
					String[] arr = temp.split(",");	//문자를 ("안의 값")으로 쪼개겠다.
					JOptionPane.showMessageDialog(null,
							String.format("%s님은 %s입니다", m.name,
									m.bmi(Double.parseDouble(arr[0]),
											Double.parseDouble(arr[1]))) );
					
				break;
				case "2": 
					String score = JOptionPane.showInputDialog("국,영,수,사,과 순으로 입력해주세요.");
					String[] arr1 = score.split(",");
					JOptionPane.showMessageDialog(null,String.format("%s님의 학점은 %s입니다.", m.name, m.grade(arr1)));					
					break;
				case "3": 
					String ssn = JOptionPane.showInputDialog("주민번호 입력");
					JOptionPane.showMessageDialog(null,String.format("%s님은 %s입니다.", m.name, m.genderChecker(ssn)) );
					break;

			}
			break;
			case "2":
				Calc c = new Calc();
				String cmenu = JOptionPane.showInputDialog("[계산기 메뉴] \n1)연산계산기\n2)구구단");
				switch (cmenu) {
				case "1":
					String oper = JOptionPane.showInputDialog("연산식을 입력하세요.");
					String[] op = oper.split(" ");
					switch(op[1]) {
					case "+": 
						JOptionPane.showMessageDialog(null, String.format("결과는 %s입니다.", c.plus(op)));
						break;
					case "-": 
						JOptionPane.showMessageDialog(null, String.format("결과는 %s입니다.", c.minus(op)));
						break;
					case "*": 
						JOptionPane.showMessageDialog(null, String.format("결과는 %s입니다.", c.multi(op)));
						break;
					case "/": 
						JOptionPane.showMessageDialog(null, String.format("결과는 %s입니다.", c.divid(op)));
						break;
					case "%": 
						JOptionPane.showMessageDialog(null, String.format("결과는 %s입니다.", c.modul(op)));
						break;
					}
					break;
				case "2":
					String dan = JOptionPane.showInputDialog("단을 입력하세요.");
					JOptionPane.showMessageDialog(null, String.format("%s", c.gugudan(dan)));
					break;
				}
				break;
			case "3":
				Lotto l = new Lotto();
				JOptionPane.showMessageDialog(null, String.format("%s", l.randomNum()));
				break;
			case "4":
				MyCalendar mc = new MyCalendar();
				String year = JOptionPane.showInputDialog("년도 입력");
				JOptionPane.showMessageDialog(null, String.format("%s 년도 \n%s", year, mc.leapYear(year)));
				break;

			
			}
			
		}
		
	}

}
