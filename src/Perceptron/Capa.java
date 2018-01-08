package Perceptron;

import java.util.ArrayList;

public class Capa extends ArrayList{

    private int funcionActivacion;
    private ArrayList<Neurona> neuronas;

    public Capa(int funcionActivacion){
        neuronas = new ArrayList<>();
        this.funcionActivacion = funcionActivacion;
    }

    public void addNeurona(double[] entradas, double[] pesos){
        neuronas.add(new Neurona(entradas, pesos, funcionActivacion));
    }

}
