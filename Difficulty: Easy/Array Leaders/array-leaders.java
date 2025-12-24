class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        int len  = arr.length, max = Integer.MIN_VALUE;
        for(int i = len -1; i>=0;i--){
            if(arr[i] >= max){
                max = arr[i];
                list.add(0, max);
            }
        }
        return list;
    }
}
