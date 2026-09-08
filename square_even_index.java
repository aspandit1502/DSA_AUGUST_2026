import java.util.Arrays;
public class square_even_index
{
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        for(int i=0;i<nums.length;i=i+2)
        {
            nums[i]*=nums[i];
        }
        System.out.println(Arrays.toString(nums));
    }
}