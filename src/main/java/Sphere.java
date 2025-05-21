class Sphere extends Circle{
    private double radius;


    public Sphere(double radius){
        super(radius);
        this.radius = radius;
    }

    public double area(){
        return this.radius* this.radius * 4 * Math.PI;
    }

    public double volume(){
        return this.radius*this.radius*this.radius*(4.0/3.0)*Math.PI;
    }
    }
    
