//public class insert_random {
import java.util.Scanner;
import java.util.Arrays;
public class insert_random {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int[]nums= new int[7];  
        
        System.out.println("enter the element to add and the index");
        int ele=scan.nextInt();
        int index= scan.nextInt();
        //System.out.println("enter the index to add");
          if(index>nums.length || index<0){
            System.out.println(" not possible as array index out of bounds");
            return;
        } 
        System.out.println("enter the array ele");
        for(int i=0;i<nums.length-1;i++) // ab here  -1 cuz you obv want the compiler to also know that i need only 6 ele(one less than total taaki add kar sake ele ko)
        {
            nums[i]=scan.nextInt();
        }
        for(int j=nums.length-1;j>index;j--)
        {
            nums[j]=nums[j-1];
        }
        nums[index]=ele;
        System.out.println(Arrays.toString(nums));
    }
}

    

