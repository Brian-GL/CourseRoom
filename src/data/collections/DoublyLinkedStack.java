/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.collections;

/**
 *
 * @author LENOVO
 */
public class DoublyLinkedStack<T> extends Collection<T>{

    public DoublyLinkedStack() {
        super();
    }

    public DoublyLinkedStack(DoublyLinkedList<T> doublyLinkedList) {
        super(doublyLinkedList);
    }
    
    public void stack(T element){ 
        this._collection.push_front(element);
    }

    public boolean pile_up(T element){
        return this._collection.add_front(element);
    }

    public T unstack() throws NullPointerException{
        return this._collection.unlist();
    }
    
}
