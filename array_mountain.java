public class array_mountain{
     public static boolean montain(int nums[])
     {
        //int[] nums= {};
        int i=0;
        int n=nums.length;
        while  (i+1<n&&nums[i]<nums[i+1])
        {
            i++;
        }
        if(i==0 || i==n-1)
        {
            return false;
            
        }
        while(i+1<n && nums[i]>nums[i+1] )
        {
            i++;
        }
        return i==n-1;

     }

     public static void main(String [] args)
     {
        int[] nums={1,2,1,1,1};
        System.out.println(montain(nums));
     }
}