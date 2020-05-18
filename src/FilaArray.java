public class FilaArray {

    private Employee[] stack;
    private int top =0;

    public FilaArray(int capacity){
        stack = new Employee[capacity];
    }

    public void push(Employee emp){
        if(top == stack.length){
            Employee[] newArray = new Employee[top * 2];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }
        stack[top++] = emp;
    }

    public Employee pop(){
        if(top == 0){
            return null;
        }

        Employee pop = stack[--top];
        stack[top] = null;
        return pop;
    }

    public Employee peek(){
        if(top == 0){
            return null;
        }
        return stack[top -1];
    }

    public boolean isEmpty(){
        return top == 0;
    }

    public int size(){
        return top;
    }

    public void printStack(){
        for(int i = top -1; i >=0 ; i--){
            System.out.println(stack[i]);
        }
    }
}
