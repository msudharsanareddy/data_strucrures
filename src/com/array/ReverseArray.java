package com.array;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		String names[] = { "Harsh", "Sudh", "Renu","Dad" };
		for (int start = 0, end = names.length-1; start < end; start++, end--) {
			String temp = names[end];
			names[end] = names[start];
			names[start] = temp;
		}

		System.out.println(Arrays.toString(names));
	}

}
