package assignment5;

public class Shapes {

    
    public static void main(String[] args) {
        Circle c=new Circle(5,"BLUE",true);
        Rectangle r=new Rectangle(4,6,"RED",true);
        Square s=new Square(7,"GREEN",false);
        s.setWidth(s.getSide());
        s.setLength(s.getSide());
        
        double areacircle=c.getArea();
        double arearectangle=r.getArea();
        double areasquare=s.getArea();
        double pericircle=c.getPerimeter();
        double perirect=r.getPerimeter();
        double perisquare=s.getPerimeter();
               
        
        System.out.println(c.toString());
        System.out.println("Area of Circle:="+areacircle);
		System.out.println("Perimeter of the Circle = "+pericircle);
        System.out.println(r.toString());
        System.out.println("Area of Rectangle:="+arearectangle);
        System.out.println("Perimeter of the Rectangle= "+perirect);
        System.out.println(s.toString());
        System.out.println("Area of Square:="+areasquare);
        System.out.println("Perimeter of the Square is gicen by: "+perisquare);
        
    }
    
}

