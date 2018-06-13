/*
package company;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import sun.util.locale.LocaleUtils;

import java.util.Locale;

import static org.testng.AssertJUnit.assertEquals;

public class SmokeTest {


    @Test(groups = {"1"}, priority=1)

    public void method1 ( ) {
        System.out.println ( "Method 1" );
    }

    @Test(groups = {"2"}, priority=2)
    public void method2 ( ) {
        System.out.println ( "Method 2" );
    }
    @Test(groups = {"3"}, priority=3)

    public void method3 ( ) {
        System.out.println ( "Method 3" );
    }

    @Test(enabled = true, groups = {"3"}, priority=4, description = "AssertionError-text")
    public void errorMethod ( ) {
        Assert.assertEquals(5, (2+3));
        System.out.println ( "Method 4 - errorMethod" );
    }


    @Test( dependsOnMethods={"method2"}, priority=5)
    public void dependOnMethod1 ( ) {
        System.out.println ( "Method 5 - dependOnMethod1" );
    }

    @Test( dependsOnGroups={"1"}, priority=6)
    public void dependsOnGroup1 ( ) {

        System.out.println("Method 6 - dependsOnGroup-1");
    }
    @Test(threadPoolSize = 3, invocationCount = 10, invocationTimeOut = 1000)
    public void checkThreads()
    {
        System.out.println("Thread: " + Thread.currentThread().getId());
    }

//Dataprovider + ITestContext

    @Test(dataProvider = "dataProvider", groups = {"groupA"})
    public void test1(int number) {
        Assert.assertEquals(number, 3);
    }

    @Test(dataProvider = "dataProvider", groups = "groupB")
    public void test2(int number) {
        Assert.assertEquals(number, 2);
    }

    @DataProvider(name = "dataProvider")
    public Object[][] provideData(ITestContext context) {

        Object[][] result=null;

        //get test name
        //System.out.println(context.getName());

        for (String group : context.getIncludedGroups()) {

            System.out.println("group : " + group);

            if ("groupB".equals(group)) {
                result = new Object[][] { { 1 } };
                System.out.println("RESULT 111");
                break;
            }

        }

        if (result== null) {
            result = new Object[][] { { 2 } };
            System.out.println("RESULT 222");
        }
        return result;

    }
    //Dataprovider + ITestContext (example above)






}



*/
