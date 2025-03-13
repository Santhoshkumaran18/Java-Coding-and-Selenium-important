package JavaProgramming28Feb;

public class PrimeNumbers {
	public static void main(String[] args) {
		int num=23;
		int count=0;
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2) {
			System.out.println("It is an Prime number");
		}else {
			System.out.println("It is not an prime number");
		}
	}
}
