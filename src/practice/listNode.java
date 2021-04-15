package practice;

public class listNode{
    public listNode next;
    public int data;

    public listNode(){
        next = null;
        data = Integer.MIN_VALUE;
    }
 
    public listNode (int data){
        next = null;
        this.data = data;
    }

    public listNode getNext(){
        return next;
    }

    public void setNext (listNode node){
        next = node;
    }

    public int getData(){
        return data;
    }

    public void setdata (int elem){
        data = elem;
    }

    @Override
    public String toString (){
         return Integer.toString(data);
    }
}

class LinkedStack {
    private int length;
    private listNode top;

    public LinkedStack() {
        length = 0;
        top = null;
    }

    public void push(int data) {
        listNode temp = new listNode(data);
        temp.setNext(top);
        top = temp;
        length++;
    }

    public int pop(){
        int result = top.getData();
        top = top.getNext();
        length--;
        return result;
    }

    public int peek(){
        return top.getData();
    }

    public boolean isEmpty() {
        return (length == 0);
    }

    public int size() {
        return length;
    }

    @Override
    public String toString() {
        String result = "";
        listNode current = top;
        while (current != null) {
            result = result + current.toString() + "\n";
            current = current.getNext();
        }

        return result;
    }

    public static void main(String[] args) {

        LinkedStack stack = new LinkedStack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        stack.toString();
  
        System.out.println("Size of stack is: " + stack.size());

        stack.pop();
        stack.pop();

        System.out.println("Top element of stack is: " + stack.peek());
     }
}