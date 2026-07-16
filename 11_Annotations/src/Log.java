import java.util.ArrayList;
import java.util.List;

public class Log {
    @SafeVarargs
    public static void printLogValues(List<Integer>... logNumbersList){
        Object[] objList= logNumbersList;
        List<String> stringValueList = new ArrayList<>();
        stringValueList.add("Heloo");
        objList[0]=stringValueList;

    }
}
