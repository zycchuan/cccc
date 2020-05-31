package com.zyc;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private static int x=100;
    public static void main(String args[]){
        AppTest hs1=new AppTest();
             hs1.x++;
        AppTest  hs2=new AppTest();
           hs2.x++;
           hs1=new AppTest();
            hs1.x++;
            AppTest.x--;
          System.out.println("x="+x);
      }
    @Test
    public void shouldAnswerWithTrue(){
        Integer a = new Integer(19);
        Integer b = new Integer(19);
        int c =19;
        System.out.println(a == c);

    }
}
