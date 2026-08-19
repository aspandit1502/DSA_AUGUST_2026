//public class even_dig {
    class even_dig
{
    public int findNumbers(int[] nums)
    {
        //int count=0;
        int op=0;
        for(int i=0;i<nums.length;i++)
        {
            int cno=nums[i];
            int count=0; //inside the loop as it has to reset everytime
            while(cno>0)
            {
                cno=cno/10;
                count++;
            }
            if(count%2==0)
            {
                op++;
            }
        }
      return op;  
    }
}
    

