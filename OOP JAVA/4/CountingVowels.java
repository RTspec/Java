//Rahul Tudu RollNo-12030523037
public class CountingVowels {
   public static void main(String args[]) {
      int count = 0;
      String sentence = "In the English alphabet, there are five primary vowels";

      for (int i = 0 ; i < sentence.length(); i++) {
         char ch = sentence.charAt(i);
         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'|| ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U') {
            count ++;
         }
      }
      System.out.println("Number of vowels in the given sentence: " + count);
   }
}
