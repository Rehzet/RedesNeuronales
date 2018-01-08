package Perceptron;

/**
 * Created by Victor on 05/01/2018.
 */
public class Perceptron {

    private Neurona neuronas[];
    private double a;

    private double[][] entradas;
    private double[] pesos;
    private double[] tablaAprendizaje;

    public Perceptron(int numNeuronas, double[][] entradas){
        this.entradas = entradas;
        neuronas = new Neurona[numNeuronas];
    }

    public double[] entrenar(double tasaAprendizaje, double[] pesosIniciales,  double[]tablaAprendizaje, int epoch){

        this.tablaAprendizaje = tablaAprendizaje;
        a = tasaAprendizaje;

        int i = 0,
            contEpoch = 0;
        double[] incW = new double[entradas[i].length];
        pesos = pesosIniciales;
        do {
            neuronas[0] = new Neurona(entradas[i], pesos);

            System.out.print("Entradas: (" );
            for (int j = 0; j < entradas[i].length; j++) {
                System.out.print(entradas[i][j] + ", ");
            }
            System.out.print(")");

            System.out.print("\tSalida: " + neuronas[0].salida());
            System.out.print("\t AW: (");
            for (int j = 0; j < incW.length; j++) {
                incW[j] = a * entradas[i][j] * (tablaAprendizaje[i] - neuronas[0].salida());
                System.out.print(incW[j] + ", ");
            }
            System.out.print(")");

            for (int j = 0; j < pesos.length; j++) {
                pesos[j] = pesos[j] + incW[j];
            }

            System.out.println();
            if(i==entradas.length - 1){
                i=0;
                System.out.println("_______________________________");
                contEpoch++;
            }
            else
                i++;
        }while(contEpoch < epoch * 2);

        return pesos;
    }

    public void setPesos(double[] pesos){
        this.pesos = pesos;
    }

    public double salida(double[] entradas){

       return new Neurona(entradas, pesos).salida();
    }

}
