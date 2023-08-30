package class13;

import java.util.StringTokenizer;

public class SplitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// count words in one sentences
		
		String str1= "Nasrtullah want to be a milloniar";
		
		String [] strArray= str1.split(" ");
		System.out.println(strArray.length);
		
		;
		String sentences="java is good . batch2 like java . but some of them do homwork . they are getting better .";
		
		String [] sentenceArray=sentences.split(" . ");
		
		System.out.println(sentenceArray.length);
		
		for (String s:sentenceArray) {
			
			System.out.println(s);
		}

	}

}
