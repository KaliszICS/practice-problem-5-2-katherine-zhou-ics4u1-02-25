public class Circle{
    private double radius;

    public Circle (double radius){
        this.radius = radius;
    }

    public double diameter(){
        return this.radius * 2;
    }

    public double perimeter(){
        return 3.14 * this.radius *2;
    }

    public double ares(){
        return this.radius * this.radius * 3.14;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
}