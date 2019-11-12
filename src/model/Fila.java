package model;

public class Fila {
    private Aluno ptInicio;
    private Aluno ptFim;

    // construtor protegico que seta ptInicio e ptFim como nulo ao criar a fila.
    protected Fila() {
        ptInicio = null;
        ptFim = null;
    }
    
    // m�todo est�tico para criar a fila.
    public static Fila criar() {
        return new Fila();
    }

    // m�todo para inserir um novo n� a fila
    public void inserir(Fila fila, Aluno newNode) {

        // verifica se a lista est� v�zia, caso esteja adicionar� um novo n�. Ap�s adicionado ptInicio e ptFim apontar� para o mesmo n�.
        if (ptInicio == null) {

            ptInicio = newNode;
            ptFim = newNode;
            return;
        } else {

            // verifica se a lista tem penas um elemento, caso tenha ptInicio.Next apontar� para o novo n� e o ptFim apontar� apra o novo n�.
            if (ptInicio.getNext() == null) {
                ptInicio.setNext(newNode);
                ptFim = newNode;
                return;
                
            } else {
                // caso n�o esteja v�zia e nem tenha apenas um elemento. PtFim next apontar� para o novo n� e depois o ptFim receber� o novo n�.
                ptFim.setNext(newNode);
                ptFim = newNode;
            }
        }
    }

    // m�todo para remover um n� da lista
    public Aluno remover(Fila fila) throws VazioException {
        Aluno aux = ptInicio;

        // verifica se a lista est� v�zia, caso esteja lan�ar� uma exce��o
        if (ptInicio == null) {
            throw new VazioException("A fila est� v�zia!");

        } else {

            // verifica se a lista tem apenas um elemento, caso tenha ptInicio e ptFim receber� nulo e retornara o n� removido.
            if (aux == ptFim) {
                ptInicio = null;
                ptFim = null;
                return aux;

            } else {

                // verifica se a lista tem mais de 2 elementos, caso tenha ptInicio receber� ptInicio next e reonar� o elemento removido.
                if (aux.getNext() != ptFim) {
                    ptInicio = ptInicio.getNext();
                    return aux;
                } else {
                    // caso a lista tenha apenas 2 elementos, ptInicio apontar� para ptFim e ptInicio.next receber� nulo.
                    ptInicio = ptFim;
                    ptInicio.setNext(null);
                    return aux;
                }
            }
        }
    }

    // m�todo para listar o primeiro elemento da fila
    public Aluno listarPrimeiro(Fila fila) throws VazioException {

        Aluno aux = ptInicio;
        // verifica se a lista est� v�zia, caso esteja lan�ar� uma exce��o
        if (ptInicio == null) {
            throw new VazioException("A fila est� v�zia!");

        } else {
            // caso n�o esteja v�zia retornar� o primeiro elemento.
            return aux;
        }
    }

    // m�todo para listar o ultimo elemento da fila
    public Aluno listarUltimo(Fila fila) throws VazioException {

        Aluno aux = ptFim;
        // verifica se a lista est� v�zia, caso esteja lan�ar� uma exce��o
        if (aux == null) {
            throw new VazioException("A fila est� v�zia!");
        } else {
            // caso n�o esteja v�zia, retonar� o ultimo elemento da fila.
            return aux;
        }
    }
}
