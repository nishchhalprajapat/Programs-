import java.util.*;
public class printPermutation {
	public static void main(String[]args) {
		Scanner scn=new Scanner(System.in);
		String word=scn.nextLine();
		allPermutation permu=new allPermutation();
		permu.allPermutations(word,"");
	}

}
 class allPermutation{
	public void allPermutations(String que,String asf) {
		if(que.length()==0) {
			System.out.println(asf);
		}
		for(int i=0;i<que.length();i++) {
			char ch=que.charAt(i);
			String lq=que.substring(0,i);
			String rq=que.substring(i+1);
			String newQue=lq+rq;
			allPermutations(newQue,asf+ch);
		}
	}
}
