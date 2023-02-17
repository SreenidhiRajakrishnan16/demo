package demodemo;

import java.util.SortedSet;
import java.util.TreeSet;
import java.util.SortedSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DupesSort {
	
	public static void main(String[] args) {
		int[] arr = {3,1,9,4,8,3,1,1,4};
		Set<Integer> s = new HashSet<Integer>();
		SortedSet<Integer> ss = new TreeSet<Integer>();
		for(int i = 0; i<arr.length; i++) {
			System.out.println(arr[i]);
			ss.add(arr[i]);
		}
		System.out.println(arr);
		System.out.println(ss);
		}

}
