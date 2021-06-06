package labexercise;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int first = 100, second = 35;
		System.out.println("--Before swap--");
		System.out.println("first number is :" + first);
		System.out.println("Second number is :" + second);
		float temporary = first;
		first = second;
		second = (int) temporary;
		System.out.println("-After swap--");
		System.out.println("First number : " + first);
		System.out.println("Second number is :" + second);
		
	}

}
