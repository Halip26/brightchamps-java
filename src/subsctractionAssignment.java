import java.util.Scanner;

public class subsctractionAssignment {
  public static void main(String[] args) {
    int exitingSubjects = 20;
    int additionalSubject;
    boolean hasAdditionalSubjects;

    System.out.println("Number of existing subjects in your course this year: " + exitingSubjects);

    Scanner scanner = new Scanner(System.in);

    System.out.println("Would you like to decrease ur subjects (0:No / 1:Yes): ");
    hasAdditionalSubjects = scanner.nextInt() == 1;

    if (hasAdditionalSubjects) {
      System.out.println("Enter the number of decrease subjects you want: ");
      additionalSubject = scanner.nextInt();
      exitingSubjects += additionalSubject;
      System.out.println("Updated number of subjects area: " + exitingSubjects);
    } else {
      System.out.println("You still have " + exitingSubjects + " subjects in your course!");
    }

    scanner.close();
  }
}
