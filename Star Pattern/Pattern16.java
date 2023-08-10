/*
e
de
cde
bcde
abcde
*/

import java.util.*;
public class Pattern16{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input: ");
		int n =sc.nextInt();
		for(int i=n;i>0;i--)
		{
			for(int j=i;j<=n;j++){
				System.out.print((char)(j+96));
			}
			System.out.println();
		}
	}
}