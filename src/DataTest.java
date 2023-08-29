import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.Test;

public class DataTest {
    @Test
    public void testAvancarDia(){
        Data d1 = new Data(2002, 12, 12);
        Data d2 = new Data(2002, 12, 13);
        d1.proximoDia();
        helperProximoDia(d1.getDia(), d1.getMes(), d1.getAno(), d2.getDia(), d2.getMes(), d2.getAno(), "Testa se o método proximoDia avança um dia");
    }

    @Test
    public void testAvancarMes(){
        Data d1 = new Data(2002, 11, 30);
        Data d2 = new Data(2002, 12, 1);
        d1.proximoDia();
        helperProximoDia(d1.getDia(), d1.getMes(), d1.getAno(), d2.getDia(), d2.getMes(), d2.getAno(), "Testa se o método proximoDia avança o mês");
    }

    @Test
    public void testAvancarAno(){
        Data d1 = new Data(2002, 12, 31);
        Data d2 = new Data(2003, 1, 1);
        d1.proximoDia();
        helperProximoDia(d1.getDia(), d1.getMes(), d1.getAno(), d2.getDia(), d2.getMes(), d2.getAno(), "Testa se o método proximoDia avança o mês");
    }

    @Test
    public void testPorExtenso() {
        Data d1 = new Data(2002, 12, 31);
        assertEquals(d1.porExtenso(), "31/12/2002", "Teste se os dias por extenso estão sendo formatados corretamente");
    }

    //Helpers
    private void helperProximoDia(int ano, int mes, int dia, int ano2, int mes2, int dia2, String message) {
        assertTrue(message, ano == ano2 && mes == mes2 && dia == dia2);
    }
}
