public class Lab {
    /**
     * This is a method - which you've already seen, but will function as a basic example of what you'll be writing
     * in this lab.
     *
     * A method is a reusable block of code in Java. In other languages, this structure may also be referred to
     * as a 'function', but in Java, a method specifically is applied to an individual Object. We'll be getting
     * to Objects and OOP at a later point.
     *
     * What does 'public' do? 'public' is an access-modifier keyword that makes this method visible & usable in
     * classes outside this one, such as in test cases.
     *
     * What does 'void' do? 'void' is a return type. You may remember that other methods have had return types of
     * 'String' or 'int'. Most of the time, a method produces some sort of value as a result, which potentially
     * becomes usable in other parts of your program that have used this method. 'void' means that this method
     * is not intended to return anything, so no 'return' statement will be necessary.
     *
     * What does 'sample()' do? 'sample()' is the name of the method, and the 'method signature', such that Java
     * may identify this specific piece of code whenever sample() is used.
     *
     * What does 'String param' do? This is a method parameter, which is a variable of type 'String' named param.
     * That means that another part of your program may execute this code, such as with the line 'lab.sample("hello");',
     * making the variable 'param' equal "hello" within the method.
     */
    public void sample(String param){
        System.out.println("Hello from the sample method! My String is: " + param);
    }
    /**
     * TODO: create a method within this class named 'lab1' that takes in a single String parameter.
     *
     * That means that a variable will be made available within the method that can allow the method to perform
     * customized behavior, as you can see in the sample method above. The String parameter will provide the method
     * with a piece of text it can use and manipulate.
     * You can provide it a public access modifier and a void return type.
     */

    /**
     * TODO: create a method within this class named 'lab2' that takes in a single int parameter.
     *
     * That means that a variable will be made available within the method that can allow the method to perform
     * customized behavior, as you can see in the sample method above. The int param will provide the method with
     * a whole number that it can use and manipulate.
     * You can provide it a public access modifier and a void return type.
     */
}
