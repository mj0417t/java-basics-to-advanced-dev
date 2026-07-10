package Enum_class;

public enum EnumWithCustomVal {
    SUNDAY(101,"1st day of week"),
    MONDAY(102,"2nd day of week"){
        @Override
        public void dummyMethod() {
            System.out.println("Monday Dummy");
        }
    },
    TUESDAY(103,"3rd day of week"),
    WEDNESDAY(104,"4th day of week"),
    THURSDAY(105,"5th day of week"),
    FRIDAY(106,"6th day of week"),
    SATURDAY(107,"7th day of week");

    private int value;

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    private String comment;

    EnumWithCustomVal(int value, String comment) {
        this.value = value;
        this.comment = comment;
    }

    public static EnumWithCustomVal getEnumFromValue(int value){
        for (EnumWithCustomVal sample: EnumWithCustomVal.values()){
            if(sample.value==value){
                return sample;
            }
        }
        return null;
    }

    public void dummyMethod(){
        System.out.println("Default dummy Method");
    }
}
