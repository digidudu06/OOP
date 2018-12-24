package car;

import javax.swing.JOptionPane;

public class CarController {
	public static void main(String[] args) {
		CarBean car = null;
		CarService carService = new CarServiceImpl();
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료\n"
					+ "1.차량 입고\n"
					+ "2.차량 목록\n"
					+ "3.차량 검색\n"
					+ "4.차량 판매"
					)) {
			case "0": JOptionPane.showMessageDialog(null, "종료");return;
			case "1": 
				car = carService.add(
						JOptionPane.showInputDialog("브랜드"),
						JOptionPane.showInputDialog("차 색상"),
						JOptionPane.showInputDialog("변속기 종류"),
						Integer.parseInt(JOptionPane.showInputDialog("문의 개수")));
				break;
			case "2": 
				carService.list();
				break;
			case "3": 
				carService.find();
				break;
			case "4": 
				carService.sell();
				break;
			}
		}
	}

}
