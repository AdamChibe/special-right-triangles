/**
 * Write a description of class ManualMultiplier here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ManualMultiplier
{
    private int[] first = new int[1];
    private int[] second = new int[1];
    private int[] result = new int[1];
    public ManualMultiplier(String one, String two)
    {
        first = new int[one.length()];
        second = new int[two.length()];
        for(int i = 0; i < one.length() ; i++)
        {
            first[i] = Integer.parseInt(one.substring(i, i+1));
        }
        for(int i = 0; i < two.length() ; i++)
        {
            second[i] = Integer.parseInt(two.substring(i, i+1));
        }
    }
    /*
     * need to make more methods like 
     * flip
     * convert int[] to Strin 
     * visa versa ^^^
     */
    public String doMath()
    {
        int[] tempfirst = new int[first.length];
        int[] tempsecond = new int[second.length];
        for(int i = 0; i < tempfirst.length ; i++)
        {
            tempfirst[i] = first[first.length - 1 - i];
        }
        for(int i = 0; i < tempsecond.length ; i++)
        {
            tempsecond[i] = second[second.length - 1 - i];
        }
        result = new int[100];
        int resultindex = 0;
        int keeper = 0;
        for(int i = 0; i < tempfirst.length ; i++)
        {
            resultindex = i;
            for(int j = 0; j < tempsecond.length ; j++)
            {
                result[resultindex] += tempsecond[j] * tempfirst[i];
                resultindex++;
            }
            keeper++;
        }
        
        for(int i = 0; i < result.length ; i++)
        {
            if(result[i] > 10)
            {
                result[i + 1] += (int)(result[i]/10);
            }
        }
        
        int[] tempresult = new int[result.length];
        for(int i = 0; i < tempresult.length ; i++)
        {
            tempresult[i] = result[result.length - 1 - i];
        }
        return print(tempresult);
    }
    
    public String print(int[] a)
    {
        String temp = "";
        for(int i = 0; i < a.length ; i++)
        {
            temp += a[i];
        }
        return temp;
    }
}
