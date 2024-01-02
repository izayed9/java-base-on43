package algorithm;

public class AllSortTest {

    public static void printArra(int arr[]){
        for(int i=0; i<arr.length; i++){
        System.out.println("Final result "+arr[i]);
        }
    }

    public static void insertion(int arr[]){
        for(int i=1; i<arr.length; i++){
            int current = arr[i];
            int j = i-1;
            while (j>=0 && current < arr[j]) {
                arr[j+1] = arr[i];
                --j;
            }

            // placement 
            arr[j+1] = current;

        }
    }
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
       
        // Selection sort 
        for(int i =0; i<arr.length-1; i++){
            int smallest = i;
            for(int j =i+1; j<arr.length;j++){
                if(arr[smallest]> arr[j]){
                    smallest=j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printArra(arr);
        
        insertion(arr);
        printArra(arr);
    }
}
