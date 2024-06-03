package com.polovyi.ivan.tutorials;

public class SuperClass {

    public String value1;
    public String value2;
    public String value3;
    public String value4 = this.initValue4();


    public SuperClass(String value1, String value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public SuperClass(String value1, String value2,
            String value3, String value4) {
        this(value1, value2); // constructor chaining
        this.value3 = value3;
        // this(value1, value2); // won't compile
        this.value4 = value4;
    }

    {
        this.value3 = "SuperClass: initialized inside Instance initializer block";
    }

    public String initValue4() {
        this.printValuesStatic();
        return "SuperClass: Initialized from instance method";
    }

    public void printValues() {
        System.out.println("SuperClass: " + value1 + " | " +
                value2 + " | " +
                value3 + " | " +
                value4);
    }

    public static void printValuesStatic() {
        System.out.println("SuperClass: static method");
    }

}
