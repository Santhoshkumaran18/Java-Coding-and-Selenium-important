package JavaProgrammingRevision25Feb;

import java.util.Arrays;

public class MergeTwoArrays {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6};
		int[] b= {7,8,9,10,11};
		
		int a1=a.length;
		int b1=b.length;
		
		int c=a1+b1;
		int[] c1=new int[c];
		
		for(int i=0;i<a1;i++) {
			c1[i]=a[i];
		}
		for(int j=0;j<b1;j++) {
			c1[a1+j]=b[j];
		}
		System.out.println(Arrays.toString(c1));
	}
}
