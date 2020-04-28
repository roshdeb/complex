package project;

public class Projectile {
    Position[] positionArray = new Position[100];


    public Position[] Project(double angle, double velocity) {
        double y = 0;
        double x = 0;
        double a = Math.toRadians(angle);
        double hvelocity = velocity * (Math.cos(a));
        double vvelocity = velocity * (Math.sin(a));
        for(int t = 0; y >= 0; t++ ) {
            x= hvelocity*t;
            y=vvelocity*t + 0.5*(Position.G * -1)*(t*t);
            if (y>=0) {


                Position p = new Position(x,y,t);

                positionArray[t] = p;

                /*System.out.println("x" + " " + "Y" + " " + "t");
                System.out.println(p.x + " " + p.y + " " + p.time);*/
            }
        }
        return positionArray;

    }
}
