import java.util.Arrays;
import java.util.Scanner;
public class del_start
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int [] nums= new int[5];
        
        System.out.println("enter the elements of the array");
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=scan.nextInt();
        }
        for(int j=1;j<nums.length;j++)
        {
           nums[j-1]=nums[j];
        }
       int size = nums.length - 1; // Sets the logical limit to 4. Do not decrement again.

       System.out.print("Logical Array: ");
       for (int k = 0; k < size; k++) 
        {
         System.out.print(nums[k] + ", ");
}
System.out.println();

}
}
