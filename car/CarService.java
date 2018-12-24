package car;

public interface CarService {	//인터페이스
	/**
	 * 판매 할 차량을 입고시킨다.
	 * */
	public abstract CarBean add(String brand, String color, String gearType, int door);	//앱스트랙이 있어도 되고 없어도 된다.
	public void list();
	public void find();
	public void sell();
	

}
