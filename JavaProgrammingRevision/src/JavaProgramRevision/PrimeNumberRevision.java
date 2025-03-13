package JavaProgramRevision;

public class PrimeNumberRevision {
	public static void main(String[] args) {
		int num=100;
		for(int i=2;i<=num;i++) {
			if(isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static boolean isPrime(int num) {
		if(num<2) {
			return false;
		}
		for(int i=2;i*i<=num;i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}
}
