import java.util.ArrayList;
/**
 * Write a description of class ManualMultiplier here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ManualMultiplier
{
    private int offset = 0;
    public String findProduct(String first, String second)
    {
        int[] tempFirst = toIntArray(first);
        int[] tempSecond = toIntArray(second);
        tempFirst = flip(tempFirst);
        tempSecond = flip(tempSecond);
        int[] result = multiply(tempFirst, tempSecond);
        return arrayToString(flip(condense(result)));
    }
    
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
        for(int i = 0; i < temp.length; i++)
        {
            temp[i] = array[array.length - 1 -i];
        } 
        return temp;
    }
    
    public int[] multiply(int[] first, int[] second)
    {
        int[] temp = new int[first.length + second.length];
        int index = 0;
        for(int i = 0; i < first.length ; i++)
        {
            index = i;
            for(int j = 0; j < second.length ; j++)
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
    
    public String arrayToString(int[] array)
    {
        String temp = "";
        for(int i = 0; i < array.length;i++)
        {
            temp+= array[i];
        }
        boolean unsimplified = true;
        while(unsimplified)
        {
            if(temp.substring(0, 1).equals("0"))
            {
                temp = temp.substring(1, temp.length());
            }
            else
            {
                unsimplified = false;
            }
        }
        return temp;
    }
}
