package JavaProgrammingRevision25Feb;

import java.util.Arrays;

public class MoveZerosToLast {
	public static void main(String[] args) {
		int[] a= {1,23,4,5,6,0,10,0,11};
		
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
		for(int j=0;j<a.length;j++) {
			System.out.println(a[j] + " ");
		}
	}
}
