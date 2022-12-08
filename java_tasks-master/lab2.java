import java.util.Arrays;
import java.util.Scanner;

public class lab2 {

  public static int sum(byte[] array) {
    int result = 0;
    for (final byte v : array) {
      result += v;
    }
    return result;
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Введіть розмір масиву: ");
    int size;
    byte input;
    while (true) {
      try {
        size = scan.nextInt();
        break;
      } catch (Exception e) {
        System.out.print("Масив не може бути такого розміру, перенаберіть: ");
        scan.nextLine();
      }
    }
    byte arr[] = new byte[size];
    System.out.print("Введіть елементти масиву: ");
    for (int i = 0; i < size; i++) {
      while (true) {
        try {
          input = scan.nextByte();
          break;
        } catch (Exception e) {
          System.out.print("Enter only number type byte:");
          scan.nextLine();
        }
      }
      arr[i] = input;
    }
    System.out.println("Масив" + Arrays.toString(arr));
    System.out.println("Сумма елементів масиву: " + sum(arr));
  }
}





