public class Calc {

    // private data fields
    private double num1;
    private double num2;

    // *** no-argument constructor required by Runner ***
    public Calc() {
        num1 = 0;
        num2 = 0;
    }

    // getters
    public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    // setters
    public void setNum1(double n1) {
        num1 = n1;
    }

    public void setNum2(double n2) {
        num2 = n2;
    }

    // *** method names must match Runner ***
    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        return num1 / num2;
    }

    @Override
    public String toString() {
        return "Num1: " + num1 + "\nNum2: " + num2;
    }
}
