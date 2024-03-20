package OOP.Interfaces;

interface remotecontrol {
  public void turnon();

  public void turnoff();

  public void set_temperature(int temp);

  default void set_Timer() {
    System.out.println("Timer is ON");
  }
}

class Airconditioner implements remotecontrol {
  public void turnon() {
    System.out.println("Turning on the AC");
  }

  public void turnoff() {
    System.out.println("Turning off the AC");
  }

  public void set_temperature(int user_temp) {
    System.out.println("Setting the temperature to " + user_temp + " degree celsuis");
  }
}

class Bulb implements remotecontrol {
  public void turnon() {
    System.out.println("Turning on the bulb");
  }

  public void turnoff() {
    System.out.println("Turning off the bulb");
  }

  public void set_temperature(int user_temp) {
    System.out.println("Setting the temperature to " + user_temp + " degree celsuis");
  }
}

public class Main {
  public static void main(String args[]) {
    Airconditioner ac = new Airconditioner();
    ac.turnon();
    ac.set_temperature(24);
    // calling the default methods in interface
    ac.set_Timer();
    ac.turnoff();
    Bulb b = new Bulb();
    b.turnon();
    b.set_temperature(-25);
    b.turnoff();
  }
}
