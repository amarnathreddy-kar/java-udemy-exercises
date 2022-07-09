public class Main {
    public static void main(String[] args) {
        int myVar = 50;

        int [] myArrayVar = new int[10]; //assigns 10 variable of int type
        myArrayVar[5] = 60;
        System.out.println(myArrayVar[5]);

        //simpler way
        int[] myIntArray = {10,20,30,40,50,60,70,80,90,100};
        System.out.println(myIntArray[0]);
        System.out.println(myIntArray[myIntArray.length-1]);

        for(int i=0; i<myIntArray.length; i++){
            System.out.println("Element "+i+", value is "+myIntArray[i]/10);
        }
        for(int element: myIntArray){
            System.out.println(element/10);
        }
        //array of type double
        double[] myDoubleArray = new double[20];

    }

}
