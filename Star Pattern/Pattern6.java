/*
eeeee
ddddd
ccccc
bbbbb
aaaaa
*/

import java.util.*;
public class Pattern6{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input: ");
		int n =sc.nextInt();
		int k=96+n;
		for(int i=1;i<=n;i++)
		{    
			for(int j=1;j<=n;j++){
				System.out.print((char)k);
			}
			System.out.println();
			k--;
		}
	}
}