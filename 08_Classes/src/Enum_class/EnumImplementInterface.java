package Enum_class;

public enum EnumImplementInterface implements MyInterface{
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;

    @Override
    public String toLowerCase() {
        return this.name().toLowerCase();
    }
}
