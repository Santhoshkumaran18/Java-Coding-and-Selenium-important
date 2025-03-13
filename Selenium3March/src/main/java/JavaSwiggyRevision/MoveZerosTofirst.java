package JavaSwiggyRevision;

import java.util.Arrays;

public class MoveZerosTofirst {
	public static void main(String[] args) {
		int[] a= {12,3,4,5,6,0,0,10,11,0};
		int count=a.length-1;
		for(int i=count;i>=0;i--) {
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
