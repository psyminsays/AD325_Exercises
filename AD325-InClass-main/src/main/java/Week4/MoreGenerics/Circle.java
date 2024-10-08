package Week4.MoreGenerics;

public class Circle implements Comparable<Circle>, Measurable {
    private double radius;

    public Circle()
    {
    } // end default constructor

    public Circle(double newRadius)
    {
        radius = newRadius;
    } // end constructor

    public void setRadius(double newRadius)
    {
        radius = newRadius;
    } // end setRadius

    public double getRadius()
    {
        return radius;
    } // end getRadius

    public double getCircumference()
    {
        return 2.0 * Math.PI * radius;
    } // end getCircumference

    public double getPerimeter() // Measurable interface
    {
        return getCircumference();
    } // end getPerimeter

    public double getArea()      // Measurable interface
    {
        return Math.PI * radius * radius;
    } // end getArea

    public String toString()
    {
        return radius + " ";
    } // end toString

    public int compareTo(Circle other)
    {
        int result;
        if (this.equals(other))
            result = 0;
        else if (radius < other.radius)
            result = -1;
        else
            result = 1;

        return result;
    } // compareTo

    public boolean equals(Object other)
    {
        boolean result;
        if ((other == null) || (getClass() != other.getClass()))
            result = false;
        else
        {
            Circle otherCircle = (Circle)other;
            result = (radius == otherCircle.radius);
        } // end if

        return result;
    } // end equals
}
