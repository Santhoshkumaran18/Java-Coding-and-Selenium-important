package javaProgramming23Feb;

import java.util.Arrays;

public class StringAndArrayManipulation {
	public static void main(String[] args) {
		String s="Santhosh is part of LBG project";
		String[] words=s.split(" ");
		System.out.println(Arrays.toString(words));
		for(String sa:words) {
			System.out.println(sa);
			
		}
	}
}
