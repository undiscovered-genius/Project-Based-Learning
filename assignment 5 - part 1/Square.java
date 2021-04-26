package assignment5;

class Square extends Rectangle{
    double side;
    Square(){
        this.side=0;
    }
    Square(double side){
        this.side=side;
    }
    Square(double side,String color,boolean filled){
        this.side=side;
        this.color=color;
        this.filled=filled;
    }
    double getSide(){
        return side;
    }
    void setSide(double side){
        this.side=side;
       
    }
    void setWidth(double side){
        this.width=side;
    }
    void setLength(double side){
        this.length=side;
    }
    @Override
    public String toString(){
        return "Square "+color+" "+isfilled();
    }
}
