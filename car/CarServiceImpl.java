package car;

public class CarServiceImpl implements CarService{

	@Override
	public CarBean add(String brnad, String color, String gearType, int door) {
		CarBean car = new CarBean();
		car.setColor(color);
		car.setGearType(gearType);
		car.setDoor(door);
		return car;
	}

	@Override
	public void list() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void find() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		
	}
	
}
