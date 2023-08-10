/*
5
44
333
2222
11111
*/

import java.util.*;
public class Pattern10{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input: ");
		int n =sc.nextInt();
		for(int i=n;i>0;i--)
		{
			for(int j=i;j<=n;j++){
				System.out.print(i);
			}
			System.out.println();
		}
	}
}