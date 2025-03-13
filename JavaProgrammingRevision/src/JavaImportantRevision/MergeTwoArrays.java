package JavaImportantRevision;

import java.util.Arrays;

public class MergeTwoArrays {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		int[] b= {6,7,8,9,10};
		
		int a1=a.length;
		int b1=b.length;
		int c1=a1 +b1;
		int[] c=new int[c1];
		
		for(int i=0;i<a.length;i++) {
			c[i]=a[i];
		}
		for(int j=0;j<a.length;j++) {
			c[j+a1]=b[j];
		}
		System.out.println(Arrays.toString(c));
		for(int j=0;j<c.length;j++) {
			System.out.println(c[j] + " ");
		}
	}
}
