package Enum_class;

public enum EnumWithAbstractMeth {
    SUNDAY {
        @Override
        public void dummyMethod() {
            System.out.println("Sunday Dummy");
        }
    },
    MONDAY{
        @Override
        public void dummyMethod(){
            System.out.println("Monday Dummy");
        }
    },
//    TUESDAY,
//    WEDNESDAY,
//    THURSDAY,
//    FRIDAY,
    SATURDAY{
        @Override
    public void dummyMethod(){
            System.out.println("Saturday Dummy");
        }
};
    public abstract void dummyMethod();
}
