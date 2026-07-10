package Generic_class.example;

import java.util.List;

public class Print {
//    public void setPrintValues(List<? super Vehicle> vehicles){
    public void setPrintValues(List<? extends Vehicle> vehicles){

    }

    //wild card method
    public void computeList(List<? extends Number> source,
                            List<? extends Number> destinations){

    }

    //generic type method
    public <T extends Number> void computeList2(List<T>source, List<T> destination){

    }
}
