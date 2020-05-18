public class InsertionSort {

    public static void main(String[] args){
        int[] intArrays = {10, -5, -11, 13, 65, 9, 47};

        for(int i = 1; i < intArrays.length; i++){
            int newElement = intArrays[i];
            int j;
            for(j = i; j > 0 && intArrays[j-1] > newElement; j--){
                intArrays[j] = intArrays[j-1];
            }
            intArrays[j] = newElement;
        }

        for (int i = 0; i < intArrays.length; i++){
            System.out.println(intArrays[i]);
        }

    }

}
