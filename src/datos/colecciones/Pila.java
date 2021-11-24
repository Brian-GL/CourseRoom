/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos.colecciones;

/**
 *
 * @author LENOVO
 */
public class Pila<T> extends Coleccion<T>{

    public Pila() {
        super();
    }

    public Pila(Lista<T> doublyLinkedList) {
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
