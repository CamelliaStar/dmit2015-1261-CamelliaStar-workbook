package dmit2015.model;

public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle() {
        radius = 1;
    }

    public Circle(double radius) {
        this.radius = radius;
        setRadius(radius);
    }

    public double area() {
        return Math.PI * (radius * radius);
    }

    static void main(String[] args) {
        Circle currentCircle = new Circle();
        currentCircle.setRadius(5);
        System.out.printf("Radius: %s, Area = %.2f",
                currentCircle.getRadius(),
                currentCircle.area());
    }
}
