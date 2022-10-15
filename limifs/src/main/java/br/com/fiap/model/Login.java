package br.com.fiap.model;

public class Login {

    private String userCandidato;
    private String passwordCandidato;

    public Login (String userCandidato, String passwordCandidato) {

        this.userCandidato = userCandidato;
        this.passwordCandidato  = passwordCandidato;
    }

    public String getUserCandidato() {
        return userCandidato;
    }
    public void setUserCandidato(String userCandidato) {
        this.userCandidato = userCandidato;
    }

    public String getPasswordCandidato() {
        return passwordCandidato;
    }
    public void setPasswordCandidato(String passwordCandidato) {
        this.passwordCandidato = passwordCandidato;
    }

    public String getUserLogin() {
        return null;
    }

    public String getPasswordLogin() {
        return null;
    }
}
