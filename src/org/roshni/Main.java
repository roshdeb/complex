package org.roshni;

public class Main {

    public static void main(String[] args) {
	// write your code here
    //Just checking Git

    ComplexNumber[] complexArray = new ComplexNumber[10];
    for (int i = 0; i < 10; i++) {
        complexArray[i]= new ComplexNumber((int)(Math.random()*201)-100,(int)(Math.random()*201)-100);
        System.out.println(complexArray[i].toString());
    }
    ComplexNumber start = new ComplexNumber(0,0);
    for (int i = 0; i<10;i++){
        start = start.addComplexNumber(complexArray[i]);
        start.displayComplexNumber();

    }






    /*ComplexNumber complex1 = new ComplexNumber((int)(Math.random()*201)-100,(int)(Math.random()*201)-100);
    ComplexNumber complex2 = new ComplexNumber((int)(Math.random()*201)-100,(int)(Math.random()*201)-100);
    ComplexNumber addResult = complex1.addComplexNumber(complex2);
    ComplexNumber subtractResult = complex1.subtractComplexNumber(complex2);
    ComplexNumber multiplyResult = complex1.multiplyComplexNumber(complex2);

    System.out.println("(" + complex1.toString() + ")+(" + complex2.toString() + ") = (" + addResult.toString()+ ")");
    addResult.displayComplexNumber();
    subtractResult.displayComplexNumber();
    multiplyResult.displayComplexNumber();*/

    }
}
