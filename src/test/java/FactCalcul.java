import com.groupisi.CalculFact;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class FactCalcul {

    @Test
    public void calculFact( ){
        //Given
        FactCalcul calculFact = new FactCalcul();

         //When
         long resultat = CalculFact.factoriel(6);

         // Then
         assertEquals(720,resultat);
    }
}
