import java.util.*;
public class ocurrenceWord {
	public static void main(String [] args) {

Scanner scn=new Scanner(System.in);
String article=scn.nextLine();
String word=scn.nextLine();
ocurrWord ow=new ocurrWord();
ow.counting(article, word);
	}
}
class ocurrWord{
	public void counting(String article,String word) {
		String [] articleMain=article.split(" ");
		int count=0;
		for(int i=0;i<articleMain.length;i++) {
			if(word.equals(articleMain[i])) {
				count++;
			}
		}
		System.out.println(count);
	}
}