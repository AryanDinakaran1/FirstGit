public class Quick
{
    public static void main(String[] args) 
    {
        int array[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int x = 13;
        int left = 0;
        int right = array.length - 1;
        int mid = 0;

        while(left <= right)
        {
            mid = (left + right) / 2;
            if(x > array[mid])
            {
                left = mid + 1;
            }
            else if(x < array[mid])
            {
                right = mid - 1;
            }
            else
            {
                System.out.println("Gotcha!");
                break;
            }
        }
    }
}
