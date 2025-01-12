class ReverseAnArray {
    public void reverseArray(int arr[]) {
        // code here
        int j=arr.length-1;
        for(int i=0;i<arr.length/2;i++,j--)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        
    }
}
