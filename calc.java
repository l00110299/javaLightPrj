import java.util.Scanner;

public class calc
{
	public static void main(String [] args)
	{
		int num1, num2;

		Scanner keyboardIn = new Scanner(System.in);
		System.out.println("enter num 1: ");
		num1 = keyboardIn.nextInt();
		System.out.println("Enter num 2 : ");
		num2 = keyboardIn.nextInt();

		System.out.println("inswer " +(num1 + num2));
		//comment
	}
}
