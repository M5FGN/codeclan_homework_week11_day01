public class Calculator {

    private int num1;
    private int num2;
    private double num3;
    private double num4;

    public Calculator(int num1, int num2, double num3, double num4) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
    }

    public int getNum1() {
        return this.num1;
    }

    public int getNum2() {
        return this.num2;
    }

    public double getNum3() {
        return this.num3;
    }

    public double getNum4() {
        return this.num4;
    }

    public int Add(int num1, int num2) {
        int AddResult = this.num1 + this.num2;
        System.out.println("AddResult: " + AddResult);
        return AddResult;
    }

    public int Subtract(int num1, int num2) {
        int SubtractResult = this.num1 - this.num2;
        System.out.println("SubtractResult: " + SubtractResult);
        return SubtractResult;
    }

    public int Multiply(int num1, int num2) {
        int MultiplyResult = this.num1 * this.num2;
        System.out.println("MultiplyResult: " + MultiplyResult);
        return MultiplyResult;
    }

    public double Divide(double num3, double num4) {
        double DivideResult = this.num3 / this.num4;
        System.out.println("DivideResult: " + DivideResult);
        return DivideResult;
    }

}
