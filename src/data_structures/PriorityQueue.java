/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data_structures;

import datos.colecciones.Coleccion;
import datos.colecciones.Lista;
import datos.estructuras.Nodo;
import data_structures.Mode;
import java.util.Comparator;

/**Comparator class useful for element's comparison in Priority Queue*/
class DefaultComparator<T> implements Comparator<T>{
    
    @SuppressWarnings("unchecked")
    @Override
    public int compare(T o1, T o2){
        return ((Comparable<T>) o1).compareTo(o2);
    }
}

public class PriorityQueue<T> extends Coleccion<T>{
	
    /**Private attributes*/

    /**The mode to insert into the Priority Queue*/
    final private Mode _mode; 

    /**Comparator instance useful for elements comparison.*/
    final private Comparator<T> _comparator = new DefaultComparator<>();

    //Public constructors

    public PriorityQueue(Mode mode) { super(); this._mode = mode; }

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public PriorityQueue(Lista<T> list, Mode mode) { 
            super();
            this._mode = mode; 
            Nodo<T> auxiliar = list.front();

            while(auxiliar != null) {
                    enqueue(auxiliar.element());
                    auxiliar = auxiliar.next();
            }
    }

    /*
    public PriorityQueue(Matrix<T>.Row row, Mode mode){
            super();
            this._mode = mode;
            Matrix<T>.Column auxiliar = row.Front();
            while(auxiliar != null) {
                    this.Enqueue(auxiliar.Value());
                    auxiliar = auxiliar.Next();
            }
    }

 
    public PriorityQueue(Graph<T> graph, Mode mode){
            super();
            this._mode = mode;
            Graph<T>.Vertex auxiliar = graph.Front();
            while(auxiliar != null) {
                    this.Enqueue(auxiliar.Value());
                    auxiliar = auxiliar.Next();
            }
    }
    */
   
    @SuppressWarnings("OverridableMethodCallInConstructor")
    public PriorityQueue(Coleccion<T> collection, Mode mode) { 
            super(); 
            this._mode = mode; 
            Nodo<T> auxiliar = collection.list().front();

            while(auxiliar != null) {
                    enqueue(auxiliar.element());
                    auxiliar = auxiliar.next();
            }
    }

    public Mode Mode() {return this._mode;}

    public void enqueue(T element) {

        if(this._coleccion.is_empty())
                this._coleccion.push_front(element);
        else {

                switch(this._mode) {
                        case ASCENDING:
                        {	
                                T middleElement = this._coleccion.medium();

                                Integer comparator = this._comparator.compare(element,middleElement);

                                //Are the same value
                                if(comparator == 0) 
                                        this._coleccion.insert_next(this._coleccion.middle(), element);

                                //It means the element if bigger than the middle value.
                                else if(comparator > 0) {

                                        boolean broke = false;
                                        Nodo<T> auxiliar = this._coleccion.middle();

                                        while(auxiliar.next() != null) {

                                                Integer previousComparator = this._comparator.compare(auxiliar.element(),element);
                                                Integer nextComparator = this._comparator.compare(auxiliar.next().element(),element);

                                                if(previousComparator <= 0 && nextComparator >= 0) {
                                                        broke = true;
                                                        this._coleccion.insert_next(auxiliar, element);
                                                        break;
                                                }

                                                auxiliar = auxiliar.next();
                                        }

                                        if(!broke)
                                                this._coleccion.insert_next(auxiliar,element);

                                }
                                //It means the element is smaller than the middle value.
                                else {
                                        boolean broke = false;
                                        Nodo<T> auxiliar = this._coleccion.middle();

                                        while(auxiliar.previous() != null) {

                                                Integer nextComparator = this._comparator.compare(auxiliar.element(),element);
                                                Integer previousComparator = this._comparator.compare(auxiliar.previous().element(),element);

                                                if(previousComparator <= 0 && nextComparator >= 0) {
                                                        broke = true;
                                                        this._coleccion.insert_previous(auxiliar, element);
                                                        break;
                                                }

                                                auxiliar = auxiliar.previous();
                                        }

                                        if(!broke)
                                                this._coleccion.insert_previous(auxiliar,element);
                                }
                        }
                        break;
                        case DESCENDING:{
                                T middleElement = this._coleccion.medium();

                                Integer comparator = this._comparator.compare(element,middleElement);

                                //Are the same value
                                if(comparator == 0) 
                                        this._coleccion.insert_next(this._coleccion.middle(), element);

                                //It means the element if bigger than the middle value.
                                else if(comparator > 0) {

                                        boolean broke = false;
                                        Nodo<T> auxiliar = this._coleccion.middle();

                                        while(auxiliar.previous() != null){

                                                Integer previousComparator = this._comparator.compare(auxiliar.element(),element);
                                                Integer nextComparator = this._comparator.compare(auxiliar.previous().element(),element);

                                                if(previousComparator <= 0 && nextComparator >= 0) {
                                                        broke = true;
                                                        this._coleccion.insert_previous(auxiliar, element);
                                                        break;
                                                }

                                                auxiliar = auxiliar.previous();
                                        }

                                        if(!broke)
                                                this._coleccion.insert_previous(auxiliar,element);

                                }
                                //It means the element is small than the middle value.
                                else {
                                        boolean broke = false;
                                        Nodo<T> auxiliar = this._coleccion.middle();

                                        while(auxiliar.next() != null) {

                                                Integer  previousComparator = this._comparator.compare(auxiliar.element(),element);
                                                Integer nextComparator = this._comparator.compare(auxiliar.next().element(),element);

                                                if(previousComparator >= 0 && nextComparator <= 0) {
                                                        broke = true;
                                                        this._coleccion.insert_next(auxiliar, element);
                                                        break;
                                                }

                                                auxiliar = auxiliar.next();
                                        }

                                        if(!broke)
                                                this._coleccion.insert_next(auxiliar,element);
                                }
                        }
                        break;
                }
        }
    }

    public void queueUp(T element) {
        if(!this._coleccion.contains(element))
            enqueue(element);
    }

    public T dequeue() throws NullPointerException{
           return _coleccion.delist();
    }
	
}
