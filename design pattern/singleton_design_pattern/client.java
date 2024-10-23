package singleton_design_pattern;

public class client {
    public static void main(String[] args) {
        database db = database.getInstance();
    }
}
