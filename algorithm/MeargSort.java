package algorithm;

public class MeargSort {
    public static void conquer(int startInd, int midInd, int endInd, int arr[]){
        int marge[] = new int[endInd - startInd +1 ];
        
    }
    public static void devide(int startInd, int endInd, int arr[]) {
        if (startInd >= endInd)
            return;

        int mid = startInd + (endInd - startInd) / 2; // same startInd+ endInd/2
        devide(startInd, endInd, arr);
        devide(mid + 1, endInd, arr);
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 };
        int n = arr.length;

    }
}
