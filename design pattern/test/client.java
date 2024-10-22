package test;

public class client {
    public static void main(String[] args) {
        student st = new student();

        st.setWeight("Vaibhaw", "Vaish", "84");
        System.out.println(st.getFName()+" "+st.getLName()+" "+st.getWeight());
    }
}
