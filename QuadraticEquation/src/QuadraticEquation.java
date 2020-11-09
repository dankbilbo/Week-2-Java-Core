import java.lang.Math;
public class QuadraticEquation {
    private double a, b, c;
    QuadraticEquation(){}
    QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double getRoot1(){
        return (-b + Math.sqrt(getDiscriminant())) / 2 * a;
    }
    public double getRoot2(){
        return (-b - Math.sqrt(getDiscriminant())) / 2 * a;
    }
    public double getDiscriminant(){
        return (b * b) - 4 * a * c;
    }
    public double getA(){
        return this.a;
    }
    public double getB(){
        return this.b;
    }
    public double getC(){
        return this.c;
    }
    public void setA(double a){
        this.a = a;
    }
    public void setB(double b){
        this.b = b;
    }
    public void setC(double c){
        this.c = c;
    }

}
