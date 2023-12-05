public class Sort {
    public static void printArray(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }

    public static void main(String[] args) {
        int[] numbers = { 1, 8, 3, 5, 7 };
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j+1]) {
                    int tepm = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j+1] = tepm;
                }
            }
        }
        printArray(numbers);
    }
}
