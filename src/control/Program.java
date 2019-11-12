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
            // apesar das duas listas estarem na mesma opcao, elas s�o independentes uma da outra! Ou seja, ela n�o compartilham o mesmo n� ou alunos.
            System.out.println("1 - Adicionar aluno na pilha");
            System.out.println("2 - Mostrar Topo da pilha");
            System.out.println("3 - Remover aluno da pilha");
            System.out.println("4 - adicionar aluno na fila");
            System.out.println("5 - mostrar o primeiro aluno da fila");
            System.out.println("6 - mostrar o ultimo aluno da fila");
            System.out.println("7 - remover aluno da fila");
            System.out.print("Digite a opc�o que deseja: ");
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
                // caso o programa lance alguma exce��o, mostrar� o erro. Geralmente ser� lan�ada uma exce��o caso a lista esteja v�zia e possa ocasionar um NullReference.
                System.out.println(e.getMessage());
                
            } finally {
                // independente se lan�ar ou n�o uma exce��o, ser� perguntado se o usu�rio deseja continar usando as listas.
                System.out.print("Deseja continuar?(S ou N): ");
                char op = read.next().toUpperCase().charAt(0);

                continuar = op == 'S' ? true : false;
            }
            
        } while (continuar);

        read.close();
    }
}
