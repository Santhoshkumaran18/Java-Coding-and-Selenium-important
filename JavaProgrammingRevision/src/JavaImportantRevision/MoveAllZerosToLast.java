package JavaImportantRevision;

import java.util.Arrays;

public class MoveAllZerosToLast {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,0,9,0,10,0};
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
		System.out.println("Sorted Arrays");
		for(int j=0;j<a.length;j++) {
			System.out.print(a[j] + " ");
		}
	}
}
