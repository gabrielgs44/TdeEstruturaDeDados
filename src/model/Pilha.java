package model;

public class Pilha {
    private Aluno Head;

    // método construtor protegio e garantindo que ao criar pilha, o Head será nulo.
    protected Pilha() {
        Head = null;
    }

    // Cria a pilha
    public static Pilha criar() {
        return new Pilha();
    }

    // método para adicionar um novo nó a Pilha encadeada.
    public void push(Pilha pilha, Aluno newNode) {

        Aluno aux = Head;

        // Se pilha for vázia, simplesmente adiciona um novo nó;
        if (aux == null) {
            Head = newNode;
            return;

        } else {
            aux = Head.getNext();
            
            // pecorre a lista encadeada até encontrar um nó com um next como nulo, para adicionar um novo nó.
            while (aux.getNext() != null) {

                aux = aux.getNext();
            }
            
            // adiciona o nó na ultima posição.
            aux.setNext(newNode);
            return;
        }
    }
    
    //método retorna o topo da pilha.
    public Aluno top(Pilha pilha) throws VazioException {

        Aluno aux = Head;

        if (aux == null) {
            // esse if verifica se a pilha está vazia, caso esteja lançará uma exceção.
            throw new VazioException("A pilha está vázia!");

        } else {
            
            // verifica se o Next do primeiro nó nó está vázio, caso esteja retonará o Head.
            if (aux.getNext() == null) {

                return aux;
            } else {
                aux = aux.getNext();
                // irá percorre a lista encadeada até encontrar um nó em que o Next seja nulo, e então retorná o nó.
                while (aux.getNext() != null) {
                    aux = aux.getNext();

                }
                // retorna o ultimo nó da lista.
                return aux;
            }
        }
    }

    public Aluno pop(Pilha pilha) throws VazioException {

        Aluno aux = Head;

        if (aux == null) {
            throw new VazioException("A pilha está vázia!");

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
