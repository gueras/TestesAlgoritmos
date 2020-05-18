public class DoublyLinkedList {

    private EmployeeNode head;
    private EmployeeNode tail;
    private int size = 0;

    public void addToFront(Employee emp){
        EmployeeNode node = new EmployeeNode(emp);
        if (this.isEmpty()) {
            tail = node;
        }else{
            node.setNext(head);
            head.setPrevious(node);
        }
        head = node;
        size++;
    }

    public int getSize(){
        return this.size;
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.print(current.toString());
            System.out.print(" <=> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

}
