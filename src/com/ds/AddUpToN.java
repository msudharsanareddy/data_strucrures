package com.ds;

import java.util.stream.IntStream;

public class AddUpToN {

	/*public static int addUpToN(int n) {
		return IntStream.range(1, n+1).sum();
	}*/
	
	public static int addUpToNSlow(int n) {
		int c = 0;
		for(int i=1;i<=n;i++) {
			c+=i;
		}
		
		return c;
	}
	
	public static int addUpToNFast(int n) {
		return n*(n+1)/2;
	}

	public static void main(String[] args) {
		System.out.println(addUpToNSlow(3));
	}

}
