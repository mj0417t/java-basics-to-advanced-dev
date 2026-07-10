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

        Pairs<String,Integer> red=new Pairs<>();
        Pairs<String, Integer> blue=new Pairs<>();
        red.put("Red",1);
        blue.put("Blue",2);

        GenericMethod genericMethod= new GenericMethod();
        genericMethod.printValue(red,blue);
        genericMethod.printValue(red,red);
//raw type object
        GenericClassEx genericClassEx=new GenericClassEx();
        genericClassEx.setValue(1);
        genericClassEx.setValue("Stromgd");
        genericClassEx.setValue(213.3431);

    }


}
