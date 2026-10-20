package ar.edu.unlu.poo.labo2.artefactos;

import ar.edu.unlu.poo.labo2.estrategias.EstrategiaDeMejora;

import java.util.ArrayList;
import java.util.List;

public class EstrategiaCompuesta implements EstrategiaDeMejora {
    private List<EstrategiaDeMejora> estrategias = new ArrayList<EstrategiaDeMejora>();

    public EstrategiaCompuesta(EstrategiaDeMejora... estrategias) {
        for (EstrategiaDeMejora estrategia : estrategias) {
            this.estrategias.add(estrategia);
        }
    }

    @Override
    public void mejorar(Artefacto artefacto) {
        for (EstrategiaDeMejora estrategia : estrategias){
            estrategia.mejorar(artefacto);
        }
    }
}
