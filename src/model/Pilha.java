package model;

public class Pilha {
    private Aluno head;
    private Aluno topo;

    // método construtor protegio e garantindo que ao criar pilha, o Head será nulo.
    protected Pilha() {
        head = null;
    }

    // Cria a pilha
    public static Pilha criar() {
        return new Pilha();
    }

    // método para adicionar um novo nó a Pilha encadeada.
    public void push(Pilha pilha, Aluno newNode) {

        Aluno aux = head;

        // Se pilha for vázia, simplesmente adiciona um novo nó;
        if (aux == null) {
            head = newNode;
            topo = newNode;
            return;

        } else {
           if(aux == topo) {
               aux.setNext(newNode);
               topo = newNode;
               return;
           }else {
               topo.setNext(newNode);
               topo = newNode;
           }
        }
    }
    
    //método retorna o topo da pilha.
    public Aluno top(Pilha pilha) throws VazioException {

        Aluno aux = head;

        if (aux == null) {
            // esse if verifica se a pilha está vazia, caso esteja lançará uma exceção.
            throw new VazioException("A pilha está vázia!");

        } else {
            return topo;
        }
    }

    public Aluno pop(Pilha pilha) throws VazioException {

        Aluno aux = head;
        
        // verifica se a lista está vázia, caso esteja lançará uma exceção.
        if (aux == null) {
            throw new VazioException("A pilha está vázia!");

        } else {
            // verifica se a lista tem apenas um nó, caso tenha irá remove-lo e retorna oq foi removido.
            if (aux == topo) {
                System.out.println("chegou aqui");
                head = null;
                topo = null;
                return aux;
            } else {
                
                // pecorre a lista até achar um nó que o next seja igual ao topo.
                while (aux.getNext() != topo) {

                    aux = aux.getNext();
                }
                // Ao encontra-lo, irá salvar o elemento que será removido.
                Aluno node = aux.getNext();
                // Irá remover o ultimo elemento da lista.
                aux.setNext(null);
                // o topo receberá o auxiliar, que aponta pro penultimo elemento da lista.
                topo = aux;
                // retonará o elemento removido da lista.
                return node;
            }
        }
    }
}
