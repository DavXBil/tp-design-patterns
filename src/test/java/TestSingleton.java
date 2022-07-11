import fr.diginamic.singleton.Singleton;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSingleton {

    @Test
    public void TestSingletonObject(){

        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        //Passes
        Assert.assertSame(instance1, instance2);
    }


}
