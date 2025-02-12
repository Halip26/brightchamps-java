package Constructors;

import java.util.Scanner;

public class RailwayTicket {
  String name;
  String coach;
  long mobno;
  int amt;
  int totalamt;

  public static Scanner sc;

  void accept() {
    sc = new Scanner(System.in);
    System.out.print("Please Enter name: ");
    name = sc.nextLine();
    System.out.print("Please Enter coach: ");
    System.out.println(" First_AC, Second_AC, Third_AC or sleeper");
    coach = sc.nextLine();
    System.out.print("Please Enter mobno: ");
    mobno = sc.nextLong();
    System.out.print("Please Enter basic ticket amt: ");
    amt = sc.nextInt();
  }

  void update() {
    if (coach.equalsIgnoreCase("First_AC"))
      totalamt = amt + 700;
    else if (coach.equalsIgnoreCase("Second_AC"))
      totalamt = amt + 500;
    else if (coach.equalsIgnoreCase("Third_AC"))
      totalamt = amt + 250;
    else if (coach.equalsIgnoreCase("sleeper"))
      totalamt = amt;
  }

  void display() {
    System.out.println("Details of customer");
    System.out.println("Name: " + name);
    System.out.println("Coach: " + coach);
    System.out.println("Mobile Number: " + mobno);
    System.out.println("Amount: " + amt);
    System.out.println("Total Amount: " + totalamt);
  }

  public static void main(String args[]) {
    RailwayTicket obj = new RailwayTicket();
    obj.accept();
    obj.update();
    obj.display();
  }
}
