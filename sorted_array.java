import java.util.Arrays;
public class sorted_array {
    public static void main(String[] args) {
        int []nums= {-4,-1,0,3,10};
        int left=0;
        int right=nums.length-1;
        int[] res = new int[nums.length];
        int p=res.length-1;

        while(left<=right)
        {
            // do not directly use nums[left or right ] here cuz you see then when left or right any one of them stays the same tab 
            //the number we have keeps squaring itsel
            //for the -4 and 10 case left stayed the same as 0
            //and right after while wekt that nums[left]= (-4*-4=16)
            //so the next time it'll be 16*16
            int lsqr=nums[left]* nums[left];
            int rsqr= nums[right]* nums[right];

            if(lsqr>rsqr)
            {
                res[p]= lsqr;
                left++;
                p--;
            }
            else
            {
               res[p]= rsqr;
               right--;
               p--;
            }
        }
        //res[p]=nums[left]; // last ele thats left when left!< right // or insted just do while(left<= right)
        //System.out.println(res[]); // how do i print an array????
        System.out.println(Arrays.toString(res));
    }
    
}
