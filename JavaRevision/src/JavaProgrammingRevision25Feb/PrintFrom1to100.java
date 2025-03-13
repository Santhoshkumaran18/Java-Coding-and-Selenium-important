package JavaProgrammingRevision25Feb;

public class PrintFrom1to100 {
	public static void main(String[] args) {
		int even=0;
		int odd=0;
		for(int i=0;i<=100;i++) {
			if(i%2==0) {
				even++;
			}else {
				odd++;
			}
			
		}
		System.out.println("Even number between 0 to 100: "+ even);
		System.out.println("Odd numbers between 0 to 100: "+ odd);
	}
}
