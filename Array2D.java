import java.util.Scanner;

public class Array2D {

	public static void main(String[] args) {
		Scanner ob=new Scanner(System.in);
		System.out.println("Enter row and column number of first matrix");
		int r1=ob.nextInt();
		int c1=ob.nextInt();
		System.out.println("Enter row and column number of second matrix");
		int r2=ob.nextInt();
		int c2=ob.nextInt();
		int a[][]= new int[r1][c1];
		int b[][]= new int[r2][c2];
		
		
			System.out.println("Enter elements of first matrix");
			for(int i=0;i<r1;i++)
			{
				for(int j=0;j<c1;j++)
				{
					a[i][j]=ob.nextInt();
				}
			}
			System.out.println("Enter elements of second matrix");
			for(int i=0;i<r2;i++)
			{
				for(int j=0;j<c2;j++)
				{
					b[i][j]=ob.nextInt();
				}
			}
			if(r1==r2&&c1==c2)
			{
				int c[][]=new int[r1][c1];
				for(int i=0;i<r1;i++)
				{
					for(int j=0;j<c1;j++)
					{
						c[i][j]=a[i][j]+b[i][j];
						System.out.print(c[i][j]+" ");
					}
					System.out.println();
			    }
			}
			else
				System.out.println("addition not possible");
			if(c1==r2)
			{
				int d[][]= new int[r1][c2];
		        for(int i=0;i<r1;i++)
		        {
			        for(int j=0;j<c2;j++)
			        { 
			        	d[i][j]=0;
				        for(int r=c1-1;r>=0;r--)
				        {
					       d[i][j]+=a[i][r]*b[r][j];
				        }
				
				        System.out.print(d[i][j]+" ");
			        }
			
		            System.out.println();
		        }
	         }
			 else
				System.out.println("Multiplication not possible");

}
}
