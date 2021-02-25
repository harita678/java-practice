import java.util.Scanner;

public class ArrayTest {
    int[] item;
    int size;
    Scanner sc;
    int sum = 0;

    public static void main(String[] args) {
        ArrayTest at = new ArrayTest();
        int[] items = {1, 2, 3, 4, 5};
        int[] dup = {1, 2, 2, 3, 4, 4, 5};
        //    int[] dup1 = at.findDuplicateNumber(dup);
        int[] numbers = {20, 10, 1, 0, -5};
        int sum = 6;
        //  at.sum(items);
        //  at.copy(items);

        int[] input = new int[9];
        int i = 1;
        int j = 0;
        while (j < 9) {
            input[j] = i;
            j++;
            if (i == 3) {
                i++;
            }
            i++;
        }


        //   System.out.println("Missing number is:" + at.findMissingNumber(input));
        // at.printArray(dup1);
        // System.out.println(at.finsSmallest(numbers));
        at.findPairs(items, sum);
    }

    public void printArray(int[] input) {
        for (int k = 0; k < input.length; k++) {
            System.out.println(input[k]);
        }

    }

    public void sum(int[] item) {
        for (int i = 0; i < item.length; i++) {
            sum += item[i];
        }
        System.out.println("Sum is:" + sum);
    }

    public void copy(int[] items) {
        int[] items1 = new int[items.length];
        // items1=items;

        for (int i = 0; i < items1.length; i++) {
            items1[i] = items[i];
        }
        System.out.println("items1: ");
        for (int i = 0; i < items1.length; i++) {
            System.out.println(items1[i]);
        }
    }

    //How do you find the missing number in a given integer array of 1 to 100
    public int findMissingNumber(int[] arr) {
        int i;
        int j = arr[0];
        for (i = 0; i < arr.length; i++) {
            if (arr[i] != j) {
                break;
            }
            j++;
        }
        return (j);
    }

    public int[] findDuplicateNumber(int[] arr) {
        int i;
        int j = 0;
        int length = 0;
        int[] dup = new int[arr.length];
        for (i = 0; i < arr.length - 1; i++) {

            for (j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {

                    dup[i] = arr[i];

                }
            }

        }
        return dup;
    }

    public int finsSmallest(int[] arr) {
        int lagest = 0;
        int smallest = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    smallest = arr[j];

                }
            }
        }

        return smallest;
    }

    public void findPairs(int[] arr, int sum) {
        int[] pairs = new int[2];
        int k = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    pairs[0] = arr[i];
                    pairs[1] = arr[j];

                }
            }
        }
        for( k=0; k<pairs.length; k++){
            System.out.println(pairs[k]);
        }
    }
}
