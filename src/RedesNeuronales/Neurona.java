package RedesNeuronales;

/**
 * Created by Victor on 05/01/2018.
 */
public class Neurona {

    private int funcion;
    private double neta = 0;
    private double[] entradas;
    private double[] pesos;

    public Neurona(double[] entradas, double[] pesos){
        copiar(entradas, pesos);
        setFuncion(FuncionActivacion.LINEAL);
    }

    public Neurona(double[] entradas, double[] pesos, int funcion){
        copiar(entradas, pesos);
        setFuncion(funcion);
    }

    public double salida(){
        calcularNeta();
        return FuncionActivacion.funcionActivacion(neta, funcion);
    }


    private void calcularNeta(){
        neta = 0;
        for(int i=0; i<entradas.length; i++){
            neta += entradas[i] * pesos[i];
        }
    }

    private void copiar(double[] entradas, double[] pesos){
//        this.entradas = new double[entradas.length + 1];
//        this.entradas[0] = 1;
//        for(int i=1; i<=entradas.length; i++){
//            this.entradas[i] = entradas[i-1];
//        }
        this.entradas = new double[entradas.length];
        for (int i = 0; i < entradas.length; i++) {
            this.entradas[i] = entradas[i];
        }

        this.pesos = new double[pesos.length];
//        this.pesos[0] = Math.random();
//        for(int i=1; i<=pesos.length; i++){
//            this.pesos[i] = pesos[i-1];
//        }
        for (int i = 0; i < pesos.length; i++) {
            this.pesos[i] = pesos[i];
        }
    }



    public void setFuncion(int funcion){
        this.funcion = funcion;
    }

    public double[] getEntradas(){
        return entradas;
    }

    public double[] getPesos(){
        return pesos;
    }


}
