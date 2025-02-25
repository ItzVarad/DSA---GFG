//{ Driver Code Starts
// Initial Template for C

#include <stdio.h>


// } Driver Code Ends

// User function Template for C

int floorSqrt(int n) {
    // Your code goes here
        int start = 0, end = n;
        while(start <= end){
            int mid = start + (end - start)/2;
            long square  = (long) mid * mid;
            if(square == n){
                return mid;
            } else if(square < n){
                start = mid + 1;
            } else{
                end  = mid - 1;
            }
        }
        return end;
}


//{ Driver Code Starts.

int main() {
    int t;
    scanf("%d", &t);
    while (t--) {
        int n;
        scanf("%ld", &n);

        printf("%ld\n", floorSqrt(n));
    }
    return 0;
}

// } Driver Code Ends