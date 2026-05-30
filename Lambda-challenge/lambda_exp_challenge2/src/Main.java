import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    private static Random random = new Random();
    public static void main(String[] args) {
        String[] names={"Anna", "Bob","Carole","David","Ed","Fred","Gary"};
        Arrays.setAll(names,i->names[i].toUpperCase());
        System.out.println("--> Transform to UpperCase");
        System.out.println(Arrays.toString(names));

        List<String> backedByArr=Arrays.asList(names);
        backedByArr.replaceAll(s->s+" "+getRandomChar('A','D')+".");
        System.out.println("--> Add random middle innitial");
        System.out.println(Arrays.toString(names));

        backedByArr.replaceAll(s -> s+" "+getReversedName(s.split(" ")[0]));
        System.out.println("--> Add reversed name as last name");
        Arrays.asList(names).forEach(System.out::println);

        List<String > newList = new ArrayList<>(List.of(names));
        newList.removeIf(s->s.substring(0,s.indexOf(" ")).equals(s.substring(s.lastIndexOf(" ")+1)));
        System.out.println("-->remove names where first=last");
        newList.forEach(s-> System.out.println(s));
    }

    public static char getRandomChar(char startChar, char endChar){
        return (char) random.nextInt((int) startChar,(int) endChar+1);
    }

    private static String getReversedName(String firstName){
        return new StringBuilder(firstName).reverse().toString();
    }
}