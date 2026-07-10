package singleton_class.eager_initialisation;

public class DBConnection {
    private static DBConnection conObj = new DBConnection();
    private DBConnection(){

    }
    public static DBConnection getInstance(){
        return conObj;
    }

}
