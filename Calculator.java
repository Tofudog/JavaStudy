class Calculator {

    private double num1;
    private double num2;

    public Calculator(int n1, int n2) {
        num1 = n1;
        num2 = n2;
    }

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

    public static void main(String []args) {
        Calculator cal = new Calculator(1, 4);
        System.out.println(cal.subtract());
    }

}