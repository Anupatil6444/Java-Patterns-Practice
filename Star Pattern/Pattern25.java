/*
EDCBA
DCBA
CBA
BA
A
*/

import java.util.*;
public class Pattern25{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input: ");
		int n =sc.nextInt();
		for(int i=n;i>0;i--)
		{
			for(int j=i;j>0;j--){
				System.out.print((char)(j+64));
			}
			System.out.println();
		}
	}
}