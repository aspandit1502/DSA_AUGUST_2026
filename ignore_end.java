import java.util.Scanner;
public class ignore_end {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int[] nums= new int[5];
        System.out.println("Enter the array ele");
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=scan.nextInt();
        }
        int size= nums.length-1;
        System.out.println("after effect");
        for(int j=0;j<size;j++)
        {
            System.out.println(nums[j]+ " ");
        }
    }
    
}
