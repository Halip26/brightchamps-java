import java.util.Scanner;

public class additionalAssignment {
  public static void main(String[] args) {
    int exitingSubjects = 10;
    int additionalSubject;
    boolean hasAdditionalSubjects;

    System.out.println("Number of exiting subjects in your course this year: " + exitingSubjects);

    Scanner scanner = new Scanner(System.in);

    System.out.println("Have you taken additional subjects? (0:No / 1:Yes): ");
    hasAdditionalSubjects = scanner.nextInt() == 1;

    if (hasAdditionalSubjects) {
      System.out.println("Enter the number of additional subjects taken by you: ");
      additionalSubject = scanner.nextInt();
      exitingSubjects += additionalSubject;
      System.out.println("Updated number of subjects area: " + exitingSubjects);
    } else {
      System.out.println("You still have " + exitingSubjects + " subjects in your course!");
    }

    scanner.close();
  }
}
