public class Circle{
    private double radius;

    public Circle (double radius){
        this.radius = radius;
    }

    public double diameter(){
        return this.radius * 2;
    }

    public double perimeter(){
        return Math.PI * this.radius *2;
    }

    public double area(){
        return this.radius * this.radius * Math.PI;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
}