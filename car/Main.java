package car;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		CarBean car = null;
		while(true) {
			switch(JOptionPane.showInputDialog("0.종료\n"
					+ "1.차 선택\n"
					+ "2.차 정보\n"
					)) {
			case "0": JOptionPane.showMessageDialog(null, "종료");return;
			case "1": 
				String color = JOptionPane.showInputDialog("차 색상");
				String gearType = JOptionPane.showInputDialog("변속기 종류");
				String door = JOptionPane.showInputDialog("문의 개수");
				car = new CarBean();
				car.setColor(color);
				car.setGearType(gearType);
				car.setDoor(Integer.parseInt(door));
				break;
			case "2": 
				JOptionPane.showMessageDialog(null, car.toString());
				break;
			}
		}
	}

}
