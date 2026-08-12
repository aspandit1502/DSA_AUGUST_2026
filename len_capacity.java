import java.util.Scanner;
public class len_capacity {
    public static void main(String[] args) {
        int[] num= new int[5];
        Scanner scan= new Scanner(System.in);
        System.out.println("enter the first 3 array ele");
        int len=0;
        for(int i=0;i<3;i++)
        {
            num[i]=scan.nextInt();
            len++;
        }
        System.out.println("the capacity of the arrayis "+ num.length);
        System.out.println("the length of the array is "+ len);
    }
    
}
