import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;

public class LabTest {
    /**
     * The lab1(String param) method should be retrievable via reflection from the Lab class.
     */
    @Test
    public void lab1MethodTest(){
        Lab lab = new Lab();
        Method[] methods = Lab.class.getMethods();
        boolean methodFoundFlag = false;
        for(int i = 0; i < methods.length; i++){
            if(methods[i].getName().equals("lab1")){
                methodFoundFlag = true;
                try {
                    methods[i].invoke(lab, new Object[]{"test"});
                }catch(ReflectiveOperationException e){
                    Assert.fail("lab1 method was found, but could not be run. Please ensure that the lab method" +
                            " accepts 1 String argument, and that the method does not throw any exceptions on its own.");
                }
            }
        }
        if(!methodFoundFlag){
            Assert.fail("The method lab1(String param) was not found in Lab.class.");
        }
    }
    /**
     * The lab2(int param) method should be retrievable via reflection from the Lab class.
     */
    @Test
    public void lab2MethodTest(){
        Lab lab = new Lab();
        Method[] methods = Lab.class.getMethods();
        boolean methodFoundFlag = false;
        for(int i = 0; i < methods.length; i++){
            if(methods[i].getName().equals("lab2")){
                methodFoundFlag = true;
                try {
                    methods[i].invoke(lab, new Object[]{1});
                }catch(ReflectiveOperationException e){
                    Assert.fail("lab2 method was found, but could not be run. Please ensure that the lab method" +
                            " accepts 1 int argument, and that the method does not throw any exceptions on its own.");
                }
            }
        }
        if(!methodFoundFlag){
            Assert.fail("The method lab2(int param) was not found in Lab.class.");
        }
    }
}
