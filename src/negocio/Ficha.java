/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

import java.util.Calendar;




/**
 *
 * @author Ruan Ferreira da Silva RA:5660120606
 */
public class Ficha {
    //Declaração de Atributos
    private Long id;
    private Long idPaciente;
    private Calendar data;
    private String queixas;
    private String sintomas;
    private String habitosAlimentares;
    private String cancerFamilia;
    private String mamografia;
    private String protese;
    private String alteracaoMamilo;
    private String informacoes;

    //Declaração de getters e setters
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
     * @return the idPaciente
     */
    public Long getIdPaciente() {
        return idPaciente;
    }

    /**
     * @param idPaciente the idPaciente to set
     */
    public void setIdPaciente(Long idPaciente) {
        this.idPaciente = idPaciente;
    }

    /**
     * @return the data
     */
    public Calendar getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Calendar data) {
        this.data = data;
    }

    /**
     * @return the queixas
     */
    public String getQueixas() {
        return queixas;
    }

    /**
     * @param queixas the queixas to set
     */
    public void setQueixas(String queixas) {
        this.queixas = queixas;
    }

    /**
     * @return the sintomas
     */
    public String getSintomas() {
        return sintomas;
    }

    /**
     * @param sintomas the sintomas to set
     */
    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    /**
     * @return the habitosAlimentares
     */
    public String getHabitosAlimentares() {
        return habitosAlimentares;
    }

    /**
     * @param habitosAlimentares the habitosAlimentares to set
     */
    public void setHabitosAlimentares(String habitosAlimentares) {
        this.habitosAlimentares = habitosAlimentares;
    }

    /**
     * @return the cancerFamilia
     */
    public String getCancerFamilia() {
        return cancerFamilia;
    }

    /**
     * @param cancerFamilia the cancerFamilia to set
     */
    public void setCancerFamilia(String cancerFamilia) {
        this.cancerFamilia = cancerFamilia;
    }

    /**
     * @return the mamografia
     */
    public String getMamografia() {
        return mamografia;
    }

    /**
     * @param mamografia the mamografia to set
     */
    public void setMamografia(String mamografia) {
        this.mamografia = mamografia;
    }

    /**
     * @return the protese
     */
    public String getProtese() {
        return protese;
    }

    /**
     * @param protese the protese to set
     */
    public void setProtese(String protese) {
        this.protese = protese;
    }

    /**
     * @return the alteracaoMamilo
     */
    public String getAlteracaoMamilo() {
        return alteracaoMamilo;
    }

    /**
     * @param alteracaoMamilo the alteracaoMamilo to set
     */
    public void setAlteracaoMamilo(String alteracaoMamilo) {
        this.alteracaoMamilo = alteracaoMamilo;
    }

    /**
     * @return the informacoes
     */
    public String getInformacoes() {
        return informacoes;
    }

    /**
     * @param informacoes the informacoes to set
     */
    public void setInformacoes(String informacoes) {
        this.informacoes = informacoes;
    }
            
}
