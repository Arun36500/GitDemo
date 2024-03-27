package Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		//ArrayList<Integer> values=new <Integer>ArrayList();
		
		List<Integer> value= Arrays.asList(2,2,3,12,24,33,33,45,3,6);
		value.stream().distinct().sorted().forEach(s->System.out.println(s));
		
	}

}
