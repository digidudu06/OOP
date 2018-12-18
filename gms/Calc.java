package gms;

public class Calc {
	public String plus(String[] op) {
		String res = "";
		int a = Integer.parseInt(op[0]);
		int b = Integer.parseInt(op[2]);
		int r = a+b;
		res =r+"";
		return res;
	}
	public String minus(String[] op) {
		String res = "";
		int a = Integer.parseInt(op[0]);
		int b = Integer.parseInt(op[2]);
		int r = a-b;
		res =r+"";
		return res;
	}
	public String multi(String[] op) {
		String res = "";
		int a = Integer.parseInt(op[0]);
		int b = Integer.parseInt(op[2]);
		int r = a*b;
		res =r+"";
		return res;
	}
	public String divid(String[] op) {
		String res = "";
		int a = Integer.parseInt(op[0]);
		int b = Integer.parseInt(op[2]);
		int r = a/b;
		res =r+"";
		return res;
	}
	public String modul(String[] op) {
		String res = "";
		int a = Integer.parseInt(op[0]);
		int b = Integer.parseInt(op[2]);
		int r = a%b;
		res = r+"";
		return res;
	}
	//operation end
	public String gugudan(String dan) {
		String res = "";
		int a = Integer.parseInt(dan);
		for(int i=0;i<9;i++) {
			res += a+"x"+(i+1)+" = "+ a * (i+1)+"\n";
		}
		return res;
	} //gugudan end

}
