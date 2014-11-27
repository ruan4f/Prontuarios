/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

import java.util.Date;

/**
 *
 * @author Ruan Ferreira da Silva RA:5660120606
 */
public class Laudo {
    //Declaração de Atributos
    private Long id;
    private String medico;
    private Date data;
    private String impressao;
    private String composicao;
    private String localizacao;
    private String tamanho;
    private int diagnostico;
    private String recomendacoes;
    
    //Declaração de Getters e Setters

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the medico
     */
    public String getMedico() {
        return medico;
    }

    /**
     * @param medico the medico to set
     */
    public void setMedico(String medico) {
        this.medico = medico;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

    /**
     * @return the impressao
     */
    public String getImpressao() {
        return impressao;
    }

    /**
     * @param impressao the impressao to set
     */
    public void setImpressao(String impressao) {
        this.impressao = impressao;
    }

    /**
     * @return the composicao
     */
    public String getComposicao() {
        return composicao;
    }

    /**
     * @param composicao the composicao to set
     */
    public void setComposicao(String composicao) {
        this.composicao = composicao;
    }

    /**
     * @return the localizacao
     */
    public String getLocalizacao() {
        return localizacao;
    }

    /**
     * @param localizacao the localizacao to set
     */
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    /**
     * @return the tamanho
     */
    public String getTamanho() {
        return tamanho;
    }

    /**
     * @param tamanho the tamanho to set
     */
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    /**
     * @return the diagnostico
     */
    public int getDiagnostico() {
        return diagnostico;
    }

    /**
     * @param diagnostico the diagnostico to set
     */
    public void setDiagnostico(int diagnostico) {
        this.diagnostico = diagnostico;
    }

    /**
     * @return the recomendacoes
     */
    public String getRecomendacoes() {
        return recomendacoes;
    }

    /**
     * @param recomendacoes the recomendacoes to set
     */
    public void setRecomendacoes(String recomendacoes) {
        this.recomendacoes = recomendacoes;
    }
}
