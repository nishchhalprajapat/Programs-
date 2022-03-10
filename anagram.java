import java.util.Scanner;
import java.util.Arrays;
public class anagram {
public static void main(String []args) {
	Scanner scn=new Scanner(System.in);
	String str=scn.nextLine();
	String str1=scn.nextLine();
	isAnagram anagramC=new isAnagram();
	anagramC.isAnagramOrNot(str, str1);
}
}
class isAnagram{
	public void isAnagramOrNot(String str,String str1) {
		char mainStr[]=str.toCharArray();
		char mainStr1[]=str1.toCharArray();
		Arrays.sort(mainStr);
		Arrays.sort(mainStr1);
		boolean flag=true;
		for(int i=0;i<str.length();i++) {
			if(mainStr[i]!=mainStr1[i]) {
				flag=false;
				break;
			}
		}
		if(flag) {

			System.out.println("anagram");
		}else {

			System.out.println("not a anagram");
		}
	}
}
