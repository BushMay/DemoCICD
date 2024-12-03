import org.example.Caculator;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.CacheRequest;

public class TestCaculator {
    @Test
    public void testSum(){
        Caculator cals = new Caculator();
        Assert.assertEquals(cals.sum(3,4),7);
    }

    @Test
    public void testSub(){
        Caculator cals = new Caculator();
        Assert.assertEquals(cals.sub(2,2),0);
    }
}
