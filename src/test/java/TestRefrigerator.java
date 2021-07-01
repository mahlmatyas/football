import football.Beer;
import football.Refrigerator;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class TestRefrigerator {
    private Refrigerator refrigerator;
    @BeforeEach
    public void Setup(){
        refrigerator = new Refrigerator();
    }

    @Test
    public void TestRemove(){
        refrigerator.AddBeer(new Beer(5,"valami"));
        refrigerator.AddBeer(new Beer(5,"valami"));
        refrigerator.Remove();
        Assertions.assertEquals(1,refrigerator.beerArr.size());
    }
}
