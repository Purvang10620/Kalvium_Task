// java Program to find minimum of coins for change using recursions

import java.io.*;
import java.util.Scanner;

public class coinChange
{
	//m is size of coins array which means number of different coins
	//function for finding min number of coins required for change
	static int minNumberCoins(int coins[], int m, int v)
	{
		if(v==0)
			return 0;
		
		int result= Integer.MAX_VALUE;
		
		for(int i=0;i<m;i++)
		{
			if (coins[i]<=v)
			{
				int sub_res=minNumberCoins(coins,m,v-coins[i]);
				if (sub_res!=Integer.MAX_VALUE && sub_res+1<result)
					result=sub_res+1;
			}
		}
		return result;
	}
	public static void main(String args[])
	{	
		System.out.println("Select from below list");
		System.out.println("1.British Pound \n 2.US Dollar \n 3.Norwegian Krone");
		System.out.println("Enter Your choice:");
		Scanner scanner= new Scanner(System.in);
		int choice=scanner.nextInt();
	
		
		switch(choice)
		{
			case 1:
				// case for British Pound
				System.out.println("British Pound");
				int coins[] ={1,2,5,10,20,50};
				int m=coins.length;
				System.out.println("Enter the number you want to calculate change");
				
				int x= scanner.nextInt();
		
				System.out.println("Min number of coins required is:"+minNumberCoins(coins,m,x));
			break;
				
			case 2:
				// case for US Dollar
				System.out.println("US Dollar");
				int coins1[] ={1,5,10,25};
				int n=coins1.length;
				System.out.println("Enter the number you want to calculate change");
				
				int y= scanner.nextInt();
		
				System.out.println("Min number of coins required is:"+minNumberCoins(coins1,n,y));
				
			break;
			
			case 3:
				//Case for Norwegian Krone
				System.out.println("Norwegian Krone");
				int coins2[] ={1,5,10,20};
				int a=coins2.length;
				System.out.println("Enter the number you want to calculate change");
				
				int z= scanner.nextInt();
			
				System.out.println("Min number of coins required is:"+minNumberCoins(coins2,a,z));
				
			break;
		}
	}
}