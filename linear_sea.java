public class linear_sea //find the first occ of the element
 {
    public static void main(String[] args) {
        int[] nums= {1,2,3,4,5,6,99,20};
         int val=99;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==val)
            {
              System.out.println(val+" is found at position "+ (i+1) +" in the array");
              break;
            }
        }
    }
}
