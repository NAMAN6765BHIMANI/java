//Create a class named Bank_Account with data memebers accountNo, userName, email,
//accountType and accountBalance, Also create methods getAccountDetails() and
//displayAccountDetails().[A]
import java.util.Scanner;
class Bank_Account{
int accountNo;
 String userName;
 String email;
 String accountType;
double accountBalance;

public void setAccountDetails(int accountNo,String userName,String email,String accountType,double accountBalance){
 this.userName=userName;
 this.accountNo=accountNo;
 this.email=email;
 this.accountType=accountType;
 this.accountBalance=accountBalance;
}
public void displayAccountDetails(){
 System.out.println(this.accountNo);
 System.out.println(this.userName);
 System.out.println(this.email);
 System.out.println(this.accountType);
 System.out.println(this.accountBalance);
}


}

public class Lab6A4{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Bank_Account B1=new Bank_Account();
    System.out.print("enter account NO: ");
    int accountNo=sc.nextInt();
    System.out.print("enter user name: ");
    String userName=sc.next();
    System.out.print("enter email: ");
     String email=sc.next();
     System.out.print("enter account-Type: ");
    String accountType=sc.next();
    System.out.print("enter accountBalance: ");
    double accountBalance=sc.nextDouble();
    B1.setAccountDetails(accountNo,userName,email,accountType,accountBalance);
     B1.displayAccountDetails();
    }
}