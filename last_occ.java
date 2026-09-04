public class last_occ //to find th last occ of the ele in the array
{
    public static void main(String[] args) {
        int[] nums={1,2,3,4,5,6,5,6,7,5,8};
        int val=5;
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]==val)
            {
              System.out.println(i+1);
              break;
            }
        }
    }
}
