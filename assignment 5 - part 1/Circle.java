package assignment5;

class Circle extends Shape{
    
    double radius;
    
  //  Scanner s=new Scanner(System.in);
    
    Circle(){
        this.radius=0;
    }
    
    Circle(double radius){
        this.radius=radius;
    }
    
    Circle(double radius,String color,boolean filled){
        this.color=color;
        this.filled=filled;
        this.radius=radius;
    }
    
    double getRadius(){
        return radius;
    }
    
    void setRadius(double r){
        this.radius=r;
       }
    
    double getArea(){
        double a;
        a=Math.PI*radius*radius;
      
        return a;
    }
    
    double getPerimeter(){
        double p;
        p=2*Math.PI*radius;
        return p;
    }
    
    @Override
    public String toString(){
        return "CIRCLE "+color+" "+isfilled();
    }
    
}
