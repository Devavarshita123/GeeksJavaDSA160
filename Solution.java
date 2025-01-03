class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        int max = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==max)
            {
                arr[i]=-1;
            }
        }
        max = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        return max;
    }
}
