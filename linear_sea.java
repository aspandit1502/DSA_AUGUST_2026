public class linear_sea
 {
    public static void main(String[] args) {
        int[] nums= {1,2,3,4,5,6,99,20};
         int val=99;
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==val)
            {
              System.out.println(i+1);
            }
        }
    }
}
