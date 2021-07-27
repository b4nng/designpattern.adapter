import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestMoeda {
    @Test
    public void deveRetornarCinquenta(){
        Moeda moeda = new Moeda();
        moeda.setCambio(50);
        Assertions.assertEquals(50.0, moeda.getCambio());
    }
    @Test
    public void deveRetornarDez(){
        Moeda moeda = new Moeda();
        moeda.setCambio(50);
        Assertions.assertEquals(10.0, moeda.getReal());
    }
}
