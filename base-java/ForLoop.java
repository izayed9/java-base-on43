public class ForLoop {
    public static void main(String args[]) {
        int[] numbers = { 1, 2, 34, 5, 6, 7 };
        // lagacy code loop
        // for(int i =0; i<numbers.length; i++){
        // System.out.println(numbers[i]);
        // }
        // // update for each loop
        // for(int number : numbers){
        // System.out.println(number + "update");
        // }
        // while loop
        // int[] myArray = { 1, 2, 3, 4, 5 };

        // int i = 0;
        // while (i < myArray.length) {
        //     System.out.println(myArray[i] + " " + "my fuck");
        //     i++;
        // }


        int rows = 4;    // Number of rows
        int columns = 5; // Number of columns

        // Nested loop to iterate through rows and columns
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after each row
        }
    }
}
