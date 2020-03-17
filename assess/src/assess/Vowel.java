package assess;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Vowel {
	public static int checkVowel(String st) {
		int count=0;
		int n = st.length();
		for(int i=0;i<n;i++) {
			if (st.charAt(i)=='a'||st.charAt(i)=='e'||st.charAt(i)=='i'||st.charAt(i)=='o'||st.charAt(i)=='u') {
				count++;
			}
		}return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String s = sc.nextLine();
		int max=0;
		int temp=0;
		String s1="";
		String s2="";
		StringTokenizer st = new StringTokenizer(s);
		int j =st.countTokens();
		//for(int i=0;i<j;i++) {
        while(st.hasMoreTokens()) {
        	 s1 =st.nextToken();
			
			
			 temp = Vowel.checkVowel(s1);
			if(max<temp) {
				max = temp;
				s2=s1;
			}
			//}
			//System.out.println(max+" "+s2);
		}
		System.out.println(max+" "+s2);
	}

}
