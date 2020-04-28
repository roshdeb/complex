package org.roshni;

import project.Position;
import project.Projectile;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int []x1 = {};
        int []x2 = {1,2};
        make2(x1, x2);
        Projectile p = new Projectile();

        Position[] pArray = p.Project(45,15);
        for (int i=0; i< pArray.length;i++) {
            if (pArray[i] != null) {
                System.out.println(pArray[i].getX() + " " + pArray[i].getY() + " " + pArray[i].getTime());
            }
        }





    }
    public static int[] make2(int[] a, int[] b) {
        int[] x= new int[2];
        if (a.length==0){
            x[0]=b[0];
            x[0]=b[1];
        }
        if(a.length==1){
            x[0]=a[0];
            x[1]=b[0];
        }
        if(a.length>=2){
            x[0]=a[0];
            x[1]=a[1];
        }
        return x;
    }

}
