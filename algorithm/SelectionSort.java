package algorithm;

public class SelectionSort {
    public static void printArra(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }

    public static void main(String[] args) {
        int[] numbers = { 2, 3, 1, 6, 5, 4 };
        for (int i = 0; i < numbers.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[smallest] > numbers[j]) {
                    smallest = j;
                }
            }
            int temp = numbers[smallest];
            numbers[smallest] = numbers[i];
            numbers[i] = temp;

        }
        printArra(numbers);
    }

}
