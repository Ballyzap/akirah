import java.util.Scanner;
public class Main {
    public static void main(String[] args);
    //convert temperature from Fahrenheit to Celsius degree
    Scanner Scan = new Scanner(System.in);
    System.out.println("Fahrenheit value");
    int x = scan.nextInt();
    int y = (x-32)*5/9;
    System.out.println("Celsius Degree :" + y);
}