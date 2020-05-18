public class ShellSort {

    int[] intArrays = {20,7,-15,22,63,-8,53,5,88};

    public static void main(String[] args){
        ShellSort obj = new ShellSort();

        //obj.intArrays = obj.bubbleShell(obj.intArrays);
        obj.bubbleShell(obj.intArrays);
        for (int i = 0; i < obj.intArrays.length; i++) {
            System.out.println(obj.intArrays[i]);
        }
        obj.insertion(obj.intArrays);

    }


    public void bubbleShell(int[] intArray){
        int gap = intArray.length/2;
        while(gap>1){
            for (int i = 0; i <= gap; i++) {
                if (intArray[i] > intArray[gap]) {
                    swap(intArray, i, i + 1);
                }
            }
            gap = gap/2;
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }
        //return intArray;
    }

    public void insertion(int[] intArrays){
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

    public void swap(int[] array, int i, int j) {

        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }

}
