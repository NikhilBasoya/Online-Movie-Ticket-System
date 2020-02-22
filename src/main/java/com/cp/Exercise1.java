package com.cp;

import java.io.ObjectInputStream.GetField;
import java.util.Arrays;
public class Exercise1 {
	 public static int getSecondElement(int[] arr)
	 {
		 Arrays.sort(arr);
		 return arr[1];
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int A[] = {23,45,12,45,67,84,67,23};
		System.out.println(getSecondElement(A));
	}

}
