import java.util.Scanner;

public class lab1_task5 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("ВВедіть слово: ");
    String word = scan.next();
    isPalindrome(word);
  }

  public static String reverseString(String word) {
    String reverse = "";
    for (int i = word.length() - 1; i >= 0; --i) {
      System.out.println(reverse);
      reverse += word.charAt(i);
    }
    return reverse;

  }

  public static Boolean isPalindrome(String word) {
    if (word.equals(reverseString(word))) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Not a palindrome");
    }
    return word.equals(reverseString(word));

  }
}
