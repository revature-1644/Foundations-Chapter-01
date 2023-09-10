import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;

public class LabTest {
    /**
     * The lab1() method should be retrievable via reflection from the Lab class, and it should return a String value.
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
                    methods[i].invoke(lab, new Object[]{});
                }catch(ReflectiveOperationException e){
                    Assert.fail("lab1 method was found, but could not be run. Please ensure that the lab method" +
                            " accepts 0 arguments, and that the method does not throw any exceptions on its own.");
                }catch (ClassCastException e ){
                    Assert.fail("An issue occurred with the value returned from method lab1. Ensure that " +
                            " the return type is of type String.");
                }
            }
        }
        if(!methodFoundFlag){
            Assert.fail("The method lab1() was not found in Lab.class.");
        }
    }
    /**
     * The lab2() method should be retrievable via reflection from the Lab class, and it should return an int value.
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
                    methods[i].invoke(lab, new Object[]{});
                }catch(ReflectiveOperationException e){
                    Assert.fail("lab2 method was found, but could not be run. Please ensure that the lab method" +
                            " accepts 0 arguments, and that the method does not throw any exceptions on its own.");
                }catch (ClassCastException e ){
                    Assert.fail("An issue occurred with the value returned from method lab1. Ensure that " +
                            " the return type is of type int.");
                }
            }
        }
        if(!methodFoundFlag){
            Assert.fail("The method lab2() was not found in Lab.class.");
        }
    }
}
