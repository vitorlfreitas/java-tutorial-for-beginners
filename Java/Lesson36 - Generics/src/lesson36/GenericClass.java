package lesson36;

// Generic Type in Java

public class GenericClass<T> {
    
    private T data;

    public GenericClass(T data) {
        this.data = data;
    }
    
    public T getData() {
        return data;
    }

}
