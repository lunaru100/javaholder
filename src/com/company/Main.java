package com.company;

public class Main {

    public static void main(String[] args) {
        /*System.out.println("GenericHolder:");
	    GenericHolder<Integer> genericHolder = new GenericHolder(123);
        System.out.println(genericHolder.getObj());
        System.out.println(genericHolder.getObj().getClass().getSimpleName());
        genericHolder.setObj(333); //"333"
        System.out.println(genericHolder.getObj() + 1);

        System.out.println("ObjectHolder:");
        ObjectHolder objectHolder = new ObjectHolder(123);
        System.out.println(objectHolder.getObj());
        System.out.println(objectHolder.getObj().getClass().getSimpleName());
        objectHolder.setObj(333); //"333"
        System.out.println((int)objectHolder.getObj() + 1);*/

        Compare MyComparator = new Compare();
        MyComparator.compareValues(new Car(),new Car());
        MyComparator.compareValues(1,1);
        MyComparator.compareValues(1.1d,2.2d);
        MyComparator.compareValues(1.0f,0.1f);
        MyComparator.compareValues((byte)1, (byte)2);
        MyComparator.compareValues("00001", "2");

        /*Compare MyComparator = new Compare();
        MyComparator.compareValues(new Car("BMW", 100.1d, 100, 100), new Car("AUDI", 100d, 100, 100));
        MyComparator.compareValues(new Car("BMW", 100, 101, 100), new Car("AUDI", 100, 100, 100));
        MyComparator.compareValues(new Car("BMW", 100, 100, 999), new Car("AUDI", 100, 101, 100));
        MyComparator.compareValues(new Car("BMW", 100.1f, 100, (byte)101), new Car("AUDI", 100.1f, 100, (byte)100));*/


    }
}
