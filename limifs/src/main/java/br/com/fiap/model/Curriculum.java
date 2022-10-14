package br.com.fiap.model;

public class Curriculum {

    private String grauCurriculo;
    private String cursosCurriculo;
    private String certCurriculo;
    private String expCurriculo;

    public Curriculum (String grauCurriculo, String cursosCurriculo, String certCurriculo, String expCurriculo) {

        this.grauCurriculo = grauCurriculo;
        this.cursosCurriculo = cursosCurriculo;
        this.certCurriculo = certCurriculo;
        this.expCurriculo = expCurriculo;
    }
    
    public String getGrauCurriculo() {
        return grauCurriculo;
    }
    public void setGrauCurriculo(String grauCurriculo) {
        this.grauCurriculo = grauCurriculo;
    }

    public String getCursosCurriculo() {
        return cursosCurriculo;
    }
    public void setCursosCurriculo(String cursosCurriculo) {
        this.cursosCurriculo = cursosCurriculo;
    }

    public String getCertCurriculo() {
        return certCurriculo;
    }
    public void setCertCurriculo(String certCurriculo) {
        this.certCurriculo = certCurriculo;
    }

    public String getExpCurriculo() {
        return expCurriculo;
    }
    public void setExpCurriculo(String expCurriculo) {
        this.expCurriculo = expCurriculo;
    }
}