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
public class PairNode<A,B> implements Comparable<PairNode<A,B>>{
    
    private PairNode<A,B> _previous;
    private Pair<A,B> _element;
    private PairNode<A,B> _next;

    public PairNode(PairNode<A,B> previous, A first_element, B second_element, PairNode<A,B> next) {
        this._previous = previous;
        this._element = new Pair<>(first_element,second_element);
        this._next = next;
    }

    public PairNode(A first_element, B second_element) {
        this._element = new Pair<>(first_element,second_element);
    }
    
    /**
     * @return the _previous
     */
    public PairNode<A,B> previous() {
        return _previous;
    }

    /**
     * @param _previous the _previous to set
     */
    public void previous(PairNode<A,B> _previous) {
        this._previous = _previous;
    }

    /**
     * @return the first
     */
    public A first() throws NullPointerException{
        return _element.first();
    }

    /**
     * @param first the first to set
     */
    public void first(A first) {
        this._element.first(first);
    }

    /**
     * @return the second
     */
    public B second() throws NullPointerException{
        return _element.second();
    }

    /**
     * @param second the second to set
     */
    public void second(B second) {
        this._element.second(second);
    }
    
    /**
     * @return the _value
     */
    public Pair<A,B> element() {
        return _element;
    }

    public void element(A first, B second) {
        this.first(first);
        this.second(second);
    }
    
    public void element(Pair<A,B> element) {
        this.first(element.first());
        this.second(element.second());
    }

    /**
     * @return the _next
     */
    public PairNode<A,B> next() {
        return _next;
    }

    /**
     * @param _next the _next to set
     */
    public void next(PairNode<A,B> _next) {
        this._next = _next;
    }

    public boolean has_next() {
        return this.next() != null;
    }
    
    public boolean has_previous() {
        return this.previous() != null;
    }
    
     public Pair<A,B> next_element() {
       return (has_next()) ? this.next().element() : null;
    }
    
    public Pair<A,B> previous_element(){
        return (has_previous()) ? this.previous().element() : null;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        super.clone();
        return new PairNode<>(this.previous(),this.first(),this.second(),this.next());
    }


    @Override
    public String toString() throws NullPointerException{
       String toString = new String();
       
        if(has_previous()){
            toString = toString + this.previous() + "\n";
        }
        
        toString = toString + this.element()+ "\n";
        
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
        hash = 97 * hash + element().hashCode();
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) 
            return false;
        
        if (this == obj) 
            return true;

        if (!(obj instanceof PairNode<?,?>)) 
            return false; 
        
         PairNode<A,B> other = (PairNode<A,B>) obj;
         
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
    public int compareTo(PairNode<A, B> o) {
        return  this._element.compareTo(o._element);
    }
    
    public void dispose(){
        this.next(null);
        this.previous(null);
        this._element.dispose();
        this._element = null;
    }
}
