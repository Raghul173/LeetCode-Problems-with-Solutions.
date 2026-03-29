import java.util.Arrays;
class Solution 
{
    public double findMedianSortedArrays(int[] nums1, int[] nums2) 
    {
        int n = nums1.length;
        int m = nums2.length;
        int[] result = new int[n + m];
        int k = 0;

        for (int i = 0; i < n; i++) 
        {
            result[k++] = nums1[i];
        }

        for (int j = 0; j < m; j++) 
        {
            result[k++] = nums2[j];
        }

 
        
        Arrays.sort(result);

        int total = n + m;
        if (total % 2 == 1) 
        {
            return result[total / 2];
        } else 
        {
            return (result[total / 2 - 1] + result[total / 2]) / 2.0;
        }
    }
}
