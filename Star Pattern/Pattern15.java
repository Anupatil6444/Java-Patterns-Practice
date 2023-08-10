/*
E
ED
EDC
EDCB
EDCBA
*/

import java.util.*;
public class Pattern15{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input: ");
		int n =sc.nextInt();
		for(int i=1;i<=n;i++){
			    int k=n;
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(k+64));
				k--;
			}
			System.out.println();
		}
	}
}