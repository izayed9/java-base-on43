package algorithm;
public class Sorting{

    public static void printArra(int nums[]){
        for(int i =0; i<nums.length; i++){
            System.out.println(nums[i]);
        }
    }
    public static void main(String[] args) {
        int[] numbers = {2,3,1,6,5,4};
        for(int i =0; i<numbers.length-1; i++){
            for(int j =0; j <numbers.length-i-1; j++){
                if(numbers[j]> numbers[j+1]){
                    int temp = numbers[j];
                    numbers[j] = numbers[j+1];
                    numbers[j+1] = temp;

                }
            }
        }
        printArra(numbers);
        
    }
}