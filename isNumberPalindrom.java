import java.util.*;
public class isNumberPalindrom {
	public static void main(String []args) {
		Scanner scn=new Scanner(System.in);
		int number=scn.nextInt();
		numberPalindrom np=new numberPalindrom();
		np.isNumberPalindromOrNot(number);
	}
}
class numberPalindrom{
	public void isNumberPalindromOrNot(int number){
		int number1=number;
		int ans=0;
		while(number!=0) {
			int r=number%10;
			
			ans=(ans*10)+r;
			number=number/10;
		}
		if(number1==ans) {
			System.out.println("number is palindrom");
		}
	}
}
