package singleton_class;

import singleton_class.eager_initialisation.DBConnection;

public class Main {
    public static void main(String[] args) {
        DBConnection connection= DBConnection.getInstance();
    }
}
