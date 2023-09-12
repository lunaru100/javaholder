package com.company;

public class Compare<AnyType extends Comparable> {
    public void compareValues(AnyType a,AnyType b){
        if(a.compareTo(b) > 0){
            System.out.printf("Wartosc %s jest wieksza niz %s \n",a,b);
        }else if(a.compareTo(b) < 0){
            System.out.printf("Wartosc %s jest mniejsza niz %s \n",a,b);
        }else {
            System.out.printf("Wartosc %s == %s\n", a, b);
        }
    }


    /*public void compareValues(int a,int b) {
        if(a>b) System.out.println(a + " jest wieksze niz " + b);
        else if (a==b) System.out.println(a + " jest rowne " + b);
        else System.out.println(a + " jest mniejsze niz " + b);
    }
    public void compareValues(float a,float b) {
        if(a>b) System.out.println(a + " jest wieksze niz " + b);
        else if (a==b) System.out.println(a + " jest rowne " + b);
        else System.out.println(a + " jest mniejsze niz " + b);
    }
    public void compareValues(double a,double b) {
        if(a>b) System.out.println(a + " jest wieksze niz " + b);
        else if (a==b) System.out.println(a + " jest rowne " + b);
        else System.out.println(a + " jest mniejsze niz " + b);
    }
    public void compareValues(String a, String b){
        if(a.compareTo(b) > 0){
            System.out.printf("Wartosc %s jest wieksza niz %s \n",a,b);
        }else if(a.compareTo(b) < 0){
            System.out.printf("Wartosc %s jest mniejsza niz %s \n",a,b);
        }else {
            System.out.printf("Wartosc %s == %s\n", a, b);
        }
    }
    public void compareValues(byte a,byte b) {
        if(a>b) System.out.println(a + " jest wieksze niz " + b);
        else if (a==b) System.out.println(a + " jest rowne " + b);
        else System.out.println(a + " jest mniejsze niz " + b);
    }*/

}
