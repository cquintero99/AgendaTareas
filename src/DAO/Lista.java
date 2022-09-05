/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author 57310
 */
public class Lista<E> {

    private Node<E> head;

    private int size = 0;

     public E getNode(int pos) {
        Node<E> p = head;
        for (int i = 0; i < size; i++) {
            if (i == pos) {
                return p.getData();
            } else {
                p = p.getNext();
            }

        }
        return p.getData();
    }

    public void add(E elemento) {
        if (head == null) {
            head = new Node<E>(elemento);
            size++;
        } else {
            Node<E> p = head;
            while (p.getNext() != null) {
                p = p.getNext();
            }
            p.setNext(new Node<E>(elemento));
            size++;

        }
    }

    public E buscar(E ele) {
        Node<E> p = head;
        for (int i = 0; i < size; i++) {
            if (p.getData().equals(ele)) {
                return p.getData();
            } else {
                p = p.getNext();
            }
        }
        return p.getData();

    }

    public boolean exite(E ele) {
        Node<E> p = head;
        for (int i = 0; i < size; i++) {
            if (p.getData().equals(ele)) {
                return true;
            } else {
                p = p.getNext();
            }
        }
        return false;

    }

    public void imprimir() {
        Node<E> p = head;
        for (int i = 0; i < size; i++) {
            System.out.print(p.getData() + " ,");
            p = p.getNext();
        }
        System.out.println("");
    }

    public String prin() {
        StringBuffer sb = new StringBuffer("[");
        Node<E> p = head;

        for (int i = 0; i < size; i++) {
            sb.append(p.getData());
            p = p.getNext();
            if (p != null) {
                sb.append(" , ");
            } else {
                sb.append("]");
            }
        }
        System.out.println(sb.toString());
        return sb.toString();

    }

    public E remove(E elemento) {
        Node<E> eliminado = null;
        if (head.getNext() == null) {
            if (head.getData().equals(elemento)) {
                Node<E> p = head;
                head = null;
                size = 0;
                eliminado = p;
            }
        } else if (head.getNext() != null) {
            if (head.getData().equals(elemento)) {
                Node<E> p = head;
                head = p.getNext();
                size--;
                eliminado = p;
            } else {
                Node<E> p = head;
                while (!p.getNext().getData().equals(elemento)) {
                    p = p.getNext();
                }
                Node<E> s = p.getNext();
                p.setNext(s.getNext());
                size--;
                eliminado = s;
            }
        }
        return eliminado.getData();
    }

    public void add(E elemento, int pos) {
        Node<E> nuevo = new Node<E>(elemento);
        if (pos >= 0 && pos < size) {
            Node<E> p = head;
            if (pos == 0) {
                nuevo.setNext(p);
                head = nuevo;
                size++;
                return;
            } else {
                for (int i = 0; i < (pos - 1); i++) {
                    p = p.getNext();
                }
                Node<E> s = p.getNext();
                p.setNext(nuevo);
                nuevo.setNext(s);
                size++;
            }

        } else {
            if (pos >= size) {
                System.out.println("La lista solo tiene: " + size + " Elementos");
            }
        }

    }

    public void remove(int pos) {
        if (pos >= 0 && pos < size) {
            if (head.getNext() != null) {
                Node<E> p = head;
                if (pos == 0) {
                    head = p.getNext();
                    size--;
                } else {
                    for (int i = 0; i < (pos - 1); i++) {
                        p = p.getNext();

                    }
                    Node<E> s = p.getNext();
                    p.setNext(s.getNext());
                    size--;
                    return;
                }

            } else {

                head = null;
                size--;
            }
        } else {
            if (pos < 0) {
                System.out.println("La posion no puede ser menor a 0");
            } else {
                System.out.println("La posicion que que digito no existe");
            }
        }
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

   


}
