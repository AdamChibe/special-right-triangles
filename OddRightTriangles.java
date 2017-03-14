
/**
 * a^2 + b^ 2 = c^2
 * 
 * 2c - 1 = a^2
 *      where c = the larger of 2 consecutive whole integers
 *      and a = an odd number
 * 
 * @Adam Chibe 
 * @2/23/17
 */
public class OddRightTriangles
{
    private static int oddNumber;

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void main(int x)
    {
        oddNumber = 3;
        for(int i = 0; i < x; i++)
        {
            int temp = (oddNumber*oddNumber + 1)/2;
            System.out.print(oddNumber + ", " + (temp-1) + ", " + temp);
            if((temp * temp)-((temp-1) * (temp-1)) == (oddNumber * oddNumber))
            {
                System.out.println("  true");
            }else{
                System.out.println("  false");
            }
            oddNumber+=2;
        }
    }
}
