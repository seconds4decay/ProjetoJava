package br.com.cesarschool.poo.titulos.entidades;

import java.time.LocalDate;

/*
 * Esta classe deve herdar de Ativo.
 * E deve ter os seguintes atributos:
 * taxaJuros, do tipo double.
 * 
 * Deve ter um construtor p�blico que inicializa os atributos, 
 * e m�todos set/get p�blicos para os atributos.
 * 
 * Deve ter um metodo p�blico double calcularPrecoTransacao(double montante): o pre�o
 * da transa��o � montante vezes (1 - taxaJuros/100.0).
 */
public class TituloDivida extends Ativo {
    private double taxaJuros;

    public TituloDivida(int id, String nome, LocalDate data, double taxaJuros) {
        super(id, nome, data);
        this.taxaJuros = taxaJuros;
    }

    public double getTaxaJuros() {
        return this.taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
    }

    public double calcularPrecoTransacao(double montante) {
        return montante * (1 - this.taxaJuros/100.0);
    }
}