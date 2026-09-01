public class remove_dup 
{
    public static void main(String[] args) {
        int [] nums={1,1,3,3,5,6,7,7};
        int k=1;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]!=nums[i+1])
                {
                    nums[k]=nums[i+1];
                   k++;
                }
            
        }
        System.out.println(k);
    }
}
