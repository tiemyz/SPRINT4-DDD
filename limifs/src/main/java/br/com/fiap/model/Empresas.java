package br.com.fiap.model;

public class Empresas {

    private String nomeEmpresas;
    private String locEmpresas;
    private String tipoEmpresas;
    private String emailEmpresas;
    private String cnpjEmpresas;
    private String senhaEmpresas;

    public Empresas (String nomeEmpresas, String locEmpresas, String tipoEmpresas, String emailEmpresas, String cnpjEmpresas, String senhaEmpresas) {

        this.nomeEmpresas = nomeEmpresas;
        this.locEmpresas  = locEmpresas;
        this.tipoEmpresas = tipoEmpresas;
        this.emailEmpresas = emailEmpresas;
        this.cnpjEmpresas = cnpjEmpresas;
        this.senhaEmpresas = senhaEmpresas;

    }

    public String getNomeEmpresas() {
        return nomeEmpresas;
    }
    public void setNomeEmpresas(String nomeEmpresas) {
        this.nomeEmpresas = nomeEmpresas;
    }

    public String getLocEmpresas() {
        return locEmpresas;
    }
    public void setLocEmpresas(String locEmpresas) {
        this.locEmpresas = locEmpresas;
    }

    public String getTipoEmpresas() {
        return tipoEmpresas;
    }
    public void setTipoEmpresas(String tipoEmpresas) {
        this.tipoEmpresas = tipoEmpresas;
    }

    public String getEmailEmpresas() {
        return emailEmpresas;
    }
    public void setEmailEmpresas(String emailEmpresas) {
        this.emailEmpresas = emailEmpresas;
    }

    public String getCnpjEmpresas() {
        return cnpjEmpresas;
    }
    public void setCnpjEmpresas(String cnpjEmpresas) {
        this.cnpjEmpresas = cnpjEmpresas;
    }
    
    public String getSenhaEmpresas() {
        return senhaEmpresas;
    }
    public void setSenhaEmpresas(String senhaEmpresas) {
        this.senhaEmpresas = senhaEmpresas;
    }
}