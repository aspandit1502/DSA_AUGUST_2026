public class cons_ones
{
    public static void main(String[] args) {
        int[] num={1,1,0,1,1,1,0,1,0,1,1,1,1};
        int count=0;
        int max=0;
        for(int i=0;i<num.length;i++)
        {
            if(num[i]==1)
            {
                count++;
            }
            if(count>max)
            {
                max=count;
            }
            if(num[i]==0)
            {
                //max=count;
                count=0;
            }

        }
            System.out.println(max);
    }
}