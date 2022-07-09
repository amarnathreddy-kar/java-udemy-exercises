import java.util.Arrays;

public class P03_MinMaxArrayElement {
    public static void main(String[] args) {
        int[] newArray = P02_ArraysChallenge.getIntegers(5);
        System.out.println("Before sorting - ");
        P02_ArraysChallenge.printArray(newArray);

        System.out.println("After sorting (Descending) -");
        int[] descSortedArray = P02_ArraysChallenge.sortIntegers(newArray);
       // P02_ArraysChallenge.printArray(descSortedArray);
        //for better rendering
        System.out.println(Arrays.toString(descSortedArray));

        System.out.println("After sorting (Ascending) - ");
        int[] ascSortedArray = P04_ReverseArrayChallenge.reversedArray(descSortedArray);
        System.out.println(Arrays.toString(ascSortedArray));

        //Min Value
        System.out.println("Min Value = "+descSortedArray[descSortedArray.length-1]);
        //Max Value
        System.out.println("Max Value = "+descSortedArray[0]);

        System.out.println("Due to reference elements need to take updated array, hence 'ascSortedArray'");
        //Min Value
        System.out.println("Min Value = "+ascSortedArray[0]);
        //Max Value
        System.out.println("Max Value = "+descSortedArray[ascSortedArray.length-1]);

    }
}
