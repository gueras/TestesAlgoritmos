import java.util.ArrayList;
import java.util.List;

public class TestArrayList {

    public static void main(String[] args){

        Employee emp1 = new Employee("Guilherme", "Miozzo",076771);
        Employee emp2 = new Employee("Joao", "Almeida", 037644);
        Employee emp3 = new Employee("Fabio", "Oliveira", 037744);
        Employee emp4 = new Employee("Denise", "Fernandes", 110485);

        List<Employee> listaEmpregados = new ArrayList<>();
        System.out.println("Tamanho do array: " + listaEmpregados.size());
        System.out.println("Array vazio? " + listaEmpregados.isEmpty());

        listaEmpregados.add(emp1);
        listaEmpregados.add(emp2);
        listaEmpregados.add(emp3);
        listaEmpregados.add(emp4);

        System.out.println("Dados empregado 1: " + listaEmpregados.get(0));

        for (Employee e: listaEmpregados
             ) {
            System.out.println(e.toString());
        }
        
    }

}
