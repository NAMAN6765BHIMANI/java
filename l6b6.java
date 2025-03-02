/* WAP that counts the number of objects created using static. [B] */

class A{
   static int count=0;

    A(){
      count++;
    }
    public void display(){
        System.out.print(count);
    }
}



public class l6b6{
    public static void main(String[] args){
    A c1=new A();
    A c2=new A();
    c1.display();
    }
}