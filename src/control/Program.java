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
            // apesar das duas listas estarem na mesma opcao, elas são independentes uma da outra! Ou seja, ela não compartilham o mesmo nó ou alunos.
            System.out.println("1 - Adicionar aluno na pilha");
            System.out.println("2 - Mostrar Topo da pilha");
            System.out.println("3 - Remover aluno da pilha");
            System.out.println("4 - adicionar aluno na fila");
            System.out.println("5 - mostrar o primeiro aluno da fila");
            System.out.println("6 - mostrar o ultimo aluno da fila");
            System.out.println("7 - remover aluno da fila");
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
                // caso o programa lance alguma exceção, mostrará o erro. Geralmente será lançada uma exceção caso a lista esteja vázia e possa ocasionar um NullReference.
                System.out.println(e.getMessage());
                
            } finally {
                // independente se lançar ou não uma exceção, será perguntado se o usuário deseja continar usando as listas.
                System.out.print("Deseja continuar?(S ou N): ");
                char op = read.next().toUpperCase().charAt(0);

                continuar = op == 'S' ? true : false;
            }
            
        } while (continuar);

        read.close();
    }
}
