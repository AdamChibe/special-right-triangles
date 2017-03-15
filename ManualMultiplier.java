import java.util.ArrayList;
/**
 * Write a description of class ManualMultiplier here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ManualMultiplier
{
    /*
    private int[] first = new int[1];
    private int[] second = new int[1];
    private int[] result = new int[1];
    public ManualMultiplier(String one, String two)
    {
        first = toIntArray(one);
        second = toIntArray(two);
    }
    */
    
    public int[] toIntArray(String str)
    {
        int[] temp = new int[str.length()]; 
        for(int i = 0; i < str.length() ; i++)
        {
            temp[i] = Integer.parseInt(str.substring(i, i+1));
        }
        return temp;
    }
    
    public int[] flip(int[] array)
    {
        int[] temp = new int[array.length]; 
        for(int i = 0; i < array.length ; i++)
        {
            temp[i] = array[array.length - 1 - i];
        }
        return temp;
    }
    
    public int[] multiply(int[] first, int[] second)
    {
        int[] temp = new int[first.length + second.length];
        int index = 0;
        for(int i = 0; i < first.length ; i++)
        {
            index = 0;
            for(int j = 0; i < second.length ; j++)
            {
                temp[index] += first[i] * second[j];
                index++;
            }     
        }
        return temp;
    }
    
    public int[] condense(int[] array)
    {
        int[] temp = new int[array.length + 1];
        for(int i = 0; i < array.length ; i++)
        {
            temp[i] = array[i];
        }
        for(int i = 0; i < temp.length ; i++)
        {
           if(temp[i] >=10)
           {
               temp[i+1] += (int)(temp[i]/10);
               temp[i] %= 10;
           }
        }
        return temp;
    }
}
