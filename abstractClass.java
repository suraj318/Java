
abstract class Shape{
    abstract public double x(double x);
    abstract public double y(double y);

    public void move(){
        System.out.println("Hello, In Abstract Class");
    }
    
}

class Rec extends Shape{
    @Override
    public double x(double x) {
        return x;
    }
    @Override
    public double y(double y) {
        return y;
    }
}

public class abstractClass {
    public static void main(String[] args) {
        Rec rec= new Rec();
        System.out.println(rec.x(12));
        System.out.println(rec.y(11));


    }        

}
