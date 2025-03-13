package JavaProgrammingRevsion;

import java.util.Arrays;

public class MoveZerosToLast {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,0,6,0,10};
		int count=0;
		
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				a[count++]=a[i];
			}
		}
		while(count<a.length) {
			a[count++]=0;
		}
		System.out.println(Arrays.toString(a));
	}
	
	
}
