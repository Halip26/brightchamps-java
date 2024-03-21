package Multithreading;

class Printer extends Thread {
  public void run() {
    int print_pages = 10;
    for (int i = 1; i <= print_pages; i++) {
      System.out.println(" Printing page : " + i);
      // Assume paper needs to loaded in printer for every 2 pages
      if (i % 2 == 0) {
        boolean paper_not_loaded = true;
        if (paper_not_loaded) {
          try {
            System.out.println("loading the paper to paper tray");
            Thread.sleep(10);
          } catch (Exception e) {
          }
          paper_not_loaded = true;
        }
      }
    }
  }
}

class Email extends Thread {
  public void run() {
    int image_file = 10;
    for (int i = 1; i <= image_file; i++) {
      System.out.println(" uploading image file : " + i);
    }
    System.out.println("Sending Email after uploading image file");
  }
}

public class Main {
  public static void main(String args[]) {
    Printer t1 = new Printer();
    Email t2 = new Email();
    System.out.println("Thread name : " + t1.getName() + " Thread Id : " + t1.getId());
    t1.start();
    t2.start();
  }
}