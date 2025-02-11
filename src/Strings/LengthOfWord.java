package Strings;

import java.util.Scanner;

public class LengthOfWord {
  public static Scanner scan;

  public static void main(String[] args) {

    int max_len = 0, len = 0;
    String w = "", max_word = "";

    scan = new Scanner(System.in);

    System.out.print("Enter Strings here: ");
    String st = scan.nextLine();

    st = st.trim();
    st = st + ' ';

    for (int i = 0; i < st.length(); i++) {
      char x = st.charAt(i);
      if (x != ' ')
        w = w + x;
      else {
        len = w.length();
        if (len > max_len) {
          max_word = w;
          max_len = len;
        }
        w = "";
      }
    }
    System.out.println("The longest word : " + max_word);
    System.out.println("The length of word: " + max_len);
  }
}
