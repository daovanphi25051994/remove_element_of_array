import java.util.Scanner;

public class remove_element_array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the size of array : ");
        int size = scanner.nextInt();

        if (size >= 1) {
            int[] arrNumbers = new int[size];
            for (int i = 0; i < arrNumbers.length; i++) {
                System.out.printf("arr[%d] = ", i);
                arrNumbers[i] = scanner.nextInt();
            }

            System.out.printf("Enter a number you want to remove : ");
            int removeNumber = scanner.nextInt();
            removeElementOfArray(arrNumbers, removeNumber);

            System.out.println("New array : ");
            for (int i = 0; i < arrNumbers.length; i++) {
                System.out.printf("arr[%d] = %d \n", i, arrNumbers[i]);
            }
        } else {
            System.out.println("Invalid input !!");
        }
    }

    public static void removeElementOfArray(int[] arrNumbers, int number) {
        int count = 0;
        for (int i = 0; i < arrNumbers.length; i++) {
            if (arrNumbers[i] == number) {
                count++;
                for (int j = i; j < arrNumbers.length - count; j++) {
                    arrNumbers[j] = arrNumbers[j + 1];
                }
                arrNumbers[arrNumbers.length - count] = 0;
                i--;
            }
        }
    }
}
