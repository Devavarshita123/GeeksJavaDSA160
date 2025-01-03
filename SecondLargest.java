//Arrays - Day_1
//This function will return the second largest element in an array.
//If no such element exists then it will return -1, this case will occur when the all the elements in the array are same.
class SecondLargest {
    public int getSecondLargest(int[] arr) {
        //Consider the first element be the largest.
        int max = arr[0];
        //This loop will find the largest element in the array.
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
            }
        }
        // The largest element wherever occurs will be replaced by -1.
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==max)
            {
                arr[i]=-1;
            }
        }
        // Now as the largest element is as replaced by -1.
        //Finding the largest will give the second largest.
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
