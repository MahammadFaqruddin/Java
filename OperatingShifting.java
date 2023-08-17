import java.util.Scanner;
public class OperatingShifting{
    public static void main(String args[]){
        byte x,y;
        x=10;y=10;
        System.out.println("Bitwise Left Shift:x<<2="+(x<<2));
        System.out.println("Bitwise Right Shift:x>>2="+(x>>2));
        System.out.println("Bitwise zero fill Right shift:x>>>2="+(x>>>2));
    }
}