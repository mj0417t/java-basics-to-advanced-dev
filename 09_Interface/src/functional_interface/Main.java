package functional_interface;


public class Main {
    public static void main(String[] args) {
        Bird eagle= new Eagle();
        eagle.canFly();

        Bird sparrow = new Bird() {
            @Override
            public void canFly() {
                System.out.println("Sparrow can fly.");
            }
        };
        sparrow.canFly();

        //using lambda expression

        Bird parrot = ()->{
            System.out.println("Parrot can fly");
        };
        parrot.canFly();

    }
}
