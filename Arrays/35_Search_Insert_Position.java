class Solution 
{
    public int searchInsert(int[] nums, int target) 
    {
        // First, check if the element exists
        for(int i = 0; i < nums.length; i++)
        {
            if(nums[i] == target)
            {
                return i;
            }
        }
        
        // If not found, find the first element greater than target
        for(int j = 0; j < nums.length; j++)
        {
            if(nums[j] > target)
            {
                return j;
            }
        }
        
        // If target is larger than all elements, return the end of the array
        return nums.length;
    }
}
