package OOP.Abstraction;

import java.util.*;

abstract class Course {
  String course_name;

  public abstract double marks();

  public abstract String print();

  public Course(String course_name) {
    System.out.println("\n Course constructor calling in progress . . . ");
    this.course_name = course_name;
  }

  public String getCourseName() {
    return course_name;
  }
}

public class Main {

  public static class JuniorChamps extends Course {

    double subject1, subject2, subject3;

    public JuniorChamps(String course_name, double subject1, double subject2, double subject3) {
      super(course_name);
      System.out.println("\n JuniorChamps constructor calling in progress . . .");
      this.subject1 = subject1;
      this.subject2 = subject2;
      this.subject3 = subject3;
    }

    @Override
    public double marks() {
      double percentage = (subject1 + subject2 + subject3) / 300 * 100;
      return percentage;
    }

    @Override
    public String print() {

      double result = marks();

      if (result <= 60) {
        return "\n Sorry! Not eligible for JuniorChamps course name: " + course_name
            + "  with the scores attained, marks: " + marks() + "% !!";
      }

      else {
        return "\n Congratulations! You are eligible for JuniorChamps course name: " + course_name
            + "  with the scores attained, marks: " + marks() + "% !!";
      }

    }
  }

  public static class SeniorChamps extends Course {

    double subject1, subject2, subject3;

    public SeniorChamps(String course_name, double subject1, double subject2, double subject3) {
      super(course_name);
      System.out.println("\n SeniorChamps constructor calling in progress . . .");
      this.subject1 = subject1;
      this.subject2 = subject2;
      this.subject3 = subject3;
    }

    @Override
    public double marks() {
      double percentage = (subject1 + subject2 + subject3) / 300 * 100;
      return percentage;
    }

    @Override
    public String print() {

      double result = marks();

      if (result <= 50) {
        return "\n Sorry! Not eligible for SeniorChamps course name: " + course_name
            + " SeniorChamps with the scores attained, marks: " + marks() + "% !!";
      }

      else {
        return "\n Congratulations! You are eligible for SeniorChamps course name: " + course_name
            + " SeniorChamps with the scores attained, marks: " + marks() + "% !!";
      }

    }
  }

  private static Scanner scan;

  public static void main(String[] args) {

    scan = new Scanner(System.in);

    System.out.println("\n ********** Welcome to Course Selection Panel **********");
    System.out.println("\n Enter 1 if you belong to Junior Champ Group ");
    System.out.println("\n Enter 2 if you belong to Senior Champ Group \n");
    int choice = scan.nextInt();

    if (choice == 1) {

      System.out.println("\n Enter the name of course you would like to enroll ? ");
      String course = scan.next();
      System.out.println("\n Enter the marks of subject-1 as per your results ? ");
      int marks1 = scan.nextInt();
      System.out.println("\n Enter the marks of subject-2 as per your results ? ");
      int marks2 = scan.nextInt();
      System.out.println("\n Enter the marks of subject-3 as per your results ? ");
      int marks3 = scan.nextInt();

      JuniorChamps junior_obj = new JuniorChamps(course, marks1, marks2, marks3);

      System.out.println(junior_obj.print());

    }

    else if (choice == 2) {

      System.out.println("\n Enter the name of course you would like to enroll ? ");
      String course = scan.next();
      System.out.println("\n Enter the marks of subject-1 as per your results ? ");
      int marks1 = scan.nextInt();
      System.out.println("\n Enter the marks of subject-2 as per your results ? ");
      int marks2 = scan.nextInt();
      System.out.println("\n Enter the marks of subject-3 as per your results ? ");
      int marks3 = scan.nextInt();

      SeniorChamps senior_obj = new SeniorChamps(course, marks1, marks2, marks3);

      System.out.println(senior_obj.print());

    }

    else {
      System.out.println("\n Sorry! Thats an invalid choice. ");
    }

  }
}
