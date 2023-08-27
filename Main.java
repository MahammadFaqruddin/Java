class Calculator {
    
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    
    public Calculator() {
        System.out.println("Default Constructor");
    }
    public Calculator(int num) {
        System.out.println("Constructor with one parameter: " + num);
    }
 public Calculator(int num1, int num2) {
        System.out.println("Constructor with two parameters: " + num1 + ", " + num2);
    }
}
public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();  
        System.out.println("Sum 1: " + calculator.add(5, 10));  
        System.out.println("Sum 2: " + calculator.add(3.5, 7.2)); 
        System.out.println("Sum 3: " + calculator.add(1, 2, 3));  
        System.out.println();
        Calculator calculator1 = new Calculator(100);  
        Calculator calculator2 = new Calculator(20, 30); 
    }
}
