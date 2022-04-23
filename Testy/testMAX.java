package Testy;

import com.company.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testMAX {
    @Test
    public void testMax(){
        int a = 5;
        int b = 10;

        int WynikZMaina = Main.max(a,b); //tu jest błąd ale jak napiszesz taką klasę w mian przestanie być błędem

        Assertions.assertEquals(b,WynikZMaina);
        //b to liczba większa czyli prawidłowy wynik
        //wynik z maina to ma być poprawna liczbę czyli b jeśli tak sie stanie test przejdzie
    }


}
