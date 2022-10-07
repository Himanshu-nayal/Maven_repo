package org.Ttn;

import org.junit.Assert;

public class Test1 {
    @org.junit.Test

public void display()
    {
        Test1 test1=new Test1();
        int result=Sum.sum(12,1);
        System.out.println(result);
        Assert.assertEquals(result,13);
         int result1=org.Ttn.Sum.sum(12,3);
        Assert.assertEquals(15,result1);

        Assert.assertTrue("a>b",true);


    }

}


