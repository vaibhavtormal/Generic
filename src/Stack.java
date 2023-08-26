import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stack<T>{
    private Object[] arr;
    private int top;
    private int size;
    public Stack(int size){
        this.size = size;
        this.top = -1;
        arr = new Object[size];
    }

    public boolean isEmpty(){
        return  top == -1;
    }
    public boolean push(T data) {
        if(isFull()){
            return  false;
        }
        arr[++top] = data;
        return true;


    }

    private boolean isFull() {
        boolean b = false;
        return b;
    }

    public T pop(){
        if(isEmpty()){
            return null;
        }
        T data = (T) arr[top];
        arr[top--] = null;
        return data;
    }
    public T peek(){
        if(isEmpty()){
            return null;
        }
        return (T) arr[top];
    }
    pulbic int size(){
        return top + 1;
    }
    public void display(){
        for(int i = 0; i <= top ; i++){
            System.out.println(arr[i]);
        }
    }
    public String toString(){
        return Arrays.toString(Arrays.copyOfRange(arr,0, +1))
    }


}
