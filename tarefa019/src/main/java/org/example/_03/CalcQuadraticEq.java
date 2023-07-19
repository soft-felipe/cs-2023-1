package org.example._03;

public class CalcQuadraticEq {
    public void calcQuadraticEq(double a, double b, double c) {
        double D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("x = " + x);
        }
        else {
            System.out.println("Equation has no roots");
        }
    }

    public void calcQuadraticEqRefatored(double a, double b, double c) {
        double delta = calcDelta(a, b, c);

        if (delta == 0) {
            deltaEqualsZero(a, b);
        } else if (delta > 0) {
            deltaGreaterThanZero(a, b, c);
        } else  {
            System.out.println("Equation has no roots");
        }
    }

    private double calcDelta(double a, double b, double c) {
        return b * b - 4 * a * c;
    }

    private void deltaEqualsZero(double a, double b) {
        double x = -b / (2 * a);
        System.out.println("X = " + x);
    }

    private void deltaGreaterThanZero(double a, double b, double D) {
        double x1 = (-b - Math.sqrt(D)) / (2 * a),
               x2 = (-b + Math.sqrt(D)) / (2 * a);
        System.out.println("X1 = " + x1 + ", X2 = " + x2);
    }
}
