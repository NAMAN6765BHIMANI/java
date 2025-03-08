/* Declare a class called Student having following data members:id_no,
no_of_subjects_registered, subject_code, subject_credits, grade_obtained and spi.
Define constructor and calculate_spi methods. Define main to instantiate an array for
objects of class student to process data of n students to be given as command line
arguments. [A] */
import java.util.Scanner;
class Student{
    int id_no;
    int no_of_subjects_registered;
    int[] subject_credits;
    String[] subject_code;
   String[] grade_obtained;
    double spi;

    Student(int id_no,int no_of_subjects_registered,int[] subject_credits,String[] subject_code,String[] grade_obtained){
     this.id_no=id_no;
     this.no_of_subjects_registered=no_of_subjects_registered;
     this.subject_credits=subject_credits;
     this.subject_code=subject_code;
     this.grade_obtained=grade_obtained;
    }  
    public int greadpoint(String grade_obtained){
      if(grade_obtained.equals("A")){
        return 10;
      }
      else if(grade_obtained.equals("B")){
        return 9;
      }
      else if(grade_obtained.equals("C")){
        return 8;
      }
        else{
            return 0;
        }
      
    }
    public void spi(){
        int total_point=0;
        int total_credit=0;
        int point=0;
        for(int i=0;i<no_of_subjects_registered;i++){
        total_credit+=subject_credits[i];
        point+=subject_credits[i]*greadpoint(grade_obtained[i]);
        }
        this.spi=(double)point/total_credit;
        System.out.print(this.spi);
    } 
}
public class Lab7A{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter id no: ");
        int id_no=sc.nextInt();
        System.out.print("enter no of subject registered: ");
        int no_of_subjects_registered=sc.nextInt();
        int[] subject_credits=new int[no_of_subjects_registered];
        String[] subject_code=new String[no_of_subjects_registered];
        String[] grade_obtained=new String[no_of_subjects_registered];
        for(int i=0;i<no_of_subjects_registered;i++){
         System.out.print("enter subject code: ");
         subject_code[i]=sc.next();
         System.out.println("enter subject credit: ");
         subject_credits[i]=sc.nextInt(); 
         System.out.println("enter subject +(i+1)+ gread: ");
          grade_obtained[i]=sc.next();
          
        }
        Student s1=new Student(id_no,no_of_subjects_registered,subject_credits,subject_code,grade_obtained);
            s1.spi();
    } 
}