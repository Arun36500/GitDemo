package com.xebia.java;

import java.util.ArrayList;
import java.util.Scanner;

public class Array {

	
		int [] arr;
		
		public  void disp(ArrayList<Integer> list)
		{
		for (int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
			//System.out.println(list);
			
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s=new Scanner(System.in);
		System.out.println("Enter value..");
		ArrayList <Integer> list=new ArrayList<>();
		list.add(s.nextInt());
		
		
		
		Array a=new Array();
		
		a.disp(list);
		
		
		
		
		
	}

}
