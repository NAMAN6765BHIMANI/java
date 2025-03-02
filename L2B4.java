/* Write a program to convert temperature from Fahrenheit to Celsius. (Formula : c = f-
32*5/9 ); */
import java.util.Scanner;
public class L2B4{
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter f: ");
        float f=sc.nextFloat();
       float c;
       c=(f-32)*5/9;
       System.out.print("your tempreture is: "+c +"celsius" );
    }
}