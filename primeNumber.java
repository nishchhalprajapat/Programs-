import java.util.Scanner;
public class primeNumber {
public static void main(String[]args) {
	Scanner scn=new Scanner(System.in);
	int number=scn.nextInt();
	isPrimeNumber ip=new isPrimeNumber();
	ip.isPrimeNumberOrNot(number);
}
}
class isPrimeNumber{
	public void isPrimeNumberOrNot(int number) {
		for(int i=2;i<=number;i++) {
			boolean flag=true;
			for(int j=2;j*j<=i;j++) {
				if(i%j==0) {
					flag=false;
					break;
				}
			}
			if(flag) {
				System.out.println(i);
			}
		}
	}
}
