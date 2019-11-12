package model;

public class Pilha {
    private Aluno Head;

    // m�todo construtor protegio e garantindo que ao criar pilha, o Head ser� nulo.
    protected Pilha() {
        Head = null;
    }

    // Cria a pilha
    public static Pilha criar() {
        return new Pilha();
    }

    // m�todo para adicionar um novo n� a Pilha encadeada.
    public void push(Pilha pilha, Aluno newNode) {

        Aluno aux = Head;

        // Se pilha for v�zia, simplesmente adiciona um novo n�;
        if (aux == null) {
            Head = newNode;
            return;

        } else {
            aux = Head.getNext();

            while (aux.getNext() != null) {

                aux = aux.getNext();
            }

            aux.setNext(newNode);
            return;
        }
    }

    public Aluno top(Pilha pilha) throws VazioException {

        Aluno aux = Head;

        if (aux == null) {
            throw new VazioException("A pilha est� v�zia!");

        } else {

            if (aux.getNext() == null) {

                return aux;
            } else {
                aux = aux.getNext();

                while (aux.getNext() != null) {
                    aux = aux.getNext();

                }

                return aux;
            }
        }
    }

    public Aluno pop(Pilha pilha) throws VazioException {

        Aluno aux = Head;

        if (aux == null) {
            throw new VazioException("A pilha est� v�zia!");

        } else {
            if (aux.getNext() == null) {

                Head = null;
                return aux;
            } else {

                aux = aux.getNext();

                while (aux.getNext().getNext() != null) {

                    aux = aux.getNext();
                }

                Aluno node = aux.getNext();
                aux.setNext(null);
                return node;
            }
        }
    }
}
