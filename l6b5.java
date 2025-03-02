/* Define class for Complex number with real and imaginary as data members. Create its
constructor, overload the constructors. Also define addition method to add two
complex objects. [B]
 */
import java.util.Scanner;
class Complex{
  int real;
  int img;

Complex(){
   real=0;
   img=0;
} 
Complex(int real,int img){
    this.real=real;
    this.img=img;
}
 public void addition(Complex c2){
    this.real+=c2.real;
    this.img+=c2.img;
    System.out.print(this.real + ":" + this.img);
 }

}

public class l6b5{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("enter 1st real number: ");
    int r1=sc.nextInt();
    System.out.print("enter 1st img number: ");
    int i1=sc.nextInt();
    System.out.print("enter 2nd real number: ");
    int r2=sc.nextInt();
    System.out.print("enter 2nd img number: ");
    int i2=sc.nextInt();
    Complex c1=new Complex(r1,i1);
    Complex c2=new Complex(r2,i2);
    c1.addition(c2);
  
    }
}