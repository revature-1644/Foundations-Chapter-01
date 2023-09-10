import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Method;

public class LabTest {
    /**
     * The lab() method should be retrievable via reflection from the Lab class.
     */
    @Test
    public void labMethodTest(){
        Lab lab = new Lab();
        Method[] methods = Lab.class.getMethods();
        boolean methodFoundFlag = false;
        for(int i = 0; i < methods.length; i++){
            if(methods[i].getName().equals("lab")){
                methodFoundFlag = true;
                try {
                    methods[i].invoke(lab, new Object[]{});
                }catch(ReflectiveOperationException e){
                    Assert.fail("lab method was found, but could not be run. Please ensure that the lab method" +
                            " accepts 0 arguments, and that the method does not throw any exceptions on its own.");
                }
            }
        }
        if(!methodFoundFlag){
            Assert.fail("The method lab() was not found in Lab.class.");
        }
    }
}
