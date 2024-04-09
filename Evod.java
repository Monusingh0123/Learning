import java.util.Scanner;

public class Evod {

	public static void main(String[] args) {
		
		Scanner Pg=new Scanner(System.in);
		System.out.println("Enter a number");
		int number=Pg.nextInt();
		if(number%2==0)
		{
		System.out.println(number + " is an Even number");
		}
		else
		{
		System.out.println(number + " is an odd number");
		}

	}

}