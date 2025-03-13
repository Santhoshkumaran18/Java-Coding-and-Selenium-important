package JavaImportantRevision;

import java.util.Arrays;

public class StringArrayComparisonArray {
		public static void main(String[] args) {
			String[] a= {"santhosh","Sanjay","Umasankari","Srinivasan"};
			int n=a.length;
			for(int i=0;i<n-1;i++) {
				for(int j=0;j<n-i-1;j++) {
					if(a[j].compareTo(a[j+1])>0) {
						String temp=a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
					}
				}
			}
			Arrays.sort(a,String.CASE_INSENSITIVE_ORDER);
			System.out.println(Arrays.toString(a));
		}
}
