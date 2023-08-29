public class App {
    public static void main(String[] args) throws Exception {
        Data d1 = new Data(2002, 11, 30);
        Data d2 = new Data(2002, 12, 1);
        d1.proximoDia();
        System.out.println(d1 + " " + d2);
    }
}
