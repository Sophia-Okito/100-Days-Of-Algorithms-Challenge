package com.company;

public class BrakingWell {

    public static void main(String[] args) {
	// write your code here
    }
    public static double dist(double v, double mu) {    // suppose reaction time is 1

        if (mu == 0)
            return 0;

        double d0 = 0;
        double t = 1;
        double g = 9.81;
        v = v / 3.60;

        double d1 = d0 + (v * t);
        double d2 = Math.pow(v, 2.0)/(2 * mu * g);
        double d = d1 + d2;
        return d;
    }
    public static double speed(double d, double mu) {   // suppose reaction time is 1

        if (mu == 0)
            return 0;

        double d0 = 0;
        double t = 1;
        double g = 9.81;
        double a = 1/(2 * mu * g);


        double v = (-t + Math.sqrt( Math.pow(t, 2) - 4 * a * (d0 - d) ) ) / (2 * a);  // [m/s]
        v *= 3.6; // m/s -> Km/h

        return v;
    }
}
