public class GameOutcome {

  public static void main(String[] args) {
    boolean trying = true;

    if (trying) {
      double winChance = Math.random(); 

      if (winChance > 0.5) {
        System.out.println("I tried and I won!");
      } else {
        System.out.println("I tried but I lost.");
      }
    } else {
      System.out.println("I didn't try, so I lost.");
    }
  }
}