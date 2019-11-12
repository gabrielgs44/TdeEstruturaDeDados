package control;

import java.util.Scanner;

import model.Aluno;
import model.Pilha;
import model.VazioException;

public class Program {

    public static void main(String[] args) throws VazioException {
        Scanner read = new Scanner(System.in);

        Pilha pilha = Pilha.criar();
        boolean continuar = true;

        do {
            System.out.println("1 - Adicionar aluno na pilha");
            System.out.println("2 - Mostrar Topo da pilha");
            System.out.println("3 - Remover aluno da pilha");
            System.out.print("Digite a opcão que deseja: ");
            int opcao = read.nextInt();
            System.out.println();
            System.out.println();
            
            try {
                
                switch (opcao) {

                case 1:
                    OpcaoExtensao.inserirNaPilha(read, pilha);
                    break;
                case 2:
                    OpcaoExtensao.mostrarTopoPilha(read, pilha);
                    break;
                case 3:
                    OpcaoExtensao.removerPilha(read, pilha);
                    break;
                }
                
            } catch (Exception e) {
                
                System.out.println(e.getMessage());
                
            } finally {
                
                System.out.print("Deseja continuar?(S ou N): ");
                char op = read.next().toUpperCase().charAt(0);

                continuar = op == 'S' ? true : false;
            }
            
        } while (continuar);

        read.close();
    }
}
