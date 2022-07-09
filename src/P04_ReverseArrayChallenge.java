import java.util.Arrays;

public class P04_ReverseArrayChallenge {
    /* Write a method called reverse() with an int array as a parameter. The method should not return any value.
    In other words, the method is allowed to modify the array parameter. To reverse the array, you have to swap the elements,
    so that the first element is swapped with the last element and so on.
    For example, if the array is [1, 2, 3, 4, 5], then the reversed array is [5, 4, 3, 2, 1].
    The method should first print out the newly passed in array as Array = [1, 2, 3, 4, 5]
    and then once it's been reversed, print it out as Reversed array = [5, 4, 3, 2, 1]
     */

    public static void main(String[] args) {
        int[] array = {7,2,5,96,89,86};

        System.out.println("Original Array = "+ Arrays.toString(array));

        reverse(array);
        System.out.println("Reversed Array = "+Arrays.toString(array));


    }
    //logic to reverse an array elements
    private static void reverse (int[] array){
        int maxIndex = array.length - 1;
        int halfLength = array.length/2;

        for (int i=0; i<halfLength;i++){
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp;
        }

    }
    //reusuable reverse array elements method
    public static int[] reversedArray (int[] array){
        int maxIndex = array.length - 1;
        int halfLength = array.length/2;

        for (int i=0; i<halfLength;i++){
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp;
        }
        int [] revArray = array;
    return revArray;
    }
}
