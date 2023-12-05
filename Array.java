import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // int[] marks = new int[3];
        // marks[0]= 30;
        // marks[1]= 40;
        // marks[2]= 50;
        // // System.out.println(marks);
        // for(int i=0; i<marks.length; i++){
        // System.out.println(marks[i]);
        // }

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++) {
            numbers[i] = sc.nextInt();
        }
        int seacrh = sc.nextInt();
        for(int i=0; i<numbers.length; i++){
            if(seacrh==numbers[i]){
                System.out.println(numbers[i]+" res search");
            }
        }
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
