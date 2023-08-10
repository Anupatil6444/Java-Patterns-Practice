/*
edcba
edcb
edc
ed
e
*/

import java.util.*;
public class Pattern26{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input: ");
		int n =sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--){
				System.out.print((char)(j+96));
			}
			System.out.println();
		}
	}
}