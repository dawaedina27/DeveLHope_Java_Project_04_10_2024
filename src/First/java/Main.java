package First.java;

public class Main {
    public static void main(String[] args){
        Calculator calculator = new CalculatorClass();

        double digita = 10;
        double digitb = 5;

        System.out.println("Sum: " + calculator.sum(digita, digitb));
        System.out.println("Subtract: " + calculator.subtract(digita, digitb));
        System.out.println("Multiply: " + calculator.multiply(digita, digitb));

        try {
            System.out.println("Divide: " + calculator.divide(digita, digitb));
        }

        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Divide by zero: " + calculator.divide(digita, 0));
        }

        catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}