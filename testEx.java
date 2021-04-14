package testcases;

import ex.Ex;
import org.junit.Test;
import org.junit.Ignore;
import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import junit.framework.TestCase;
import junit.framework.TestResult;
import java.lang.IllegalArgumentException;


public class testEx extends TestCase {
    @Override
    @Before 
    public void setUp(){
    }
    @Test
    public void testCaseDemo(){
        //count the number of test cases
        System.out.println("No of Test Case =" + this.countTestCases());
        //test getName
        String name = this.getName();
        System.out.println("Test case name =" + name);
        //test setName
        this.setName("testNewAdd");
        String newName = this.getName();
         System.out.println("Update Test Case Name =" + newName);
    }
    //tearDown used to close the connection or clean up activities
    @Override
    @After
    public void tearDown(){
        
    }
    
    @Test
    public void testEx_1(){
        Ex e= new Ex();
        assertEquals(31,e.dayofmonth(1,2000));
    }
    @Test
    public void testEx_21(){
        Ex e= new Ex();
        assertEquals(60,e.dayofmonth(2,2020));
    }
    @Test
    public void testEx_22(){
        Ex e= new Ex();
        assertEquals(59,e.dayofmonth(2,2021));
    }
    @Test
    public void testEx_31(){
        Ex e= new Ex();
        assertEquals(91,e.dayofmonth(3,2020));
    }
     @Test
    public void testEx_32(){
        Ex e= new Ex();
        assertEquals(90,e.dayofmonth(3,2021));
    }
    @Test
    public void testEx_41(){
        Ex e= new Ex();
        assertEquals(121,e.dayofmonth(4,2020));
    }
    @Test
    public void testEx_42(){
        Ex e= new Ex();
        assertEquals(120,e.dayofmonth(4,2021));
    }
    @Test
    public void testEx_51(){
        Ex e= new Ex();
        assertEquals(152,e.dayofmonth(5,2020));
    }
    @Test
    public void testEx_52(){
        Ex e= new Ex();
        assertEquals(151,e.dayofmonth(5,2021));
    }
    @Test
    public void testEx_61(){
        Ex e= new Ex();
        assertEquals(182,e.dayofmonth(6,2020));
    }
    @Test
    public void testEx_62(){
        Ex e= new Ex();
        assertEquals(181,e.dayofmonth(6,2021));
    }
    @Test
    public void testEx_71(){
        Ex e= new Ex();
        assertEquals(213,e.dayofmonth(7,2020));
    }
    @Test
    public void testEx_72(){
        Ex e= new Ex();
        assertEquals(212,e.dayofmonth(7,2021));
    }
     @Test
    public void testEx_81(){
        Ex e= new Ex();
        assertEquals(243,e.dayofmonth(8,2020));
    }
    @Test
    public void testEx_82(){
        Ex e= new Ex();
        assertEquals(242,e.dayofmonth(8,2021));
    }
     @Test
    public void testEx_91(){
        Ex e= new Ex();
        assertEquals(274,e.dayofmonth(9,2020));
    }
    @Test
    public void testEx_92(){
        Ex e= new Ex();
        assertEquals(273,e.dayofmonth(9,2021));
    }
    @Test
    public void testEx_101(){
        Ex e= new Ex();
        assertEquals(304,e.dayofmonth(10,2020));
    }
    @Test
    public void testEx_102(){
        Ex e= new Ex();
        assertEquals(303,e.dayofmonth(10,2021));
    }
    @Test
    public void testEx_111(){
        Ex e= new Ex();
        assertEquals(335,e.dayofmonth(11,2020));
    }
    @Test
    public void testEx_112(){
        Ex e= new Ex();
        assertEquals(334,e.dayofmonth(11,2021));
    }
    @Test(timeout=100)
    public void testEx_121(){
        Ex e= new Ex();
        assertEquals(365,e.dayofmonth(12,2020));
    }
    @Ignore
    @Test
    public void testEx_122(){
        Ex e= new Ex();
        assertEquals(364,e.dayofmonth(12,2021));
    }
    @Test(expected=IllegalArgumentException.class)
    public void testEx_YearType(){
        Ex e= new Ex();
        e.month(7);
    }
    @Override
    public TestResult run(){
        TestResult result = createResult();
        run(result);
        return result;
    }   
}
