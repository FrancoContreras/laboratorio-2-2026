package ar.edu.unlu.poo.labo2.artefactos;

import ar.edu.unlu.poo.labo2.estrategias.EstrategiaDeMejora;

public class AlquimistaExperto implements EstrategiaDeMejora {
    @Override
    public void mejorar(Artefacto artefacto) {
        if(artefacto.getTipo().equals("Poción")){
            artefacto.incrementarPoder(20);
            artefacto.limitarPoderMaximo(100);
        }
    }
}
