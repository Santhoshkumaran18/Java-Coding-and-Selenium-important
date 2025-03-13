package JavaImportantRevision;

import java.util.Arrays;

public class StringArrayComparisoin {
	public static void main(String[] args) {
		String[] a= {"Banana","santhosh","Aanjay","anjay"};
		
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-i-1;j++) {
				if((a[j].compareTo(a[j+1])>0)) {
					String temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
		for(String words:a) {
			System.out.println(words);
		}
	}
}
