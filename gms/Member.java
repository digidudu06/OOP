package gms;
public class Member {
	String name; //멤버 변수. 초기화 하지 않는다.
	
	
	public String bmi(double h, double w) {
		String res = ""; 
		double bf = 0.0;//로컬변수
		bf = w/(h*h*0.0001);
		System.out.printf("BMI : %f\n",bf);
		
		if(40<=bf){
			res = "고도비만";
		}else if(35<=bf){
			res = "중등도 비만";
		}else if(30<=bf){
			res = "경도비만";
		}else if(25<=bf){
			res = "과체중";
		}else if(18.5<=bf){
			res = "정상";
		}else{
			res = "저체중";
		}

		return "BMI : "+bf + res;
		
	}//bmi end
	public String grade(String[] arr1) {
		String grade = ""; //로컬변수는 반드시 초기화 해야한다. 원치 않는 값이 할당될 수 있기 때문에.
		/**
		 국, 영, 수, 사, 과 과목 점수를 입력 받아서 평균을 낸 뒤
		 100~90 A, B, C, D, E, F,를 내는 것
		 */		
		double[] scorearr = new double[arr1.length];
		double sum = 0.0;
		for(int i=0;i<arr1.length;i++) {
			scorearr[i] = Double.parseDouble(arr1[i]);
			sum += scorearr[i];
		}

		double avg = sum/5;
		
		if(avg>=90) {
			grade = "A";
		}else if(avg>=80) {
			grade = "B";
		}else if(avg>=70) {
			grade = "C";
		}else if(avg>=60) {
			grade = "D";
		}else if(avg>=50) {
			grade = "E";
		}else {
			grade = "F";
		}

		return grade;
	} //grade end
	public String genderChecker(String ssn) {
		String checker = "";
		char ch = ssn.charAt(7);
		switch(ch) {
		case '1': case '3':
			checker = "남자";
			break;
		case '2': case '4':
			checker = "여자";
			break;
		case '5': case '6':
			checker = "외국인";
			break;
		default: 
			checker = "잘못된 입력";
			break;
		}
				
		return checker;
	} //genderChecker end


}











