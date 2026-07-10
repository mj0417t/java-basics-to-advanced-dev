package Generic_class;

public class GenericClassEx<T> {
    T value;
    public T getValue(){
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
