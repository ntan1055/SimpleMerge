import java.lang.reflect.Array;

/**
 * Created by Teacher on 1/28/2019.
 * simpleMerge takes in two sorted arrays of
 * integers and merges them to return one sorted
 * array of integers.
 */
public class SimpleMerge {
    public static int[] simpleMerge(int[] arr1, int[] arr2)
    {
        int length1 = arr1.length;
        int length2 = arr2.length;

        int[] merge = (int[]) Array.newInstance(arr1.getClass().getComponentType(), length1 + length2);
        System.arraycopy(arr1, 0, merge, 0, length1);
        System.arraycopy(arr2, 0, merge, length1, length2);
        
        for(int i = 1; i < merge.length; i++)
        {
            for(int j = i; j > 0; j--)
            {
                if(merge[j] < merge[j-1])
                {
                    int sub = merge[j];
                    merge[j] = merge[j-1];
                    merge[j-1] = sub;
                }
            }
        }

        return merge;
    }
}
