import java.util.Scanner;
import java.util.Arrays;
public class insert_start {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int[]nums= new int[5];        int ele=100;  
        System.out.println("enter the array ele");

        for(int i=0;i<nums.length-1;i++) // ab here a -1 cuz you obv want the compiler to also know that i need only 4 ele
        {
            nums[i]=scan.nextInt();
        }
        for(int j=nums.length-1;j>0;j--)
        {
            nums[j]=nums[j-1];
        }
        nums[0]=ele;
        System.out.println(Arrays.toString(nums));
    }
}
