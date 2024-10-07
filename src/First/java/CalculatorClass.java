//implement this interface from 'CalculatorClass' and implement necessary functions.
//
//All the classes and interface and main function should be in separate files.
package First.java;

public class CalculatorClass implements Calculator{

    @Override
    public double sum(double i, double j){
        return (i+j);
    }

    @Override
    public double subtract(double i, double j) {
        return i-j;
    }

    @Override
    public double multiple(double i, double j) {
        return i*j;
    }

    @Override
    public double divide(double i, double j) {
        return i/j;
    }

}
