package Generic_class;

public class GenericMethod {
    public <K,V> void printValue(Pairs<K,V> pair1, Pairs<K,V> pair2){
        if (pair1.getKey().equals(pair2.getKey())) {
            System.out.println("Equal Keys....");
            System.out.println("Key:" + pair1.getKey() + " and Value: " + pair1.getVal());
            System.out.println("Key:" + pair2.getKey() + " and Value: " + pair2.getVal());
        }else{
            System.out.println("Not Equal Keys....");
            System.out.println("Key:" + pair1.getKey() + " and Value: " + pair1.getVal());
            System.out.println("Key:" + pair2.getKey() + " and Value: " + pair2.getVal());
        }
    }
}
