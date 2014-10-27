// -------------------------------------------------------------------------
/**
 *  This class contains methods that students will run unit tests on
 *  to check that the methods perform the expected behavior.
 *
 *  @author  Danny Tan
 *  @version Jul 27, 2014
 */
public class Mystery
{
    //~ Instance/static variables .............................................

    private String name;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new Mystery object.
     * @param theName the object name
     */
    public Mystery (String theName)
    {
        setName(theName);
    }


    //~ Methods ...............................................................

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }


    /**
     * @param name the name to set
     */
    public void setName(String name)
    {
        this.name = name;
    }


    // ----------------------------------------------------------
    /**
     * Computes the greatest common divisor (or greatest
     * common factor) of two integers -- the largest positive
     * integer that divides the numbers without a remainder.
     * @param a -- first integer to compute GCD from
     * @param b -- second integer to compute GCD from
     * @return  greatest common divisor (GCD)
     */
    public int mystery1(int a, int b)
    {
        while (a != b) {
            if (a > b) {
                a -= b;
            }
            else {
                b -= a;
            }
        }
        return a;
    }


    // ----------------------------------------------------------
    /**
     * Solves for the larger x value given the equation
     * a*x^2 + b*x + c = 0
     * @param a from a*x^2 + b*x + c = 0
     * @param b from a*x^2 + b*x + c = 0
     * @param c from a*x^2 + b*x + c = 0
     * @return larger root
     */
    public double mystery2(double a, double b, double c)
    {
        double root1 = (-b + Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
        double root2 = (-b - Math.sqrt(Math.pow(b, 2) - 4*a*c)) / (2*a);
        return Math.max(root1, root2);
    }

}
