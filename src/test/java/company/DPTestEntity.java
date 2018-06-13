/*
package company;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import company.DPTest;

import java.lang.reflect.Method;

import static org.testng.Assert.*;


public class DPTestEntity {


    private DPTest calc = new DPTest ();

    @DataProvider
    public Object[][] summLocalData ( ) {
        return new Object[][]{
                {5 , calc.summ ( 2 , 3 )} ,
                {0 , calc.summ ( 0 , 0 )} ,
                {0 , calc.summ ( -2 , 2 )} ,
                {-100 , calc.summ ( -30 , -70 )} ,
                {10000 , calc.summ ( 3000 , 7000 )} ,
                };
    }

    @Test(dataProvider = "summLocalData")
    public void sum ( int rezult , int sumDigit ) {
        assertEquals ( rezult , sumDigit );
        System.out.println ( rezult );
    }

    @Test(dataProvider = "multi-param")
    public void multiParameter ( String a , int i , long l , boolean b ) {
        System.out.println ( "String: " + a + ", int: " + i + ", long: " + l + ", boolean: " + b );
    }

    @DataProvider(name = "multi-param")
    public Object[][] dpMultiParam ( ) {
        return new Object[][]{
                {"a" , 1 , 10L , true} ,
                {"b" , 2 , 20L , false} ,
                {"c" , 3 , 30L , true} ,
                {"d" , 4 , 40L , false}
        };
    }

    @Test(dataProvider = "dpWithMethod")
    public void client1 ( String p ) {
        System.out.println ( p );
    }

    @Test(dataProvider = "dpWithMethod")
    public void client2 ( String p ) {
        System.out.println ( p );
    }

    @Test(dataProvider = "dpWithMethod")
    public void commonClient ( String p ) {
        System.out.println ( p );
    }

    @DataProvider
    public Object[][] dpWithMethod ( Method m ) {
        switch (m.getName ()) {
            case "client1":
                return new Object[][]{{"one"} , {"two"}};
            case "client2":
                return new Object[][]{{"1"} , {"2"}};
            default:
                return new Object[][]{{"i"} , {"ii"}};
        }
    }
}



*/
