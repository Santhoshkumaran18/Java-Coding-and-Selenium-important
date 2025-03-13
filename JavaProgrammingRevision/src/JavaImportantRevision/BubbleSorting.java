package JavaImportantRevision;

public class BubbleSorting {
	public static void main(String[] args) {
		int[] a= {1,2,55,-10,-20};
		int n=a.length;
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("Sorted Arrays: ");
		for(int j=0;j<a.length;j++) {
			System.out.println(a[j]);
		}
		System.out.println("Maximum element in the array is : " + a[a.length-1]);
		System.out.println("Minimum element in the array is: " + a[0]);
	}
}
