package control;

import java.io.IOException;
import java.util.Scanner;

import model.Aluno;

public class OpcaoExtensao {  
    
    // m�todo criado para mostrar o aluno na tela. Foi criado para evitar repeti��o de c�digo.
    public static void mostrarAluno(Aluno aluno) {
        System.out.println("matricula: " + aluno.getMatricula());
        System.out.println("matricula: " + aluno.getNome());
        System.out.println("matricula: " + aluno.getCr());
        System.out.println();
        System.out.println();
    }
    
    // m�todo criado para instanciar um novo aluno. Foi criado para evitar repeti��o de c�digo.
    public static Aluno instanciarAluno(Scanner read) {
        
        System.out.print("Digite a matr�cula: ");
        int matricula = read.nextInt();
        System.out.print("Digite o nome: ");
        String nome = read.next();
        System.out.print("Digite o cr: ");
        double cr = read.nextDouble();
        
        return new Aluno(matricula, nome, cr);
    }
}
