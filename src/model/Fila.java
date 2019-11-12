package model;

public class Fila {
    private Aluno ptInicio;
    private Aluno ptFim;

    // construtor protegico que seta ptInicio e ptFim como nulo ao criar a fila.
    protected Fila() {
        ptInicio = null;
        ptFim = null;
    }
    
    // método estático para criar a fila.
    public static Fila criar() {
        return new Fila();
    }

    // método para inserir um novo nó a fila
    public void inserir(Fila fila, Aluno newNode) {

        // verifica se a lista está vázia, caso esteja adicionará um novo nó. Após adicionado ptInicio e ptFim apontará para o mesmo nó.
        if (ptInicio == null) {

            ptInicio = newNode;
            ptFim = newNode;
            return;
        } else {

            // verifica se a lista tem penas um elemento, caso tenha ptInicio.Next apontará para o novo nó e o ptFim apontará apra o novo nó.
            if (ptInicio.getNext() == null) {
                ptInicio.setNext(newNode);
                ptFim = newNode;
                return;
                
            } else {
                // caso não esteja vázia e nem tenha apenas um elemento. PtFim next apontará para o novo nó e depois o ptFim receberá o novo nó.
                ptFim.setNext(newNode);
                ptFim = newNode;
            }
        }
    }

    // método para remover um nó da lista
    public Aluno remover(Fila fila) throws VazioException {
        Aluno aux = ptInicio;

        // verifica se a lista está vázia, caso esteja lançará uma exceção
        if (ptInicio == null) {
            throw new VazioException("A fila está vázia!");

        } else {

            // verifica se a lista tem apenas um elemento, caso tenha ptInicio e ptFim receberá nulo e retornara o nó removido.
            if (aux == ptFim) {
                ptInicio = null;
                ptFim = null;
                return aux;

            } else {

                // verifica se a lista tem mais de 2 elementos, caso tenha ptInicio receberá ptInicio next e reonará o elemento removido.
                if (aux.getNext() != ptFim) {
                    ptInicio = ptInicio.getNext();
                    return aux;
                } else {
                    // caso a lista tenha apenas 2 elementos, ptInicio apontará para ptFim e ptInicio.next receberá nulo.
                    ptInicio = ptFim;
                    ptInicio.setNext(null);
                    return aux;
                }
            }
        }
    }

    // método para listar o primeiro elemento da fila
    public Aluno listarPrimeiro(Fila fila) throws VazioException {

        Aluno aux = ptInicio;
        // verifica se a lista está vázia, caso esteja lançará uma exceção
        if (ptInicio == null) {
            throw new VazioException("A fila está vázia!");

        } else {
            // caso não esteja vázia retornará o primeiro elemento.
            return aux;
        }
    }

    // método para listar o ultimo elemento da fila
    public Aluno listarUltimo(Fila fila) throws VazioException {

        Aluno aux = ptFim;
        // verifica se a lista está vázia, caso esteja lançará uma exceção
        if (aux == null) {
            throw new VazioException("A fila está vázia!");
        } else {
            // caso não esteja vázia, retonará o ultimo elemento da fila.
            return aux;
        }
    }
}
