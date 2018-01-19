package RedesNeuronales;

import java.util.ArrayList;

public class Capa extends ArrayList{

    private int funcionActivacion;
    private int numNeuronas;

    private ArrayList<Neurona> neuronas;

    public Capa(int numNeuronas, int funcionActivacion){
        neuronas = new ArrayList<>();
        this.funcionActivacion = funcionActivacion;
        this.numNeuronas = numNeuronas;
    }



}
