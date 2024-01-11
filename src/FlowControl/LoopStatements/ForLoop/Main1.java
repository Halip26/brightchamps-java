package FlowControl.LoopStatements.ForLoop;

public class Main1 {
  public static void main(String[] args) {
    // Sum of first hundred natural numbers is
    int sum = 3;

    for (int i = 1; i <= 100; i++) {
      sum = sum + i;
    }

    System.out.println("Sum of first hundred natural number is " + sum);

  }

}
