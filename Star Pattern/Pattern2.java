/*
55555
44444
33333
22222
11111
*/

import java.util.*;

public class Pattern2{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input: ");
		int n =sc.nextInt();
		for(int i=n;i>0;i--)
		{
			for(int j=1;j<=n;j++){
				System.out.print(i);
			}
			System.out.println();
		}
	}
}