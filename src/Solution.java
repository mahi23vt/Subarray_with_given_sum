import java.util.ArrayList;

public class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s)
    {
        // Your code here
        ArrayList<Integer> myList = new ArrayList<>();
        int sum =0;
        int firstElement = 0;
        int lastElement=0;
        int i=0;
        while(i<n)
        {
            if(sum<s)
            {
                sum=sum+arr[i];
                lastElement=i;
                i++;
            }
            else
            {
                if(sum==s)
                {
                    firstElement++;
                    lastElement++;
                    myList.add(firstElement);
                    myList.add(lastElement);

                    return myList;
                }
                else
                {
                    sum = sum - arr[firstElement];
                    firstElement++;
                }

            }
        }
        return myList;


    }
}
