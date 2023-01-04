// Test the circle class (object)

class StaticCircleTest {
    public static void main(String[] args) {
        // The number of circle objects before the program gets started
        System.out.println("Number of circle objects: " + Circle.getNumberOfCircles());
        
        // Create a new circle object called "circle1"
        // **Notice this is creating the default circle
        Circle circle1 = new Circle();

        // Test methods of the new circle?
        System.out.println("The radius of circle1 is " + circle1.getRadius());
        System.out.println("The area of circle1 is " + circle1.getArea());

        circle1.updateRadius(2);
        System.out.println("The radius of circle1 after updating the radius is " + circle1.getRadius());
        System.out.println("The area of circle1 after updating the radius is " + circle1.getArea());

        // Create another circle object called "circle2" with a radius of 5.4
        Circle circle2 = new Circle(5.4);

        // Test methods of the new circle?
        System.out.println("The radius of circle2 is " + circle2.getRadius());
        System.out.println("The area of circle2 is " + circle2.getArea());

        // The number of circle object at the end of the program
        System.out.println("Number of circle objects: " + Circle.getNumberOfCircles());
    }
}