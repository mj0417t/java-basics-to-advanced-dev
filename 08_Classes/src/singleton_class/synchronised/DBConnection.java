package singleton_class.synchronised;

public class DBConnection {
    private static DBConnection conn;
    private DBConnection(){

    }

    synchronized public static DBConnection getInstance(){
        if (conn==null){
            conn= new DBConnection();

        }
        return conn;
    }
}
