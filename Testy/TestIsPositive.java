package Testy;

import com.company.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestIsPositive {
    @Test
    public void isPositive(){
        int a = -8;

        boolean wynik = Main.isPositive(a);

        Assertions.assertEquals(false, wynik);
    }
}
