/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package negocio;

/**
 *
 * @author Ruan Ferreira da Silva RA:5660120606
 */
public class Mamografia {
    //Declaração de Atributos
    private Long id;
    private Long idFicha;
    private String posicao;
    private String imagem;
    
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
     * @return the idFicha
     */
    public Long getIdFicha() {
        return idFicha;
    }

    /**
     * @param idFicha the idFicha to set
     */
    public void setIdFicha(Long idFicha) {
        this.idFicha = idFicha;
    }

    /**
     * @return the posicao
     */
    public String getPosicao() {
        return posicao;
    }

    /**
     * @param posicao the posicao to set
     */
    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    /**
     * @return the imagem
     */
    public String getImagem() {
        return imagem;
    }

    /**
     * @param imagem the imagem to set
     */
    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
}
