package Testy;

import com.company.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestMIN {
    @Test
    public void testMin(){
        int a = 1;
        int b = 5;

        int WynikZMain = Main.min(a,b); // tak samo jak wcześniej tu jest błąd do czasu

        Assertions.assertEquals(a,WynikZMain);

        //tu a powinno być wynikiem prawidłowym bo jest mniejsze

    }
}
