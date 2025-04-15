public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int sumOfDigits(int x){

		if (x < 0){
			x = -x;
		}

		if (x <= 9 && x>= 0){
			return x;
		}

		return (x %10) + sumOfDigits(x/10);
	}

		public static int factorial(int n){
			 
			if (n == 0){
				return 1;
			}

			if (n < 0){
				return 0;
			}

			return n * factorial(n-1);

		}
	}
