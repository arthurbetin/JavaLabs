import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//ійкова у десяткову
public class lab1_tast6 {
  public static void main(String[] args) {
    String text = "the cement 100000 beeeeyooond yooour 101 controooooooolll";

    ArrayList<String> arr = new ArrayList<>();

    Pattern pattern = Pattern.compile("(?<![.])\\b[0-1]+\\b(?![.])");;
    Matcher matcher = pattern.matcher(text);


    while(matcher.find()){
      StringTokenizer stringTokenizer = new StringTokenizer(matcher.group(), " ");
      while(stringTokenizer.hasMoreTokens()){
        arr.add(String.valueOf(stringTokenizer.nextToken()));
      }

    }
    System.out.println(arr);

    for (String i : arr){
      System.out.print(Integer.parseInt(i, 2)+ " ");
    }
  }
}