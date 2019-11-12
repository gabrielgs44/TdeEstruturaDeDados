package model;

public class Fila {
    private Aluno ptInicio;
    private Aluno ptFim;

    protected Fila() {
        ptInicio = null;
        ptFim = null;
    }

    public static Fila criar() {
        return new Fila();
    }

    public void inserir(Fila fila, Aluno newNode) {

        if (ptInicio == ptFim && ptInicio == null) {
            ptInicio = newNode;
            ptInicio.setNext(newNode);
            ptFim = newNode;

        } else {
            Aluno aux = ptInicio;
            if (aux.getNext() == ptFim) {
                aux.setNext(newNode);
                ptFim = newNode;
                return;

            } else {
                aux = aux.getNext();

                while (aux.getNext() != ptFim) {
                    aux = aux.getNext();
                }

                aux.setNext(newNode);
                ptFim = newNode;
            }
        }
    }

    public Aluno remover(Fila fila) throws VazioException {
        Aluno aux = ptInicio;

        if (ptInicio == null) {
            throw new VazioException("A fila está vázia!");

        } else {

            if (aux == ptFim) {
                ptInicio = null;
                ptFim = null;
                return aux;

            } else {
                
                if(aux.getNext() != ptFim) {
                ptInicio = ptInicio.getNext();
                return aux;
                }else{
                    ptInicio = ptFim;
                    ptInicio.setNext(ptFim);
                    return aux;
                }
            }
        }
    }

    public Aluno listarPrimeiro(Fila fila) throws VazioException {

        Aluno aux = ptInicio;
        if (ptInicio == null) {
            throw new VazioException("A fila está vázia!");

        } else {
            return aux;
        }
    }

    public Aluno listarUltimo(Fila fila) throws VazioException {

        Aluno aux = ptFim;
        if (aux == null) {
            throw new VazioException("A fila está vázia!");
        } else {
            return aux;
        }
    }
}
