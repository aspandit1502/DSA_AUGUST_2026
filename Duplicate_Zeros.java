import java.util.Arrays;
public class Duplicate_Zeros {
    public static void main(String[] args) {
        int[]nums= {1,0,2,3,0,4,5,0};
        for(int i=0;i<nums.length-1;i++)
        {
            if(nums[i]==0)
            {
                for(int j=nums.length-2;j>i;j--)
                {
                    nums[j+1]=nums[j];
                }
                    nums[i+1]=0;
                    i++;
            }
        }
         System.out.println(Arrays.toString(nums));
    }
       
 }
    

