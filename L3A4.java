import java.util.Scanner;
public class L3A4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        System.out.print("enter a: ");
        a=sc.nextInt();
        System.out.print("enter b: ");
        b=sc.nextInt();
         System.out.print("enter c: ");
        c=sc.nextInt();
        int large=(a>b)?((a>c)?a:c):((b>c)?b:c);
        System.out.print("largest number is : "+large);
        

    }
}