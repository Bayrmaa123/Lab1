public class Circle {

    /**
     * Дугуй
     * Энэ класс нь дугуйн радиусыг хадгалж,
     * талбай болон хүрээний уртыг тооцоолдог.
     */

    double radius;

    // constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    // талбай олох
    public double area() {
        return Math.PI * radius * radius;
    }

    // периметр олох
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    // мэдээлэл хэвлэх
    public void printInfo() {
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + area());
        System.out.println("Perimeter: " + perimeter());
    }
} 
