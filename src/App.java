public class App {
    public static void main(String[] args) throws Exception {
        Data d1 = new Data(2025, 1, 1);
        Data d2 = new Data(2002, 12, 1);
        d1.diaDaSemana();
        System.out.println(d1.diaDaSemana() + " " + d2);
    }
}
