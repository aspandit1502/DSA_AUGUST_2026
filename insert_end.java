import java.util.Arrays;
public class insert_end {
    public static void main(String[] args) {
        int []num= new int[5];
        int ele=0;
        for(int i=0;i<3;i++)
        {
            num[i]=ele;
            ele++;
        }
        num[ele]=6;
        ele++;
        System.out.println(Arrays.toString(num));

    }
    
}
