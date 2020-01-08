package com.logesh;

import java.util.Arrays;

public class StringFilterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "logesh";
		String[] arr = str.split("");
		System.out.println(Arrays.deepToString(str.split("")));

		//Arrays.stream(arr).map((i) -> i + "A").filter((i) -> i%2==0?i:i).forEach(System.out::println);
//		
//		System.out.println(result);
	}

}
