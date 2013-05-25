/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ultrabate.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Denisio
 */
@Entity
@Table(name="tb_pess_jur")
public class PessoaJuridica implements Serializable {
   @Id @GeneratedValue(strategy = GenerationType.AUTO) 
   private int Id;
   @Column(name="Emp_Documento")
   private String EmpresaDocumento;
   @Column(name="Pjur_Codigo_Pessoa")
   private String codigoPessoaJuridica;        
   @Column(name="Pjur_Documento")
   private String documentoPessoaJuridica;
   @Column(name="Pjur_RSocial")
   private String razaoSocial;       
   @Column(name="Pjur_IE")
   private String inscricaoEstadual;
   @Column(name="Pjur_observacao")
   private String observacao;       
   @Column(name="Pjur_Email")
   private String emailPessoaJuridica;       
   @Column(name="PJur_Web")
   private String sitePessoaJuridica;       
   @Column(name="Pjur_Telefone")
   private String telefone;       
   @Column(name="Pjur_CCM")
   private String ccm;       
   @Column(name="Pjur_RTCR")
   private String rtcr;       
   @Column(name="Pjur_Ind_Matriz")
   private String indMatriz;       
   @Column(name="Pjur_Fax")
   private String faxPessoaJuridica;       
   @Column(name="Pjur_Celular")
   private String celular;       
   @Column(name="Pjur_NmContato")
   private String numeroContato;       
   @Column(name="Pjur_Banco")
   private String codigoDnit;      
   @Column(name="Pjur_Ag")
   private String senhaDnit;       
   @Column(name="Pjur_Conta")
   private String conta;       
   @Column(name="Pjur_IndRel")
   private String relacionamento;       
   @Column(name="status") 
   private String status;       
   @Column(name="faturamento")
   private String faturamento;       
   @Column(name="prazo")
   private int prazo;
   @Column(name="Nomefantasia")
   private String nomeFantasia;       
   @Column(name="CodigoNotaFiscal")
   private String codigoNotaFiscal;       
   @Column(name="formacobranca")
   private String formaCobranca;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getEmpresaDocumento() {
        return EmpresaDocumento;
    }

    public void setEmpresaDocumento(String EmpresaDocumento) {
        this.EmpresaDocumento = EmpresaDocumento;
    }

    public String getCodigoPessoaJuridica() {
        return codigoPessoaJuridica;
    }

    public void setCodigoPessoaJuridica(String codigoPessoaJuridica) {
        this.codigoPessoaJuridica = codigoPessoaJuridica;
    }

    public String getDocumentoPessoaJuridica() {
        return documentoPessoaJuridica;
    }

    public void setDocumentoPessoaJuridica(String documentoPessoaJuridica) {
        this.documentoPessoaJuridica = documentoPessoaJuridica;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getEmailPessoaJuridica() {
        return emailPessoaJuridica;
    }

    public void setEmailPessoaJuridica(String emailPessoaJuridica) {
        this.emailPessoaJuridica = emailPessoaJuridica;
    }

    public String getSitePessoaJuridica() {
        return sitePessoaJuridica;
    }

    public void setSitePessoaJuridica(String sitePessoaJuridica) {
        this.sitePessoaJuridica = sitePessoaJuridica;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCcm() {
        return ccm;
    }

    public void setCcm(String ccm) {
        this.ccm = ccm;
    }

    public String getRtcr() {
        return rtcr;
    }

    public void setRtcr(String rtcr) {
        this.rtcr = rtcr;
    }

    public String getIndMatriz() {
        return indMatriz;
    }

    public void setIndMatriz(String indMatriz) {
        this.indMatriz = indMatriz;
    }

    public String getFaxPessoaJuridica() {
        return faxPessoaJuridica;
    }

    public void setFaxPessoaJuridica(String faxPessoaJuridica) {
        this.faxPessoaJuridica = faxPessoaJuridica;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getNumeroContato() {
        return numeroContato;
    }

    public void setNumeroContato(String numeroContato) {
        this.numeroContato = numeroContato;
    }

    public String getCodigoDnit() {
        return codigoDnit;
    }

    public void setCodigoDnit(String codigoDnit) {
        this.codigoDnit = codigoDnit;
    }

    public String getSenhaDnit() {
        return senhaDnit;
    }

    public void setSenhaDnit(String senhaDnit) {
        this.senhaDnit = senhaDnit;
    }

    public String getConta() {
        return conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public String getRelacionamento() {
        return relacionamento;
    }

    public void setRelacionamento(String relacionamento) {
        this.relacionamento = relacionamento;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(String faturamento) {
        this.faturamento = faturamento;
    }

    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCodigoNotaFiscal() {
        return codigoNotaFiscal;
    }

    public void setCodigoNotaFiscal(String codigoNotaFiscal) {
        this.codigoNotaFiscal = codigoNotaFiscal;
    }

    public String getFormaCobranca() {
        return formaCobranca;
    }

    public void setFormaCobranca(String formaCobranca) {
        this.formaCobranca = formaCobranca;
    }

    

}