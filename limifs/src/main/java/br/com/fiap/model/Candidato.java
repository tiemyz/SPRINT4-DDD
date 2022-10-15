package br.com.fiap.model;

public class Candidato {

    private String nomeCandidato;
    private String telCandidato;
    private String dataCandidato;  
    private String cpfCandidato;
    private String generoCandidato;
    private String senhaCandidato;
    private String emailCandidato;

    public Candidato (String nomeCandidato, String telCandidato, String dataCandidato, String cpfCandidato, String generoCandidato, String senhaCandidato, String emailCandidato) {

        this.nomeCandidato = nomeCandidato;
        this.telCandidato = telCandidato;
        this.dataCandidato = dataCandidato;
        this.cpfCandidato = cpfCandidato;
        this.generoCandidato = generoCandidato;
        this.senhaCandidato = senhaCandidato;
        this.emailCandidato = emailCandidato;

    }
    
    public String getNomeCandidato() {
        return nomeCandidato;
    }
    public void setNomeCandidato(String nomeCandidato) {
        this.nomeCandidato = nomeCandidato;
    }

    public String getTelCandidato() {
        return telCandidato;
    }
    public void setTelCandidato(String telCandidato) {
        this.telCandidato = telCandidato;
    }

    public String getDataCandidato() {
        return dataCandidato;
    }
    public void setDataCandidato(String dataCandidato) {
        this.dataCandidato = dataCandidato;
    }
    
    public String getCpfCandidato() {
        return cpfCandidato;
    }
    public void setCpfCandidato(String cpfCandidato) {
        this.cpfCandidato = cpfCandidato;
    }

    public String getGeneroCandidato() {
        return generoCandidato;
    }
    public void setGeneroCandidato(String generoCandidato) {
        this.generoCandidato = generoCandidato;
    }

    public String getSenhaCandidato() {
        return senhaCandidato;
    }
    public void setSenhaCandidato(String senhaCandidato) {
        this.senhaCandidato = senhaCandidato;
    }

    public String getEmailCandidato() {
        return emailCandidato;
    }
    public void setEmailCandidato(String emailCandidato) {
        this.emailCandidato = emailCandidato;
    }
}