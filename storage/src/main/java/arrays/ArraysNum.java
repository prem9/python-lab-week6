package arrays;

/**
 * Hello world!
 *
 */
public class ArraysNum 
{
    public static void main( String[] args )
    {
        int group[] = new int[] {1,3,-4,7,5};
        System.out.println("nums(before array change)");
        for (int num: group)
        {
            System.out.println(num);
        }
        group[4] = group[1] + group[2];
        
        System.out.println("nums(after array change)");
        for (int num: group)
        {
            System.out.println(num);
        }
    }
}
