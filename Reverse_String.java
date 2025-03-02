import java.util.Scanner;
public class large{
    public static void main(String[] args){
   Scanner sc=new Scanner(System.in);
   System.out.print("enter a string");
    String name=sc.nextLine();
    for(int i=name.length()-1;i>=0;i--){
        System.out.print(name.charAt(i));
    }
  
}
}