class Circle {
    /** Number of Circle object currently created */
    private static int numberOfCircles = 0;
    
    /** Instance variable */
    private double radius; 

    /** Constructor that builds a circle with radius 1 */
    public Circle() {
        radius = 1;
        numberOfCircles++;
    } 

    /** Constructor that builds a circle with given radius */
    public Circle(double r) {
        radius = r;
        numberOfCircles++;
    }

    /** Instance method - returns the area */
    public double getArea() {
        return radius * radius * 3.14159265359;
    }

    /** Instance method - return the radius */
    public double getRadius() {
        return radius;
    }

    /** Instance method - update the radius */
    public void updateRadius(double newRadius) {
        radius = newRadius;
    }

    /** Method - getNumberOfCircles() */
    public static int getNumberOfCircles() {
        return numberOfCircles;
    }
}