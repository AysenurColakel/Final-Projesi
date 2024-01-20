public class Proje_15 {
    public static void main(String[] args) {
        double a = 15;
        double b = 55;
        double c = 11;

        double x = solveEquation(a, b, c);

        System.out.println("x = " + x);
    }

    public static double solveEquation(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0) {
            double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            // İki kök olduğunda, birini döndürebilirsiniz. İstediğiniz şekilde ayarlayabilirsiniz.
            return x1;
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            return x;
        } else {
            // Denklemin gerçel kökü yoksa, istediğiniz şekilde bir değer döndürebilirsiniz.
            return Double.NaN;
        }
    }
}