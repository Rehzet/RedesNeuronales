import RedesNeuronales.FuncionActivacion;
import RedesNeuronales.Neurona;

import java.util.Random;

/**
 * Created by Victor on 05/01/2018.
 */
public class Test {

    public static void main(String[] args) {

        Random r = new Random();

//        Neurona a = new Neurona(new double[] {1, 1, 2}, new double[] {0.5, 0.5, -0.5}, FuncionActivacion.ESCALON);
//        System.out.println("a: " + a.salida());
//
//        Neurona b = new Neurona(new double[] {1, 0.5, 1.5, 0.5}, new double[] {1.5, -1, -1, 1}, FuncionActivacion.LINEAL);
//        System.out.println("b: " + b.salida());
//
//        Neurona c = new Neurona(new double[] {1, -1, 2}, new double[] {-1, a.salida(), b.salida()}, FuncionActivacion.SIGMOIDAL);
//        System.out.println("c: " + c.salida());

        System.out.println("OR");
        Perceptron pOr = new Perceptron(2, new double[][] {{1, 0, 0}, {1, 0, 1}, {1, 1, 0}, {1, 1, 1}});
        pOr.setPesos(pOr.entrenar(1, new double[]{0, 0, 0}, new double[]{0, 1, 1, 1}, 1, FuncionActivacion.ESCALON));
        System.out.println("\n" + pOr.salida(new double[] {0, 0}));

        System.out.println("OR3");
        Perceptron pOr3 = new Perceptron(2, new double[][]{{1, 0, 0, 0},{1, 0, 0, 1},{1, 0, 1, 0},{1, 0, 1, 1},{1, 1, 0, 0},{1, 1, 0, 1},{1, 1, 1, 0},{1, 1, 1, 1}});
        pOr3.setPesos(pOr3.entrenar(1, new double[]{0, 0, 0, 0}, new double[] {0, 1, 1, 1, 1, 1, 1, 1 }, 5, FuncionActivacion.ESCALON));
        System.out.println("\n" + pOr3.salida(new double[] {0, 0, 1}));

        System.out.println("AND");
        Perceptron pAnd = new Perceptron(2, new double[][] {{1, 0, 0}, {1, 0, 1}, {1, 1, 0}, {1, 1, 1}});
        pAnd.setPesos(pAnd.entrenar(1, new double[]{0, 0, 0}, new double[]{0, 0, 0, 1}, 2, FuncionActivacion.ESCALON));
        System.out.println("\n" + pAnd.salida(new double[]{1, 1}));

        System.out.println("NAND");
        Perceptron pNand = new Perceptron(2, new double[][] {{1, 0, 0}, {1, 0, 1}, {1, 1, 0}, {1, 1, 1}});
        pNand.setPesos(pNand.entrenar(1, new double[]{0, 0, 0}, new double[]{1, 1, 1, 0}, 4, FuncionActivacion.ESCALON));

        System.out.println("Tabla del 2");
        Perceptron tabla2 = new Perceptron(2, new double[][]{{1, 0.2, 0.1},{1, 0.2, 0.2},{1, 0.2, 0.3},{1, 0.2, 0.4},{1, 0.2, 0.5},{1, 0.2, 0.6},{1, 0.2, 0.7},{1, 0.2, 0.8},{1, 0.2, 0.9},{1, 0.2, 1}});
        tabla2.setPesos(tabla2.entrenar(0.5, new double[]{0, 0, 0}, new double[]{0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1}, 1, FuncionActivacion.LINEAL));

    }
}
