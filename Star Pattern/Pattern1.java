/*
11111
22222
33333
44444
55555
*/
import java.util.*;
public class Pattern1{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input: ");
		int n =sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++){
				System.out.print(i);
			}
			System.out.println();
		}
	}
}