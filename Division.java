import java .util.Scanner;
public class Division{
    public static void main(String args[]){
        int a,b;
        int qoutient;
        Scanner scanner =new Scanner(System.in);
        System.out.println("Please enter first number(numerator):");
        a=scanner.nextInt();
        System.out.println("Please enter second number (denominator)");
        b=scanner.nextInt();
        try
        {
            qoutient=a/b;
            System.out.println("Quotient="+qoutient);

        }
        catch(ArithmeticException ae)
        

        
        {

        

    
    System.out.println(ae);
}
}
}