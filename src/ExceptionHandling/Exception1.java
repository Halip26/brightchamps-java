package ExceptionHandling;

// Main class
public class Exception1 {
  public static void main(String[] args) {
    int a = 10;
    int b = 0;
    try {
      @SuppressWarnings("unused")
      int c = a / b;
    } catch (Exception e) {
      System.out.println(e);
      System.out.println(e.getMessage());
    }
    System.out.println("End");
  }

}