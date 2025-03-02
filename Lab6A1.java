class Circle{
    double r;
   Circle(double r){
        this.r=r;
    }
    public void area(){
        double area=3.14*this.r*this.r;
        System.out.print(area);
    }
}
public class Lab6A1{
    public static void main(String[] args){
        Circle c= new Circle(10);
        c.area();
       
    }
}