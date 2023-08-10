/*
54321
4321
321
21
1
*/

import java.util.*;
public class Pattern22{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input: ");
		int n =sc.nextInt();
		for(int i=n;i>0;i--)
		{
			for(int j=i;j>0;j--){
				System.out.print(j);
			}
			System.out.println();
		}
	}
}