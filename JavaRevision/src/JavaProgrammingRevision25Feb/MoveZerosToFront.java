package JavaProgrammingRevision25Feb;

import java.util.Arrays;

public class MoveZerosToFront {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7,0,10,0,11};
		int count=a.length-1;
		for(int i=a.length-1;i>=0;i--) {
			if(a[i]!=0) {
				a[count--]=a[i];
			}
		}
		while(count>=0) {
			a[count--]=0;
		}
		System.out.println(Arrays.toString(a));
	}
}
