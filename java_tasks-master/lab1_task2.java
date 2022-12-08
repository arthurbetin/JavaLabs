import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class lab1_task2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Введіть n: ");
    while (!scan.hasNextInt()) {
      System.out.println("введене не є числом");
      System.out.print("Введіть розмір масиву n: ");
      scan.nextLine();
    }
    int n = scan.nextInt();

    int minVal = -50;
    int maxVal = 50;

    int[] arr = new int[n]; //random fill
    for (int i = 0; i < arr.length; i++) {
      arr[i] = ThreadLocalRandom.current().nextInt(minVal, maxVal);
    }

    System.out.println(Arrays.toString(arr)); //print

    int length = arr.length;
    int counter = 0;

    for (int i = 1; i < length; i++)
      if ((arr[i] < 0 && arr[i - 1] >= 0) || (arr[i] >= 0 && arr[i - 1] < 0)) {
        System.out.println("Індекс " + i + " помінявся");
        counter++;
      }
    System.out.println("Помінявся " + counter + " рази");
  }
}
