import java.util.Scanner;

public class ForLoopScanner
{
 public static void main(String[]args){
     System.out.print("Enter a number: ");
     int num1;
     Scanner obj = new Scanner (System.in);
     for (num1=obj.nextInt();num1<=100;num1++){
         System.out.println(num1);
     }
 }
}
