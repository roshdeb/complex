package org.roshni;

public class ComplexNumber {
    int rNumber;
    int iNumber;

    ComplexNumber(int rNumber, int iNumber) {
        this.rNumber = rNumber;
        this.iNumber = iNumber;

    }
    public String toString() {
        String cNumber;
        String c1;
        String c2;
        String c3;

        //c1
        if (rNumber != 0 || iNumber ==0){
            c1 = String.valueOf(rNumber);
        }
        else {
            c1="";
        }
        //c2
        if (iNumber > 0) {
            c2 = "+";
        }
        else {
            c2 = "";
        }

        //c3
        if (iNumber != 0) {
            c3 = iNumber + "i";
        }
        else {
            c3 = "";
        }


        cNumber = c1 + c2 + c3;
        return cNumber;
    }
    void displayComplexNumber() {



        System.out.println(toString());




    }

    ComplexNumber addComplexNumber(ComplexNumber other) {
        int totalRNumber = this.rNumber + other.rNumber;
        int totalINumber = this.iNumber + other.iNumber;
        return new ComplexNumber(totalRNumber, totalINumber);


    }

    ComplexNumber subtractComplexNumber(ComplexNumber other) {
        int totalRNumber = this.rNumber - other.rNumber;
        int totalINumber = this.iNumber - other.iNumber;
        return new ComplexNumber(totalRNumber,totalINumber);
    }

    ComplexNumber multiplyComplexNumber(ComplexNumber other) {
        int totalRNumber = (this.rNumber * other.rNumber) - (this.iNumber * other.iNumber);
        int totalINumber = (this.rNumber * other.iNumber) + (this.iNumber * other.rNumber);
        return new ComplexNumber(totalRNumber,totalINumber);
    }


}
