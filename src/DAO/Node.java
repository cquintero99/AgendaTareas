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
public class Node<E> {
    
 private E data;
 private Node<E>next;
 
 public Node(E elemento){
     data=elemento;
     
 }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
 
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
//    private E data;
//    private Node<E>next;
//    
//    public Node(E elemento){
//        data=elemento;
//    }
//    
//
//
//    public E getData() {
//        return data;
//    }
//
//    public void setData(E data) {
//        this.data = data;
//    }
//
//    public Node<E> getNext() {
//        return next;
//    }
//
//    public void setNext(Node<E> next) {
//        this.next = next;
//    }

    public Node() {
    }
 

   

   
  
    
    
    
}
