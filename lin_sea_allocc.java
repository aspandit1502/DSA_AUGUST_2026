public class lin_sea_allocc //find ALL the positions where th ele is present in the array
{
   public static void main(String[] args) {
    int[] nums ={1,2,3,4,5,6,3,7};
    int val=3;
    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]==val)
        {
            System.out.println("pos of occ is"+ (i+1));
        }
    }
   } 
}
