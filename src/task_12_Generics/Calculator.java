package task_12_Generics;
// Create a generic calculator class named Calculator<T> that can perform basic arithmetic operations on two values of type T.
// The calculator should support addition, subtraction, multiplication, and division. Implement methods for each operation.

public class Calculator<T extends Number> {
    //private T addResult;
    // private T substractResult;
    // private T multiplyResult;
    // private T divideResult;

    public T add(T a, T b) {
        if (a instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() + b.intValue());
        } else if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
        } else {
            throw new UnsupportedOperationException("Unsupported numeric type");
        }
    }

    public T subtract(T a, T b) {
        if (a instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() - b.intValue());
        } else if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() - b.doubleValue());
        } else {
            throw new UnsupportedOperationException("Unsupported numeric type");
        }
    }

    public T multiply(T a, T b) {
        if (a instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() * b.intValue());
        } else if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() * b.doubleValue());
        } else {
            throw new UnsupportedOperationException("Unsupported numeric type");
        }
    }

    public T divide(T a, T b) {
        if (a instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() / b.intValue());
        } else if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() / b.doubleValue());
        } else {
            throw new UnsupportedOperationException("Unsupported numeric type");
        }
    }

    public static void main(String[] args) {

        Calculator<Integer> calculator = new Calculator<>();
        double addResult = calculator.add(12, -3);
        Calculator<Double> calculator1 = new Calculator<>();
        System.out.println("Addition result is " + addResult);
        double subtractResult = calculator1.subtract(12.4, -3.0);
        System.out.println("Subtraction result is " + subtractResult);
        double multiplyResult = calculator1.multiply(12.4, -3.0);
        System.out.println("Multiplication result is " + multiplyResult);
        double divideResult = calculator1.divide(12.4, 0.1);
        System.out.println("Division result is " + divideResult);
    }
}
