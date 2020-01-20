import shapes.lines.Square;
import shapes.circular.Circle;
import shapes.Info;

public class ShapeUser {
    public static void main(String[] args) {
        Info ob1=new Info();
        ob1.showInfo();
        
        Circle ob2=new Circle();
        ob2.circleArea(10);
        
        Square ob3=new Square();
        ob3.squareArea(5);
        
    }
}
