public class nanddouble
{
    public static boolean checkdouble(int nums[])
    {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(nums[i]==2*nums[j] && i!=j)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) 
    {
         int[] nums= {7,2,10,9,2};
         System.out.println(checkdouble(nums));

    }
}
