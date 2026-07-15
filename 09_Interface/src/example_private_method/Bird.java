package example_private_method;

public interface Bird {
    void canFly();
    default void minFlyHt(){
        myStaticPublicMeth();
        myPrivateMeth();
        myPrivateStaticMeth();
    }

    private static void myPrivateStaticMeth(){

    }
    private void myPrivateMeth(){

    }

    static  void myStaticPublicMeth(){
        myPrivateStaticMeth();
    }


}
