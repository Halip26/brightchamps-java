package OOP.Interfaces;

interface RemoteControl {
  void turnOn();

  void turnOff();

  void changeChannel();

  void setTemperature(int temp);

  void setVolume(int vol);

  default void setTimer() {
    System.out.println("Timer is on.");
  }
}

class AirConditioner implements RemoteControl {
  public void turnOn() {
    System.out.println("Turning on the AC");
  }

  public void turnOff() {
    System.out.println("Turning the AC off");
  }

  public void setTemperature(int temp) {
    System.out.println("Setting AC temp to  " + temp + "C");
  }
}

class Bulb implements RemoteControl {
  public void turnOn() {
    System.out.println("Turning the lights on");
  }

  public void turnOff() {
    System.out.println("Turning the lights off");
  }

  public void setTemperature(int temp) {
    System.out.println("Setting AC temp to " + temp + "C");
  }
}

class TV implements RemoteControl {
  public void turnOn() {
    System.out.println("Turning the TV on");
  }

  public void turnOff() {
    System.out.println("Turing the TV off");
  }

  public void changeChannel() {
    System.out.println("Changing to next channel");
  }

  public void setVolume(int vol) {
    System.out.println("TV volume set to: " + vol);
  }
}

public class InterfaceLionel {
  public static void main(String[] args) {

    RemoteControl ac = new AirConditioner();
    RemoteControl blub = new Bulb();
    RemoteControl tv = new TV();

    System.out.println("\n--- Testing Air Conditioner ---");
    ac.turnOn();
    ac.setTemperature(24);
    ac.setTimer();
    ac.turnOff();

    System.out.println("\n--- Testing Bulb ---");
    bulb.turnOn();
    bulb.setTemperature(25);
    bulb.setTimer();
    bulb.turnOff();

    System.out.println("\n--- Testing the TV ---");
    tv.turnOn();
    tv.setTemperature(18);
    tv.setVolume(30);
    tv.setTimer();
    tv.turnOff();
  }
}
