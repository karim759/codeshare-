import java.util.*;
class InvalidException extends Exception {
	public String toString() {
		return "Invalid input plz check the input";
	}
}
class DivException extends Exception {
	public String toString() {
		return "Division with 0 not allowed";
	}
}
class MaxInputException extends Exception {
	public String toString() {
		return "Maximum inputs reached ";
	}
}
class MaxMulException extends Exception {
	public String toString() {
		return "Maximum multiplication value reached";
	}
}
class GetNo {
	public void inputNo(int n[]) {
		Scanner input = new Scanner(System.in);
		try {
			for (int i = 0; i < n.length; i++) {
				System.out.print("Enter a number:");
				n[i] = input.nextInt();
				try {
					if (i == 4) {

						throw new MaxInputException();
					}
				} catch (Exception e) {
					System.out.println(e);
					break;
					//throw new MaxInputException();
				}

			}
		}

		catch (Exception e) {
			System.out.println("Exited susscesfully");
		}
	}
	public int add(int arr[]) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		for (int n : arr) {
			sum = sum + n;
		}
		return sum;
	}
	public int mult(int arr[]) throws MaxMulException {
		int a = 1;
		Scanner input = new Scanner(System.in);
		for (int n : arr) {
			if (n == 0) {
				continue;
			}
			a = a * n;
			//System.out.print(a);

			//System.out.print(a);
		}
		if (a == 100) {
			throw new MaxMulException();
		}

		return a;
	}
	public int div()throws DivException {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number to divide:");
		int n1 = input.nextInt();
		System.out.print("Enter the number to devide:");
		int n2 = input.nextInt();
		if (n2 == 0) {
			throw new DivException();
		}
		int div = n1 / n2;
		return div;
	}
	public int sub(int arr[]) {
		Scanner input = new Scanner(System.in);
		int sum = 0;
		for (int n : arr) {
			sum = sum - n;
		}
		return sum;
	}
}
class Main {
	public static void main(String[]args) {
		Scanner input = new Scanner(System.in);
		GetNo gn = new GetNo();
		int []addi = new int[100];
		int []mul = new int[100];
		int []subt = new int[100];
		System.out.print("Enter 1 for addition \nEnter 2 for multiplication\nEnter 3 for Substraction\nEnter 4 for division: ");
		int fc = input.nextInt();
		switch (fc) {
		case 1:
			gn.inputNo(addi);
			System.out.println("the addition of values are : " + gn.add(addi));
			break;
		case 2:
			try {
				gn.inputNo(mul);
				System.out.println("the values of multiplication : " + gn.mult(mul));
			} catch (Exception e) {
				System.out.println(e);
			}

			break;
		case 3:
			gn.inputNo(subt);
			System.out.println("the value of subtraction is : " + gn.sub(subt));
		case 4:
			try {
				System.out.println("The value of division : " + gn.div());
			} catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}