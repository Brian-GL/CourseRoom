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
public class DoublyLinkedQueue<T> extends Collection<T> {

    public DoublyLinkedQueue() {
        super();
    }

    public DoublyLinkedQueue(DoublyLinkedList<T> doublyLinkedList) {
        super(doublyLinkedList);
    }
    
    public void enqueue(T element){ 
        this._collection.push_back(element);
    }

    public boolean line_up(T element){ 
        return this._collection.add_back(element);
    }

    public T dequeue() throws NullPointerException{
        return this._collection.unenlist_front();
    }
    
    
}
