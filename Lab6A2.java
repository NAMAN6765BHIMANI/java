//Define Time class with constructor to initialize hour and minute. Also define addition
//method to add two time objects. 

class Time{
    int hour;
    int minute;
    Time(int hour,int minute){
        this.hour=hour;
        this.minute=minute;
    }
  public void addition(int hour,int minute){
    this.hour+=hour;
    this.minute+=minute;
    System.out.print(this.hour+":"+this.minute);
  }
}


public class Lab6A2{
    public static void main(String[] args){
   Time t1=new Time(6,20);
   t1.addition(4,30);

    }
}
