package singleton_class.double_checked_locking;

public class DBConnection {
    private static volatile DBConnection conn;
    private DBConnection(){}
    public static DBConnection getInstance(){
        if(conn==null){
            synchronized (DBConnection.class){
                if(conn==null){
                    conn=new DBConnection();
                }
            }
        }
        return conn;
    }
}
