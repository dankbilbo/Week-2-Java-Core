public class Rectangle {
    double width;
    double height;
    Rectangle(){}
    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    public double getArea(){
        return width * height;
    }
    public double getPerimeter(){
        return 2 * (width + height);
    }
    public void display(){
        System.out.println("Area : " + getArea());
        System.out.println("Perimeter : " + getPerimeter());
    }
    public void setWidth(double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }
}
