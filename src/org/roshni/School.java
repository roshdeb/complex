package org.roshni;

public class School {

    private String name;

    School(String name){
        this.name = name;
    }
    String schoolName() {
        return name;
    }
    double displayEnglishAverage() {
        Student roshni = new Student();
        Student ron = new Student ();
        roshni.englishGrade = 83;
        ron.englishGrade = 80;
        double englishAverage = (double)(roshni.englishGrade + ron.englishGrade)/2;
        return englishAverage;

    }
}
