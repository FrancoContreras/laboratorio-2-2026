package ar.edu.unlu.poo.labo2.artefactos;

import ar.edu.unlu.poo.labo2.estrategias.EstrategiaDeMejora;

public class JoyeroElfico implements EstrategiaDeMejora {
    @Override
    public void mejorar(Artefacto artefacto) {
        if(artefacto.getTipo().equals("Amuleto")){
            if(artefacto.getPoder() < 50){artefacto.duplicarPoder();
            }
            else {artefacto.incrementarPoderPorcentual(25.00);}
            artefacto.limitarPoderMaximo(100);
        }
    }
}
