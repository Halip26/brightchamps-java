package ClassAndObject;

// Lesson 3 : Classes & Objects
import java.util.Scanner;

// Class for defining MyProfile of the student
class MyProfile {
  // class attributes/properties, so here are attributes of student profile
  int id;
  String name;
  String nick_name;
  int age;
}

// MyMarkSheet class declaration and definition
class MyMarkSheet {
  double math;
  double science;

  double english;
  double bahasa;
}

public class MakeProfile {
  public static void main(String[] args) {
    try (Scanner reader = new Scanner(System.in)) {

      // create profile1 as a object of class MyProfile
      MyProfile Profile1 = new MyProfile();
      System.out.println("Enter Profile ID: ");
      Profile1.id = reader.nextInt();
      System.out.println("Enter Your Name: ");
      Profile1.name = reader.next();
      System.out.println("Enter Your Nick Name: ");
      Profile1.nick_name = reader.next();
      System.out.println("How old are you: ");
      Profile1.age = reader.nextInt();

      System.out.println("Profile created successfully");
      System.out.println("Profile ID: " + Profile1.id);
      System.out.println("Student Name: " + Profile1.name);
      System.out.println("Assigned Nickname: " + Profile1.nick_name);
      System.out.println("Student Age: " + Profile1.age);

      // Marksheet1 is object of class MyMarkSheet
      MyMarkSheet MarkSheet1 = new MyMarkSheet();

      System.out.println("Enter marks in Math (out of 100): ");
      // Taking input in class parameters through object
      MarkSheet1.math = reader.nextInt();
      System.out.println("Enter marks in Science (out of 100): ");
      MarkSheet1.science = reader.nextInt();
      System.out.println("Enter marks in English (out of 100): ");
      MarkSheet1.english = reader.nextInt();
      System.out.println("Enter marks in Bahasa (out of 100): ");
      MarkSheet1.bahasa = reader.nextInt();

      // Calculating sum of marks of all subjects
      double TotalScore = MarkSheet1.math + MarkSheet1.science + MarkSheet1.english + MarkSheet1.bahasa;

      // Calculating the percentage of the score
      double percentage = TotalScore / 4;

      System.out.println("The Reports: ");
      System.out.println("Percentage: " + percentage);

    }

  }
}
