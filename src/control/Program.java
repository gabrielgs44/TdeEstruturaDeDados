package control;

import java.io.IOException;
import java.util.Scanner;

import model.Aluno;
import model.Fila;
import model.Pilha;
import model.VazioException;

public class Program {

    public static void main(String[] args) throws VazioException, InterruptedException, IOException {
        Scanner read = new Scanner(System.in);

        Pilha pilha = Pilha.criar();
        Fila fila = Fila.criar();
        boolean continuar = true;
        Aluno aluno = null;

        do {
            // apesar das duas listas estarem na mesma opcao, elas s�o independentes uma da
            // outra! Ou seja, ela n�o compartilham o mesmo n� ou alunos.
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
            System.out.println();

            try {

                switch (opcao) {

                case 1:
                    aluno = OpcaoExtensao.instanciarAluno(read);
                    pilha.push(pilha, aluno);
                    break;
                case 2:
                    aluno = pilha.top(pilha);
                    OpcaoExtensao.mostrarAluno(aluno);
                    break;
                case 3:
                    aluno = pilha.pop(pilha);
                    OpcaoExtensao.mostrarAluno(aluno);
                    break;
                case 4:
                    aluno = OpcaoExtensao.instanciarAluno(read);
                    fila.inserir(fila, aluno);
                    break;
                case 5:
                    aluno = fila.listarPrimeiro(fila);
                    OpcaoExtensao.mostrarAluno(aluno);
                    break;
                case 6:
                    aluno = fila.listarUltimo(fila);
                    OpcaoExtensao.mostrarAluno(aluno);
                    break;
                case 7:
                    aluno = fila.remover(fila);
                    OpcaoExtensao.mostrarAluno(aluno);
                    break;
                default:
                    System.out.println("Op��o inv�lida!");
                }
                
            } catch (Exception e) {

                // caso o programa lance alguma exce��o, mostrar� o erro. Geralmente ser�
                // lan�ada uma exce��o caso a lista esteja v�zia e possa ocasionar um
                // NullReference.
                System.out.println(e.getMessage());

            } finally {

                aluno = null;
                // independente se lan�ar ou n�o uma exce��o, ser� perguntado se o usu�rio
                // deseja continar usando as listas.
                System.out.print("Deseja continuar?(S ou N): ");
                char op = read.next().toUpperCase().charAt(0);

                continuar = op == 'S' ? true : false;
                System.out.println();
                System.out.println();
                System.out.println();
            }

        } while (continuar);

        read.close();
    }
}
