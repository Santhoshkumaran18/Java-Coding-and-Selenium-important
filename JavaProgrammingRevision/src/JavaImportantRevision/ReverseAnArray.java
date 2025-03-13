package JavaImportantRevision;

import java.util.Arrays;
import java.util.Collections;

public class ReverseAnArray {
	public static void main(String[] args) {
		Integer[] a= {12,3,4,5,6,7,8};
		for(int i=a.length-1;i>=0;i--) {
			System.out.print(a[i] + " ");
		}
	}
}
