// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       Stack<Integer> stack = new Stack<>(5);

       stack.push(1);
       stack.push(2);
       stack.push(3);
        System.out.println("Stack size"+ stack.size());
        System.out.println("Top elementt"+ stack.peek());

        System.out.println("Popped elements "+ stack.pop());

        System.out.println("Stack elements :");
        stack.display();
    }
}