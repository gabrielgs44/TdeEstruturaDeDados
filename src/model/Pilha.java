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
            
            // pecorre a lista encadeada at� encontrar um n� com um next como nulo, para adicionar um novo n�.
            while (aux.getNext() != null) {

                aux = aux.getNext();
            }
            
            // adiciona o n� na ultima posi��o.
            aux.setNext(newNode);
            return;
        }
    }
    
    //m�todo retorna o topo da pilha.
    public Aluno top(Pilha pilha) throws VazioException {

        Aluno aux = Head;

        if (aux == null) {
            // esse if verifica se a pilha est� vazia, caso esteja lan�ar� uma exce��o.
            throw new VazioException("A pilha est� v�zia!");

        } else {
            
            // verifica se o Next do primeiro n� n� est� v�zio, caso esteja retonar� o Head.
            if (aux.getNext() == null) {

                return aux;
            } else {
                aux = aux.getNext();
                // ir� percorre a lista encadeada at� encontrar um n� em que o Next seja nulo, e ent�o retorn� o n�.
                while (aux.getNext() != null) {
                    aux = aux.getNext();

                }
                // retorna o ultimo n� da lista.
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
