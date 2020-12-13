import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        double[] testArray = new double[10];
        System.out.println("Enter the elements of array");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < testArray.length; i++) {
            double arrElement = scanner.nextDouble();
            testArray[i] = arrElement;
        }
        printArray(testArray);
        bubbleSort(testArray);

        System.out.println("\nTo get array in ascending order enter 'asc', to get in descending - enter 'dsc'");
        Scanner scannerFunc = new Scanner(System.in);
        String getFunc = scannerFunc.nextLine();
        if (getFunc.equals("asc")) {
            System.out.print("Array sorted in ascending order:" + " ");
            printArray(testArray);
        } else if (getFunc.equals("dsc")) {
            System.out.print("Array sorted in descending order:" + " ");
            reversePrintArray(testArray);
        }


    }

    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print("|" + array[i] + "|" + " " );
        }

    }

    public static void reversePrintArray(double[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print("|" + array[i] + "," + "  " );
        }

    }


    public static void bubbleSort(double[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (arr[j] > arr[j + 1]) {
                    double tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }
}
