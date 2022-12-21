class Circle {
    /** Instance variable */
    double radius; 

    /** Constructor that builds a circle with radius 1 */
    Circle() {
        radius = 1;
    } 

    /** Constructor that builds a circle with given radius */
    Circle(double r) {
        radius = r;
    }

    /** Instance method - returns the area */
    double getArea() {
        return radius * radius * 3.14159265359;
    }

    /** Instance method - return the radius */
    double getRadius() {
        return radius;
    }

    /** Instance method - update the radius */
    void updateRadius(double newRadius) {
        radius = newRadius;
    }
}