package control;

import java.util.Scanner;

import model.Aluno;
import model.Pilha;
import model.VazioException;

public class OpcaoExtensao {
    
    public static void inserirNaPilha(Scanner read, Pilha pilha) throws VazioException{
        
        Aluno aluno = OpcaoExtensao.instanciarAluno(read);
        pilha.push(pilha, aluno);
        
    }
    
    public static void mostrarTopoPilha(Scanner read, Pilha pilha) throws VazioException{
        
        Aluno aluno = pilha.top(pilha);
        OpcaoExtensao.mostrarAluno(aluno);
    }
    
    public static void removerPilha(Scanner read, Pilha pilha) throws VazioException{
        
        Aluno aluno = pilha.pop(pilha);
        OpcaoExtensao.mostrarAluno(aluno);
    }
    
    // método criado para mostrar o aluno na tela, foi criado para evitar repetição de código.
    public static void mostrarAluno(Aluno aluno) {
        System.out.println("matricula: " + aluno.getMatricula());
        System.out.println("matricula: " + aluno.getNome());
        System.out.println("matricula: " + aluno.getCr());
        System.out.println();
        System.out.println();
    }
    
    // método criado para instanciar um novo aluno, para evitar repetição de código.
    public static Aluno instanciarAluno(Scanner read) {
        
        System.out.print("Digite a matrícula: ");
        int matricula = read.nextInt();
        System.out.print("Digite o nome: ");
        String nome = read.next();
        System.out.print("Digite o cr: ");
        double cr = read.nextDouble();
        
        return new Aluno(matricula, nome, cr);
    }
}
