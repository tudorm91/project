package task_11_Abstractisation;

import java.util.Arrays;

public class ArrayManipulation {
    public static void main(String[] args) {
        int[] myArray = {6, 76, 12, 15, 26};
        int[] reversedArray = new int[myArray.length];
        int sum = 0;
        System.out.println(Arrays.toString(myArray));

        for (int value : myArray) {
            sum += value;
        }
        System.out.println("Array Sum: " + sum);
        int temp, max = 0;
        for (int value : myArray) {
            temp = value;
            if (temp > max)
                max = temp;
        }
        System.out.println("Max from array is: " + max);

        for (int index = 0; index < myArray.length; index++) {
            reversedArray[index] = myArray[myArray.length - index - 1];
        }
        System.out.println(Arrays.toString(reversedArray));
    }
}
