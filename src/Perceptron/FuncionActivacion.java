package Perceptron;

/**
 * Created by Victor on 05/01/2018.
 */
public class FuncionActivacion {

    public static final int ESCALON = 0;
    public static final int LINEAL = 1;
    public static final int SIGMOIDAL = 2;
    public static final int TANH = 3;

    private static double escalon(double x){
        if (x > 0)
            return 1;
        else
            return 0;
    }

    private static double lineal(double x){
        return x;
    }

    private static double sigmoidal (double x){
        return 1 / (1 + Math.pow(Math.E, -x));
    }

    private static double tanh(double x){
        return Math.tanh(x);
    }

    public static double funcionActivacion(double x, int funcion){
        switch (funcion){
            case ESCALON:
                return escalon(x);
            case LINEAL:
                return lineal(x);
            case SIGMOIDAL:
                return sigmoidal(x);
            case TANH:
                return tanh(x);
            default:
                System.out.println("LA FUNCION ELEGIDA NO EXISTE");
                return -123456789;
        }
    }

}
