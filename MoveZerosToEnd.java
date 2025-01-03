//Arrays - Day_2
// This function will move the zeros that are present in the array to the end.
public class MoveZerosToEnd {
        void pushZerosToEnd(int[] arr) {
            int j=0;
            for(int i=0;i<arr.length;i++)
            {
                //The j value will be incremented only if the value at index i is not a zero.
                //If it is not a zero, then the value will be swapped.
                if(arr[i]!=0)
                {
                    
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    j++;
                }
            }
            
        }
    
}
