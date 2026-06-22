class Solution {
    void selectionSort(int[] arr) {
        // code here
        int len = arr.length;
        for(int i =0; i< len; i++){
            int min = i;
            for(int j =i+1; j < len; j++){
                if(arr[j] < arr[min]){
                    min =j; 
                }
            }
            int temp =  arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
}