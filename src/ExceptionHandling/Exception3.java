package ExceptionHandling;

public class Exception3 {

  // An exception is an event that occurs during the execution of a program
  // that disrupts the normal flow of instructions.

  public static void main(String[] args) throws Exception {

    String[] StudentList = { "Alex", "John", "Kely" };
    try {
      for (int i = 0; i <= 3; i++) {
        System.out.println(StudentList[i]);
      }

    } catch (ArrayIndexOutOfBoundsException aie) {
      // can't reference a memory location past the end of an array.
      System.out.println(aie);
    }

  }
}
