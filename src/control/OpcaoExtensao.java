package control;

import java.util.Scanner;

import model.Aluno;
import model.Pilha;
import model.VazioException;

public class OpcaoExtensao {
    
    public static void inserirNaPilha(Scanner read, Pilha pilha) throws VazioException{
        
        System.out.print("Digite a matrícula: ");
        int matricula = read.nextInt();
        System.out.print("Digite o nome: ");
        String nome = read.next();
        System.out.print("Digite o cr: ");
        double cr = read.nextDouble();
        
        Aluno aluno = new Aluno(matricula, nome, cr);
        
        pilha.push(pilha, aluno);
        
    }
    
    public static void mostrarTopoPilha(Scanner read, Pilha pilha) throws VazioException{
        
        Aluno aluno = pilha.top(pilha);
        
        System.out.println("matricula: " + aluno.getMatricula());
        System.out.println("matricula: " + aluno.getNome());
        System.out.println("matricula: " + aluno.getCr());
        System.out.println();
        System.out.println();
    }
    
    public static void removerPilha(Scanner read, Pilha pilha) throws VazioException{
        
        Aluno aluno = pilha.pop(pilha);
        System.out.println("matricula: " + aluno.getMatricula());
        System.out.println("matricula: " + aluno.getNome());
        System.out.println("matricula: " + aluno.getCr());
        System.out.println();
        System.out.println();
    }
}
