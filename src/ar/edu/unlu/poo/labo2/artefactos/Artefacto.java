package ar.edu.unlu.poo.labo2.artefactos;

import ar.edu.unlu.poo.labo2.estrategias.EstrategiaDeMejora;

import java.util.Objects;

public class Artefacto implements EstrategiaDeMejora {
    private final String nombre;
    private int nivelDePoder;
    private final String tipo;

    public Artefacto(String nombre, int nivelDePoder, String tipo) {
        this.nombre = nombre;
        this.nivelDePoder = nivelDePoder;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNivelDePoder() {
        return nivelDePoder;
    }

    // compatibilidad con Labo 1
    public int getPoder() {
        return getNivelDePoder();
    }

    public String getTipo() {
        return tipo;
    }

    // =========================================================================
    // Métodos de Dominio (Tell, Don't Ask)
    // =========================================================================

    public boolean esDeTipo(String tipoBuscado) {
        return this.tipo != null && this.tipo.equalsIgnoreCase(tipoBuscado);
    }

    public void incrementarPoder(int incremento) {
        if (incremento > 0) {
            this.nivelDePoder += incremento;
        }
    }

    public void reducirPoder(int decremento) {
        if (decremento > 0) {
            this.nivelDePoder = Math.max(0, this.nivelDePoder - decremento);
        }
    }

    public void limitarPoderMaximo(int maximo) {
        if (this.nivelDePoder > maximo) {
            this.nivelDePoder = maximo;
        }
    }

    public void duplicarPoder() {
        this.nivelDePoder *= 2;
    }

    public void incrementarPoderPorcentual(double porcentaje) {
        if (porcentaje > 0) {
            this.nivelDePoder = (int) Math.round(this.nivelDePoder * (1.0 + porcentaje));
        }
    }

    // =========================================================================
    // Identidad basada exclusivamente en el nombre (Labo 1)
    // =========================================================================

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Artefacto artefacto = (Artefacto) o;
        return Objects.equals(nombre, artefacto.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return "Artefacto{" +
                "nombre='" + nombre + '\'' +
                ", nivelDePoder=" + nivelDePoder +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    @Override
    public void mejorar(Artefacto artefacto) {

    }


}