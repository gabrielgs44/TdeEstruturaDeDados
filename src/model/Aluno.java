package model;

public class Aluno {
    
    private int matricula;
    private String nome;
    private double cr;
    private Aluno next;
    
    public Aluno(int matricula, String nome, double cr) {
        this.matricula = matricula;
        this.nome = nome;
        this.cr = cr;
        next = null;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getCr() {
        return cr;
    }

    public void setCr(double cr) {
        this.cr = cr;
    }

    public Aluno getNext() {
        return next;
    }

    public void setNext(Aluno next) {
        this.next = next;
    }
    
    
}
