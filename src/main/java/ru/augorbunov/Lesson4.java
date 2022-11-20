package ru.augorbunov;

public class Lesson4 {
    public static void main(String[] args) {
        //math operators
        short shortValue;
        int intValue;
        long longValue;

        shortValue = Short.MAX_VALUE;
        intValue = Integer.MAX_VALUE;
        longValue = Long.MAX_VALUE;

        System.out.println("Max short value: " + shortValue);
        System.out.println("Max integer value: " + intValue);
        System.out.println("Max long value: " + longValue);

        //logic operators
        for (int i=0; i<2; i++) {
            System.out.println("Value: "+ shortValue + i);
            if (shortValue + i <= shortValue) {
                System.out.println("The value can be stored in short type");
            }
            else if (shortValue + i <= intValue) {
                System.out.println("The value can be stored in integer type");
            }
            else {
                System.out.println("The value can be stored in long type");
            }
        }

        //overflow
        intValue = intValue + 1;
        System.out.println(intValue);

        //integer + double
        int iValue = 5;
        double dValue = 3.14;
        dValue += iValue;
        System.out.println("double + int: " + dValue);

        iValue = 5;
        dValue = 3.14;
        iValue += dValue;
        System.out.println("int + double: " + iValue);
    }
}
