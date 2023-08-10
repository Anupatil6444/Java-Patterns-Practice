/*
a
ba
cba
dcba
edcba
*/

import java.util.*;
public class Pattern14{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input: ");
		int n =sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=i;j>0;j--){
				System.out.print((char)(j+96));
			}
			System.out.println();
		}
	}
}