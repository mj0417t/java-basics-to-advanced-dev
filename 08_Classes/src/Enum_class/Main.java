package Enum_class;

public class Main {
    public static void main(String[] args) {
        //usage of values() and ordinal()
        for (EnumSample sample: EnumSample.values()){
            System.out.println(sample.ordinal());
        }

        //usage of values() and name
        for (EnumSample sample: EnumSample.values()) {
            System.out.println(sample.name());

        }

        EnumWithCustomVal enumWithCustomVal= EnumWithCustomVal.getEnumFromValue(106);
        EnumWithCustomVal enumWithCustomVal2=EnumWithCustomVal.MONDAY;

        System.out.println(enumWithCustomVal.getComment());
        System.out.println(enumWithCustomVal2.getComment());
        System.out.println(EnumWithCustomVal.MONDAY.getComment());
        System.out.println(EnumWithCustomVal.MONDAY.getValue());
        EnumWithCustomVal.MONDAY.dummyMethod();
        enumWithCustomVal.dummyMethod();


        EnumWithAbstractMeth enumWithAbstractMeth= EnumWithAbstractMeth.SATURDAY;
        enumWithAbstractMeth.dummyMethod();
        EnumWithAbstractMeth.MONDAY.dummyMethod();

        EnumImplementInterface enumInterfaceObj = EnumImplementInterface.FRIDAY;
        System.out.println(enumInterfaceObj.toLowerCase());
        System.out.println(EnumImplementInterface.SUNDAY.toLowerCase());
    }
}
