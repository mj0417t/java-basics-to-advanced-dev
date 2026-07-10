package singleton_class.bill_pugh_solution;

public class DBConection {
    private DBConection conn;
    private DBConection(){}
    private static class DBConnHelper{
        private static final DBConection INSTANCE_OBJECT = new DBConection();
    }
    public static DBConection getInstance(){
        return DBConnHelper.INSTANCE_OBJECT;
    }
}
