/* write a program in Java to demonstrate use of this keyword. Check whether this can
access the Static variables of the class or not.[C] */

 class A{
  static int i;
  static int j;

  A(int i,int j){
  this.i=i;
  this.j=j;
 }
   static public void display(int i,int j){
    System.out.print(this.i);
    System.out.print(this.j);
  }

}


public class l6c7{
    public static void main(String[] args){
    A.display(10,20);
    }
}