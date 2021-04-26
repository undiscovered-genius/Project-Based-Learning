package assignment5;

class Rectangle extends Shape{
    double width,length;
    Rectangle(){
        this.length=0;
        this.width=0;
    }
    
    Rectangle(double width,double length){
        this.width=width;
        this.length=length;
    }
    
    Rectangle(double width,double length,String color,boolean filled){
        this.width=width;
        this.length=length;
        this.color=color;
        this.filled=filled;
    }
    
    double getwidth(){
        return width;
    }
    
    double getLength(){
        return length;
    }
    
    void setWidth(double width){
        this.width=width;
    }
    
    void setLength(double length){
        this.length=length;
    }
    
    
    double getArea(){
        return length*width;
    }
    
    double getPerimeter(){
        return 2*(length + width);
    }
    @Override
    public String toString(){
        return "Rectangle "+color+" "+isfilled();
    }
    
    
}
