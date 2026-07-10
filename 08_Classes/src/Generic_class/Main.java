package Generic_class;

public class Main {
    public static void main(String[] args) {
        ObjectClassEx obj=new ObjectClassEx();
        obj.setValue(1);
        Object val=obj.getValue();
        if((int)val==1){
            System.out.println("Val");
        }

        GenericClassEx<Integer> genObj = new GenericClassEx<>();
        genObj.setValue(1);
        int genVal=genObj.getValue();
        if (genVal==1){
            System.out.println("val from generic class");
        }

        InheritanceEx1 inhobj= new InheritanceEx1();
        inhobj.setValue("lowerr");
        System.out.println(inhobj.getValue());

        InheritanceEx2<Float> floatObj = new InheritanceEx2<>();
        floatObj.setValue(214.342);
        System.out.println(floatObj.getValue());

        Pairs <String , Integer> pairsObj = new Pairs<>();
        pairsObj.put("Love",121);
        pairsObj.display();
    }


}
