package FlowControl.IfElse;

import java.util.Scanner;

public class LoginApp {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String username = "halip26";
    String password = "halip123456";

    while (true) {
      System.out.println(" ");
      // time sleep 1 second
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      // ask user to input username
      System.out.print("Enter your username: ");
      String usernameInput = scanner.next();
      // time sleep 1 second
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      // ask user to input password
      System.out.print("Enter your password: ");
      String passwordInput = scanner.next();
      // time sleep 1 second
      try {
        Thread.sleep(1000);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
      // ask user to input confirm password
      System.out.print("Enter your password again: ");
      String confirmPassword = scanner.next();
      System.out.println("----------------------------------------");

      if (username.equals(usernameInput) && password.equals(passwordInput) && confirmPassword.equals(passwordInput)) {
        // time sleep 1 second
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println("Hi, Welcome to your account " + username);
        break;
      } else if (!username.equals(usernameInput) && password.equals(passwordInput)
          && confirmPassword.equals(passwordInput)) {
        // time sleep 1 second
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println("Wrong username, Try again!");
      } else if (username.equals(usernameInput) && !password.equals(passwordInput)
          && confirmPassword.equals(passwordInput)) {
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println("Wrong password, Try again!");
      } else if (!passwordInput.equals(confirmPassword)) {
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out.println("Confirm password doesn't match, Try again!");
      } else {
        try {
          Thread.sleep(1000);
        } catch (InterruptedException e) {
          e.printStackTrace();
        }
        System.out
            .println("Username: " + usernameInput + " & Password: " + passwordInput + " are not valid, Try again!");
      }

    }
    scanner.close();

  }
}
