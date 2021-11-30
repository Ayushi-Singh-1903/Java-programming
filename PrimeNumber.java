import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Please insert any number");
		int n=ob.nextInt();
		int k=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
				k++;
		}
		if(k==0)
			System.out.println(n+" is prime number.");
		else
			System.out.println("Not prime");

	}

}
