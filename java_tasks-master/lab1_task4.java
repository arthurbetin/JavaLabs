import java.util.Scanner;

public class lab1_task4 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("Введіть n: ");
    while (!scan.hasNextInt()) {
      System.out.println("Input is not a number");
      System.out.print("Введіть розмір масиву n: ");
      scan.nextLine();
    }
    int n = scan.nextInt();

    int[][] matrix = new int[n][n];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
        matrix[i][j] = (int) (Math.random() * 10);
      }
    }
    System.out.println("Matrix: ");
    for (int i = 0; i < matrix.length; i++, System.out.println()) {
      for (int j = 0; j < matrix[i].length; j++) {
        System.out.print(matrix[i][j] + " ");
      }
    }
  }
}
