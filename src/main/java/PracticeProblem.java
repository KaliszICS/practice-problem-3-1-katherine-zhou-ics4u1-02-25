public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static int sumOfDigits(int x){

		if (x < 0){
			return x = -x;
		}

		if (x <= 9){
			return x;
		}

		return (x %10) + (x/10);
	}
	}

	

}
