/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ultrabate.PessoaJuridicaBean;

import br.com.ultrabate.DAO.PessoaJuridicaDAO;
import br.com.ultrabate.entity.PessoaJuridica;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Denisio
 */
@ManagedBean
@SessionScoped
public class PessoaJuridicaBean {

    /**
     * Creates a new instance of PessoaJuridicaBean
     */
    private PessoaJuridica pessoa = new PessoaJuridica();
    private PessoaJuridicaDAO pessoaDAO = new PessoaJuridicaDAO();
    
    public String adicionarPessoaJuridica(){
        pessoaDAO.addPessoaJuridica(pessoa);
        return "index";
    }

    public String removerPessoaJuridica(){
        
        pessoaDAO.removePessoaJuridica(pessoa);
        return "index";
    }
    
    public PessoaJuridica getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaJuridica pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + (this.pessoa != null ? this.pessoa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PessoaJuridicaBean other = (PessoaJuridicaBean) obj;
        if (this.pessoa != other.pessoa && (this.pessoa == null || !this.pessoa.equals(other.pessoa))) {
            return false;
        }
        return true;
    }
}
