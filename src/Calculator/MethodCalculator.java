package Calculator;

public class MethodCalculator {
  public int addition(int a, int b) {
    return a + b;
  }

  public int subtraction(int a, int b) {
    return a - b;
  }

  public int multiplication(int a, int b) {
    return a * b;
  }

  public int division(int a, int b) {
    return a / b;
  }

  public int floorDivision(int a, int b) {
    return Math.floorDiv(a, b);
  }

  public int modulo(int a, int b) {
    return a % b;
  }
}
