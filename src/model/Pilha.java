package model;

public class Pilha {
    private Aluno head;
    private Aluno topo;

    // m�todo construtor protegio e garantindo que ao criar pilha, o Head ser� nulo.
    protected Pilha() {
        head = null;
    }

    // Cria a pilha
    public static Pilha criar() {
        return new Pilha();
    }

    // m�todo para adicionar um novo n� a Pilha encadeada.
    public void push(Pilha pilha, Aluno newNode) {

        Aluno aux = head;

        // Se pilha for v�zia, simplesmente adiciona um novo n�;
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
    
    //m�todo retorna o topo da pilha.
    public Aluno top(Pilha pilha) throws VazioException {

        Aluno aux = head;

        if (aux == null) {
            // esse if verifica se a pilha est� vazia, caso esteja lan�ar� uma exce��o.
            throw new VazioException("A pilha est� v�zia!");

        } else {
            return topo;
        }
    }

    public Aluno pop(Pilha pilha) throws VazioException {

        Aluno aux = head;
        
        // verifica se a lista est� v�zia, caso esteja lan�ar� uma exce��o.
        if (aux == null) {
            throw new VazioException("A pilha est� v�zia!");

        } else {
            // verifica se a lista tem apenas um n�, caso tenha ir� remove-lo e retorna oq foi removido.
            if (aux == topo) {
                System.out.println("chegou aqui");
                head = null;
                topo = null;
                return aux;
            } else {
                
                // pecorre a lista at� achar um n� que o next seja igual ao topo.
                while (aux.getNext() != topo) {

                    aux = aux.getNext();
                }
                // Ao encontra-lo, ir� salvar o elemento que ser� removido.
                Aluno node = aux.getNext();
                // Ir� remover o ultimo elemento da lista.
                aux.setNext(null);
                // o topo receber� o auxiliar, que aponta pro penultimo elemento da lista.
                topo = aux;
                // retonar� o elemento removido da lista.
                return node;
            }
        }
    }
}
