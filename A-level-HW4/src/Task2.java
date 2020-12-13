import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double[] testArray = new double[10];
        System.out.println("Enter the elements of array");
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < testArray.length; i++) {
            double arrElement = scanner.nextDouble();
            testArray[i] = arrElement;
        }
        bubbleSort(testArray);
        printArray(testArray);
        System.out.println("\nTo get min element of array enter 'min', to get max - enter 'max'");
        Scanner scannerFunc = new Scanner(System.in);
        String getFunc = scannerFunc.nextLine();
        if (getFunc.equals("max")) {
            System.out.println("Max element of array equals:" + " " + maxElement(testArray));
        } else if (getFunc.equals("min")) {
            System.out.println("Min element of array equals:" + " " + minElement(testArray));
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

    public static void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " " + ",");
        }

    }

    public static double maxElement(double[] array) {
        double max = array[0];
        for (int i = 0; i < array.length; i++) {
            max = Math.max(max, array[i]);
        }
        return max;
    }

    public static double minElement(double[] array) {
        double min = array[0];
        for (int i = 0; i < array.length; i++) {
            min = Math.min(min, array[i]);
        }
        return min;
    }


    //How to make the output more beautiful
    //        double x = 12.0;
//        String[] splitter = String.valueOf(x).split("\\.");
//        int i = splitter[1].length();
//        String j = splitter[1].toString();
//        System.out.println(i);
//        if(i == 1 && j.equals("0")){
//            System.out.println(Math.round(x));
//        }
//        else {
//            System.out.println(x);
//        }

}
