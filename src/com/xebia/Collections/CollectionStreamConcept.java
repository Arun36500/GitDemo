package com.xebia.Collections;
import java.util.*;
import java.util.stream.*;

public class CollectionStreamConcept {

	public static void main(String[] args) {
		
		
			
			List<Integer> t1 = Arrays.asList(1, 2, 3, 4, 5);
			System.out.println(t1);
			List<String> t2 = Arrays.asList("One", "Two", "Three", "Four","Five", "One");
			List<Integer> squareT1List = new ArrayList<Integer>();
			System.out.println(t2);
			for(int i=0; i<t1.size();i++) {
				squareT1List.add(t1.get(i)*t1.get(i));					
			}
			System.out.println("Square " + squareT1List );	
			
			List<String> t2StartsWithTfromT2 = new ArrayList<String>();
			for( String s : t2 ) {
				if (s.startsWith("T") ){
					t2StartsWithTfromT2.add(s);
				}			
			}
			System.out.println(t2StartsWithTfromT2);
			
			//map()
			List<Integer> result = t1.stream().map(x->x*x).collect(Collectors.toList());
			System.out.println(result);
			//filter
			List<String> result1 = t2.stream().filter(s->s.startsWith("T")).collect(Collectors.toList());	
			System.out.println(result1);
			// Sorted
			List<String> resultSorted = t2.stream().sorted().collect(Collectors.toList());
			System.out.println(resultSorted);
			//reduce
			int even = t1.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
			System.out.println(even);		
			

	}

}
