package real;
import java.util.Random;
//Lotto 6개의 랜덤숫자.
//1~45 까지 랜덤 숫자.
public class Lotto {
	public String randomNum() {
		String num = "";
		Random random = new Random();
		for(int i=0;i<6;i++) {
			num += random.nextInt(45)+1 + " ";
		}				
		return num;
	}

}
