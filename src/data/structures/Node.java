/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.structures;

import java.util.Objects;

/**
 *
 * @author LENOVO
 */
public class Node<T> implements Comparable<Node<T>>{

    protected Node<T> _previous;
    protected T _element;
    protected Node<T> _next;
    protected Comparing<T> _comparing;

    public Node(Node<T> _previous, T _value, Node<T> _next) {
        this._previous = _previous;
        this._element = _value;
        this._next = _next;
        this._comparing = new Comparing<>();
    }

    public Node(T _value) {
        this._element = _value;
        this._comparing = new Comparing<>();
    }
    
    /**
     * @return the _previous
     */
    public Node<T> previous() {
        return _previous;
    }

    /**
     * @param _previous the _previous to set
     */
    public void previous(Node<T> _previous) {
        this._previous = _previous;
    }

    /**
     * @return the _value
     */
    public T element() {
        return _element;
    }

    
    /**
     * @param _element the _value to set
     */
    public void element(T _element) {
        this._element = _element;
    }

    /**
     * @return the _next
     */
    public Node<T> next() {
        return _next;
    }

    /**
     * @param _next the _next to set
     */
    public void next(Node<T> _next) {
        this._next = _next;
    }

    public boolean has_next() {
        return this.next() != null;
    }
    
    public boolean has_previous() {
        return this.previous() != null;
    }

    public T next_element() {
       return (has_next()) ? this.next().element() : null;
    }
    
    public T previous_element(){
        return (has_previous()) ? this.previous().element() : null;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        super.clone();
        return new Node<>(this.previous(),this.element(),this.next());
    }

    
    @Override
    public String toString() throws NullPointerException{
       String toString = new String();
       
        if(has_previous()){
            toString = toString + this.previous() + "\n";
        }
        
        toString = toString + this._element + "\n";
        
        if(has_next()){
            toString = toString + this.next() + "\n";
        }
      
        return toString;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        if(has_previous()){
            hash = 97 * hash + Objects.hashCode(this.previous());
        }
        if(has_next()){
            hash = 97 * hash + Objects.hashCode(this.previous());
        }
        hash = 97 * hash + Objects.hashCode(this.element());
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) 
            return false;
        
        if (this == obj) 
            return true;

        if (!(obj instanceof Node<?>)) 
            return false; 
        
         Node<T> other = (Node<T>) obj;
         
         if(has_next() && has_previous()
                 && other.has_next() && other.has_previous()){
             
             return this.next().equals(other.next())
                     && this.previous().equals(other.previous())
                     && this.element().equals(other.element());
             
         }
         else if(!has_next() && has_previous()
                 && !other.has_next() && other.has_previous()){
             return this.previous().equals(other.previous())
                     && this.element().equals(other.element());
         }
         else if(has_next() && !has_previous()
                 && other.has_next() && !other.has_previous()){
             return this.next().equals(other.next())
                     && this.element().equals(other.element());
         }
         else if(!has_next() && !has_previous()
                 && !other.has_next() && !other.has_previous()){
             return this.element().equals(other.element());
         }
      
         return false;
         
    }

    @Override
    public int compareTo(Node<T> o) {
        return (o != null) ? this._comparing.compare(_element, o.element()) : 1;
    }
    
    
    public void dispose(){
        this.next(null);
        this.previous(null);
        this.element(null);
        this._comparing = null;
    }
}
