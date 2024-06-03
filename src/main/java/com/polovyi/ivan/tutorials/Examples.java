package com.polovyi.ivan.tutorials;

public class Examples {


    public static void main(String[] args) {
        SuperClass superClass1 = new SuperClass("value1", "value2");
        superClass1.printValues();
        SuperClass superClass2 = new SuperClass("value1",
                "value2",
                "value3",
                "value4");
        superClass2.printValues();

        SubClass subClass1 = new SubClass("value1", "value2");
        subClass1.printValues();
        SubClass subClass2 = new SubClass("SubClass value1",
                "SubClass value2",
                "SubClass value3",
                "SubClass value4");
        subClass2.printValues();
    }
}
