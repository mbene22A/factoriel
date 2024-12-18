import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class FactCalcul {

    @Test
    public void calculFact( ){
        //Given
         Factoriel factoriel= new Factoriel();

         //When
         int resultat = factoriel.Factoriel(6);

         // Then
         assertEquals(720,resultat);
    }
}
