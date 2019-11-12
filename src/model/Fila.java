package model;

public class Fila {
    private Aluno Head;

    protected Fila() {
        Head = null;
    }

    public static Fila criar() {
        return new Fila();
    }

    public void Add(Fila fila, Aluno newNode) {

        Aluno aux = Head;
        if (Head == null) {
            Head = newNode;
            return;

        } else {

            if (aux.getNext() == null) {
                aux.setNext(newNode);
                return;

            } else {
                aux = aux.getNext();

                while (aux.getNext() != null) {
                    aux = aux.getNext();
                }

                aux.setNext(newNode);
            }
        }
    }

    public Aluno pop(Fila fila) throws VazioException {
        Aluno aux = Head;

        if (Head == null) {
            throw new VazioException("A fila está vázia!");

        } else {

            if (aux.getNext() == null) {
                Head = null;
                return aux;

            } else {

                Head = Head.getNext();
                return aux;

            }
        }
    }

    public Aluno top(Fila fila) throws VazioException {

        Aluno aux = Head;
        if (Head == null) {
            throw new VazioException("A fila está vázia!");

        } else {
            return aux;
        }
    }
}
