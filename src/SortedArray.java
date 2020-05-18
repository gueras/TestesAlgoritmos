public class SortedArray {

    public static void main(String[] args){

        int[] intArrays = new int[7];

        intArrays[0] = 20;
        intArrays[1] = 35;
        intArrays[2] = 30;
        intArrays[3] = 7;
        intArrays[4] = 10;
        intArrays[5] = 23;
        intArrays[6] = -11;

        int largest = 0; //index com o maior valor do array

        for(int lastUnsortedIndex = intArrays.length -1; lastUnsortedIndex > 0; lastUnsortedIndex--){
            for(int i = 1; i <= lastUnsortedIndex; i++){
                if(intArrays[i] > intArrays[largest]){
                    largest = i;
                }
            }
            swap(intArrays, largest, lastUnsortedIndex);
            largest =0;
        }

        for (int i = 0; i < intArrays.length; i++){
            System.out.println(intArrays[i]);
        }

    }

    public static void swap(int[] intArray, int largest, int lastIndex){
        int temp = intArray[lastIndex];
        intArray[lastIndex] = intArray[largest];
        intArray[largest] = temp;
    }



}
