package singleton_class.lazy_initialisation;

public class DBConnection {
    private static DBConnection conn;
    private DBConnection(){

    }
    private static DBConnection getInstance(){
        if(conn==null){
            conn=new DBConnection();
        }
        return conn;
    }
}
