package Testy;

import com.company.Main;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestMIN {
    @Test
    public void testMin(){
        int a = 1;
        int b = 5;

        int WynikZMain = Main.min(a,b);

        Assertions.assertEquals(a,WynikZMain);

    }
}
