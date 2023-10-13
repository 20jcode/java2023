package hw01;

public class FactorialMain {
	public static void main(String[] args){
		for (int i = 1; i<=10; i++){
			String expression = "Factorial of ";
			expression += i+": ";

			for (int j = 1; j<i; j++){
				expression += j+"*";
			}
			expression += i + "=";
			System.out.println(expression+factorial(i));
		}
	}
	private static long factorial(final int n) {
		long ans = 1;
		for (int i = 1; i<=n; i++){
			ans *= i;
		}
		return ans;
	}
}

