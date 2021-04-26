package assignment5;

abstract class Shape{
    String color;
    boolean filled;
    
    Shape(){
        color="";
        filled=true;
    }
    
    Shape(String color,boolean filled){
        this.color=color;
        this.filled=filled;              
    }
    
     String getcolor(){
         return color;
     }
     void setcolor(String color){
         this.color=color;
     }
     
     boolean isfilled(){
         return filled;
     }
     
     void setfilled(boolean filled){
         this.filled=filled;
     }
     
     abstract double getArea();
     abstract double getPerimeter();
     @Override
     public String toString(){
         return color;
     }
     
}
