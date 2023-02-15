package chapter7;
import java.util.*;
   
public class CountLettersInArray {
	
/*public static char[] createArray(){
	char[] chars=new char[100];
	  Random r =new Random();
	for(int i=0;i<chars.length;i++) {
	 chars[i]=(char)(r.nextInt(26)+'a');
	}
	return chars;
}
public static void displayArray(char[] chars) {
	for(int i=0;i<chars.length;i++) {
		if ((i + 1) % 20 == 0)
			 System.out.println(chars[i]);
        else
			System.out.print(chars[i] + " ");
	}
}
public static int[] countLetters(char[] chars) {
	int[] counts=new int[26];
	for(int i=0;i<chars.length;i++) {
		counts[chars[i]-'a']++;
	}
	return counts;
}
public static void displayCounts(int[] counts) {

	for(int i=0;i<counts.length;i++) {
		System.out.println(counts[i]+" tane "+(char)(i+'a'));
	}
}
	public static void main(String[] args) {
		char[]alfabe=createArray();
		int[] sayac=countLetters(alfabe) ;
        displayArray(alfabe);
        countLetters(alfabe);
        displayCounts(sayac);
   }
}*/
	public static void main(String[] args) {
        char[] chars=new char[100];
        Random r =new Random();

        System.out.println("\nrondom dizimiz: ");
        for(int i=0;i<chars.length;i++) {
            chars[i]=(char)(r.nextInt(26)+'a');
        }
        // 97 - 122
        for(int i=0;i<100;i++){
            System.out.print(chars[i] + " ");
        }

        // 2 boyutlu dizi olustur 26 * 2 lik [1] dekiler 0 ile baslasın. sonra a
        // ilki a dan z ye kadar harflari icersin sırayla
        // sonra buldugumuz harfleri if ile iclerine 1 eklettirelim sonra da a dan baslayarak yazdıralım.
        char[][] alfabe = new char[26][2];

        for(int i=0;i<26;i++){
            alfabe[i][0] = (char)('a'+i);
        }

        for(int i=0;i<26;i++){
            System.out.println((alfabe[i][0]));
        }
        for(int i=0;i<100;i++){
            for(int j = 0; j<26;j++){
                if(chars[i]==alfabe[j][0]){
                    alfabe[j][1] = (char)(((int)(alfabe[j][1])+1));
                    break;
                }
            }
        }

        System.out.println("Harflar ve adatleri");
        for(int i=0;i<26;i++){
            System.out.print(alfabe[i][0] +" "+(int)(alfabe[i][1])+"\n");
        }

    }

}

