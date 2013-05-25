/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ultrabate.DAO;

import br.com.ultrabate.entity.PessoaJuridica;
import br.com.ultrabate.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Denisio
 */
public class PessoaJuridicaDAO {
    private Session sessao;
    private Transaction transacao;
    
    public void addPessoaJuridica(PessoaJuridica pj){
        
        sessao = HibernateUtil.getSessionFactory().openSession();
        transacao = sessao.beginTransaction();
        
        PessoaJuridica pessoa = new PessoaJuridica();
        
       pessoa.setEmpresaDocumento(pj.getEmpresaDocumento());
       pessoa.setCodigoPessoaJuridica(pj.getCodigoPessoaJuridica());
       pessoa.setDocumentoPessoaJuridica(pj.getCodigoPessoaJuridica());
       pessoa.setRazaoSocial(pj.getRazaoSocial());
       pessoa.setInscricaoEstadual(pj.getCodigoPessoaJuridica());
       pessoa.setObservacao(pj.getObservacao());
       pessoa.setEmailPessoaJuridica(pj.getEmailPessoaJuridica());
       pessoa.setSitePessoaJuridica(pj.getSitePessoaJuridica());
       pessoa.setTelefone(pj.getTelefone());
       pessoa.setCcm(pj.getCcm());
       pessoa.setRtcr(pj.getRtcr());
       pessoa.setIndMatriz(pj.getIndMatriz());
       pessoa.setFaxPessoaJuridica(pj.getFaxPessoaJuridica());
       pessoa.setCelular(pj.getCelular());
       pessoa.setNumeroContato(pj.getNumeroContato());
       pessoa.setCodigoDnit(pj.getCodigoDnit());
       pessoa.setSenhaDnit(pj.getSenhaDnit());
       pessoa.setConta(pj.getConta());
       pessoa.setRelacionamento(pj.getRelacionamento());
       pessoa.setStatus(pj.getStatus());
       pessoa.setFaturamento(pj.getFaturamento());
       pessoa.setPrazo(pj.getPrazo());
       pessoa.setNomeFantasia(pj.getNomeFantasia());
       pessoa.setCodigoNotaFiscal(pj.getCodigoNotaFiscal());
       pessoa.setFormaCobranca(pj.getFormaCobranca());
       
       sessao.save(pessoa);
       transacao.commit();
    
    }
    
    
}
