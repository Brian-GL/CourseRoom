/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos.estructuras;

import java.util.Objects;

public class Tripleta<A,B,C> implements Comparable<Tripleta<A,B,C>>{
    
    private A _first_element;
    private B _second_element;
    private C _third_element;
    private Comparing<A> _first_comparing;
    private Comparing<B> _second_comparing;
    private Comparing<C> _third_comparing;
    
    public Tripleta(A first, B second, C third){
        this._first_element = first;
        this._second_element = second;
        this._third_element = third;
        _first_comparing = new Comparing<>();
        _second_comparing = new Comparing<>();
        _third_comparing = new Comparing<>();
    }
    
    public Tripleta(Tripleta<A,B,C> triplet){
        
        if(triplet != null){
            this._first_element = triplet.first();
            this._second_element = triplet.second();
            this._third_element = triplet.third();
        }
        
        _first_comparing = new Comparing<>();
        _second_comparing = new Comparing<>();
        _third_comparing = new Comparing<>();
        
    }

    /**
     * @return the first
     */
    public A first() throws NullPointerException{
        return _first_element;
    }

    /**
     * @param first the first to set
     */
    public void first(A first) {
        this._first_element = first;
    }

    /**
     * @return the second
     */
    public B second() throws NullPointerException{
        return _second_element;
    }

    /**
     * @param second the second to set
     */
    public void second(B second) {
        this._second_element = second;
    }
    
    /**
     * @return the third
     */
    public C third() throws NullPointerException{
        return  _third_element;
    }

    /**
     * @param third the third to set
     */
    public void third(C third) {
        this._third_element = third;
    }

    @Override
    public String toString() throws NullPointerException{
        return this._first_element + "\n" + this._second_element;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this._first_element);
        hash = 41 * hash + Objects.hashCode(this._second_element);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) 
            return false;
        
        if (this == obj) 
            return true;

        if (!(obj instanceof Tripleta<?,?,?>)) 
            return false; 
        
        Tripleta<A, B,C> other = (Tripleta<A, B,C>) obj;
        
        return this._first_element.equals(other.first()) && this._second_element.equals(other.second());
            
    }
    
    public boolean equals(A first_element,B second_element) {
        return this._first_element.equals(first_element) && this._second_element.equals(second_element);
            
    }

    public int compare_first(Tripleta<A,B,C> triplet){
        return (triplet != null) ?  _first_comparing.compare(this._first_element, triplet.first()) : 1;
    }
    
    public int conpare_second(Tripleta<A,B,C> triplet){
        return (triplet != null) ?  _second_comparing.compare(this._second_element, triplet.second()) : 1;
    }
    
    public int conpare_third(Tripleta<A,B,C> triplet){
        return (triplet != null) ?  _third_comparing.compare(this._third_element, triplet.third()) : 1;
    }
    
    public int compare_first(A value){
        return _first_comparing.compare(this._first_element, value);
    }
    
    public int compare_second(B value){
        return  _second_comparing.compare(this._second_element, value);
    }
    
    public int compare_third(C value){
        return  _third_comparing.compare(this._third_element, value);
    }

    @Override
    public int compareTo(Tripleta<A, B,C> o) {
        return  compare_first(o.first()) + compare_second(o.second()) + compare_third(o.third());
    }
    
    public void dispose(){
        this._first_comparing = null;
        this._second_comparing = null;
        this._third_comparing = null;
        this._first_element = null;
        this._second_element = null;
        this._third_element = null;
    
    }

}
