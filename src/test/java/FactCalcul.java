import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class FactCalcul {

    @Test
    public void testFact( ){
        //Given
         Factoriel factoriel= new Factoriel();

         //When
         int result = factoriel.factoriel(6);

         // Then
         assertEquals(720,result);
    }
}
