public class Test {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Guilherme", "Miozzo",076771);
        Employee emp2 = new Employee("Joao", "Almeida", 037644);
        Employee emp3 = new Employee("Fabio", "Oliveira", 037744);
        Employee emp4 = new Employee("Denise", "Fernandes", 110485);

        FilaArray fila = new FilaArray(10);
        fila.push(emp1);
        fila.push(emp2);
        fila.push(emp3);
        fila.push(emp4);

        fila.printStack();

    }

    public static void swap(int[] array, int i, int j) {

        if (i == j) {
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
}