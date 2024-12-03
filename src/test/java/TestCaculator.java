import org.example.Caculator;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.CacheRequest;

public class TestCaculator {
    @Test
    public void testSum(){
        Caculator cals = new Caculator();
        Assert.assertEquals(cals.sum(4,4),8);
    }

    @Test
    public void testSub(){
        Caculator cals = new Caculator();
        Assert.assertEquals(cals.sub(5,5),0);
    }
}
