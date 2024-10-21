package singleton_design_pattern;

public class database {
    private static database db = null;
    
    private database(){

    }

    public static database getInstance(){
            if(db == null){
                synchronized(database.class){
                    if(db == null){
                        db = new database();
                        System.out.println("new object created");
                    }
                }
            }
            return db;
        }
}
