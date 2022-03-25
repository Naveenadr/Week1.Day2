
public class Calculator {


		
		public int add(int num1, int num2, int num3) {
			return num1+num2+num3;
		}
		public int sub(int num1, int num2) {
			return num1-num2;
			
		}
		public double mul(double num1, double num2) {
			return num1*num2;
			
		}
		public float div(float num1, float num2) {
			return num1 / num2;
			
		}
		public static void main(String[] args) {
			Calculator cal = new Calculator();
			System.out.println(cal.add(1, 2, 3));
			System.out.println(cal.sub(10, 5));
			System.out.println(cal.mul(110, 5));
			System.out.println(cal.div(10, 10));
			
		}

	}

