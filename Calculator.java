package Week1Day1;

public class Calculator {
	
	public int add(int num1,int num2) {
	return num1 + num2;
	}
	public double sub (double num1,double num2) {
			return num1-num2;
		}
	public int mul(int num1,int num2) {
		return num1*num2;
	}
	
	public int divide(int num1,int num2) {
		return num1/num2;
	}
	
	public static void main(String[] args) {
	Calculator cal = new Calculator();
	System.out.println(cal.add(10,5));
	System.out.println(cal.sub(10,5));
	System.out.println(cal.mul(3,6));
	System.out.println(cal.divide(9,9));

	}

}
