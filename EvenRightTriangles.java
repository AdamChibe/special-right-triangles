
/**
 * a^2 + b^ 2 = c^2
 * 
 * 
 * @Adam Chibe 
 * @2/23/17
 */
public class EvenRightTriangles
{
    private static int number;

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public static void main(int x)
    {
        number = 2;
        for(int i = 0; i < x; i++)
        {
            System.out.print(number + ", " + ((number*number)/4 - 1) + ", " + ((number*number)/4 + 1));
            if((number*number) + (((number*number)/4 - 1)*((number*number)/4 - 1)) == (((number*number)/4 + 1)*((number*number)/4 + 1)))
            {
                System.out.print(", true\n");
            }
            else
            {
                System.out.print(", false\n");
            }
            number+=2;
        }
    }
}
