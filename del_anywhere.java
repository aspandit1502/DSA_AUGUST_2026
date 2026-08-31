public class del_anywhere 
{
    public static void main(String[] args) {
        int[] nums= {1,2,3,4,5};
        int pos=2; //index of ele jo delete karna hai
        for(int i=pos;i<nums.length-1;i++)
        {
            nums[i]=nums[i+1];
        }
        int size=nums.length-1;
        for(int j=0;j<size;j++)
        {
            System.out.println(nums[j]+ " ");
        }
    }
}
