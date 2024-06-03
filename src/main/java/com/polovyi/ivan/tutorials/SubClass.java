package com.polovyi.ivan.tutorials;

public class SubClass extends SuperClass {

    public String value3 = super.value3;
    public String value4 = super.initValue4();

    public SubClass(String value1, String value2) {
        super(value1, value2);
    }

    public SubClass(String value1, String value2,
            String value3, String value4) {
        super(value1, value2); // constructor chaining
        this.value3 = value3;
        // super(value1, value2); // won't compile
        this.value4 = value4;
    }

    {
        super.value3 = "SubClass: initialized inside Instance initializer block";
    }

    public String initValue4() {
        super.printValuesStatic();
        return "SubClass: Initialized from instance method";
    }

    @Override
    public void printValues() {
        System.out.println("Called from SubClass: ");
        super.printValues();
    }
}