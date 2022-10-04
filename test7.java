import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //to input 5 numbers from keyboard and find their sum and average
        Scanner Scan = new Scanner(System.in);
        System.out.prinln("Enter a number");
        int a = Scan.nextInt();
        System.out.println("Enter a number");
        int b = Scan.nextInt();
        System.out.println("Enter a number");
        int c = Scan.nextInt();
        System.out.println("Enter a number");
        int d = Scan.nextInt();
        System.out.println("Enter a number");
        int e = Scan.nextInt();
        int sum = (a+b+c+d+e);
        System.out.println("total is :" + sum);
        int average = sum/5;
        Sytem.out.println("average is :" + average);
        
    }
}