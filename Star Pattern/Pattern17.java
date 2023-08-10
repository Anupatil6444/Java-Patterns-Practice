/*
11111
2222
333
44
5
*/

import java.util.*;
public class Pattern17{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input: ");
		int n =sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i+1;j++){
				System.out.print(i);
			}
			System.out.println();
		}
	}
}