package Generic_class;

public class Pairs <K,V>{
    private K key;
    private V val;

    public V getVal() {
        return val;
    }

    public K getKey() {
        return key;
    }

    public void put(K key, V val){
        this.key=key;
        this.val=val;

    }

    public void display() {
        System.out.println(key+" and "+val);
    }
}
