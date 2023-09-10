import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Application {
    /**
     * This class contains a main method that allows you to manually test the MethodParameters lab functionality.
     * No changes you make here affect the test case results. You must still run & pass the test cases.
     * All implementation code should be written in the Lab class.
     *
     * This main method (which is also a method, just a special one that runs on program startup) will use an advanced
     * technique called 'reflection' to retrieve the method you've written in the Lab class and run it. Reflection
     * is used so that the program will compile and run even when no lab() method exists, but still allows lab()
     * to be invoked.
     */
    public static void main(String[] args) {
        Lab lab = new Lab();
        System.out.println("now running the provided method: ");
        lab.sample("hello");
        System.out.println("now attempting to find and run the methods lab1 and lab2 with appropriate parameters:");

        Method[] methods = Lab.class.getMethods();
        boolean method1FoundFlag = false;
        boolean method2FoundFlag = false;
        for(int i = 0; i < methods.length; i++){
            if(methods[i].getName().equals("lab1")){
                method1FoundFlag = true;
                try {
                    methods[i].invoke(lab, new Object[]{"lab1 complete!"});
                } catch (ReflectiveOperationException e) {
                    System.out.println("An issue occurred while trying to run 'lab1(\"lab1 complete!\")'");
                    e.printStackTrace();
                }
            }else if (methods[i].getName().equals("lab2")){
                method2FoundFlag = true;
                try {
                    methods[i].invoke(lab, new Object[]{999});
                } catch (ReflectiveOperationException e) {
                    System.out.println("An issue occurred while trying to run 'lab2(999)'");
                    e.printStackTrace();
                }
            }
        }
        if(method1FoundFlag){
            System.out.println("successfully ran 'lab1()'");
        }else{
            System.out.println("couldn't find the method 'lab1()'");
        }
        if(method2FoundFlag){
            System.out.println("successfully ran 'lab2()'");
        }else{
            System.out.println("couldn't find the method 'lab2()'");
        }
    }
}
