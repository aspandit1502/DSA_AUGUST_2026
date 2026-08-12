//when you need teh input from the user you use the impot java.util...... and then scanner scan= new ......
import java.util.Scanner;

public class square_user {
    public static void main(String[] args) {
        int[] num= new int[5]; 
       Scanner scan= new Scanner(System.in);
       System.out.println("enter the array ele");
        for(int i=0;i<5;i++)
        {
            num[i]=scan.nextInt();
            //System.out.println(num[i]);
        }
        for(int j=0;j<5;j++)
        {
            int sq= num[j]*num[j];
            num[j]= sq;
            System.out.println("the squared ele are:");
            System.out.println(num[j]);
        }
    }
}
