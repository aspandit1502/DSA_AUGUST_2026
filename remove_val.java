public class remove_val
{
    public static void main(String[] args) 
    {
        int [] nums={3,4,2,3,3,6,3,8,5,2};
        int val=3;
        int k=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val)
            {
               k++;
            }
        }
        System.out.println("the number of ele left after removing the value is " + k);
    }
}
