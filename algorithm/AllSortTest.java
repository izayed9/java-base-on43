package algorithm;

public class AllSortTest {

    public static void printArra(int arr[]){
        for(int i=0; i<arr.length; i++){
        System.out.println("Final result "+arr[i]);
        }
    }
    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
       
        // Bubble sort 
        for(int i=0; i<arr.length-1; i++){
            System.out.println("test First outside "+ i);
            for(int j=0; j<arr.length-i-1; j++){
              System.out.println("'test inside :'"+ j);
              if(arr[j]>arr[j+1]){
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
              }
            }
        }
        printArra(arr);
    }
}
