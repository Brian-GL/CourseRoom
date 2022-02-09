/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos.colecciones;

import datos.estructuras.Nodo;
import datos.estructuras.Par;
import java.util.Objects;
import courseroom.CourseRoom;


public class Grafo<T>{
	
    /**Vertex class.*/
    public class Vertex{

        //Private Vertex's attributes.

        /**The 'T' element to save.*/
        private T _element;
        /**Vertex previous pointer.*/
        private Vertex _previous;
        /**Vertex next pointer.*/
        private Vertex _next;
        /**DoublyLinkedList of all edges pointers.*/
        private Lista<Edge> _edge_list;
        /**The total weight of every edge pointers into the vertex.*/
        private double _total_weight;

        //Public constructors

        public Vertex(T element) { 
            this._edge_list = new Lista<>();
            this._total_weight = 0.0;
            this._element = element;
        }

        public Vertex(T element, Vertex previous, Vertex next){
            this._element = element;
            this._previous = previous;
            this._next = next;
            this._edge_list = new Lista<>();
            this._total_weight = 0.0;
        }

        @SuppressWarnings("OverridableMethodCallInConstructor")
        public Vertex(Vertex vertex){
            this._edge_list = new Lista<>();
            this._total_weight = 0.0;
            this._element = vertex.element();

            Edge middle = vertex.middle();

            if (middle != null) {

                this.push_back(middle);

                Edge go_down = middle.previous();
                Edge go_up = middle.next();

                while (go_down != null || go_up != null) {

                    if (go_down != null) {
                        push_front(go_down);
                        go_down = go_down.previous();
                    }
                    if (go_up != null) {
                        push_back(go_up);
                        go_up = go_up.next();
                    }
                }
            }
        }

        //Public Methods

        public boolean is_empty() {
            return this._edge_list.is_empty();
        }
        
        public int size() {
            return this._edge_list.size();
        }

        public Edge front() throws NullPointerException {
            return  this._edge_list.first();
        }

        public Edge back() throws NullPointerException {
            return this._edge_list.last();
        }

        public Edge middle() throws NullPointerException {
            return this._edge_list.medium();
        }

        public void element(T element) {this._element = element;}

        public T element() {return this._element;}

        public Lista<Edge> edge_list(){return this._edge_list;}

        public double total_weight() {return this._total_weight;}
       
        public void previous(Vertex previous) {this._previous = previous;}

        public Vertex previous() {return this._previous;}

        public void next(Vertex next) {this._next = next;}

        public Vertex next() {return this._next;}
        
        public void push_back(Edge ... edges) {
            for(Edge edge : edges){
                if(edge != null) {
                    this._edge_list.push_back(edge);
                    _allEdges.push_back(edge);
                    this._total_weight += edge.weight();
                    _allWeight += edge.weight(); 
                }
            }
        }

        public void push_front(Edge ... edges) {
            for(Edge edge : edges){
                if(edge != null) {
                    this._edge_list.push_front(edge);
                    _allEdges.push_front(edge);
                    this._total_weight += edge.weight();
                    _allWeight += edge.weight();
                }
            }
        }
        
        public void push_front(double weight, Vertex destination){
            Edge new_edge = new Edge(weight, this, destination);
            this._edge_list.push_front(new_edge);
            _allEdges.push_front(new_edge);
            this._total_weight += new_edge.weight();
            _allWeight += new_edge.weight();
        }
        
        public void push_back(double weight, Vertex destination){
            Edge new_edge = new Edge(weight, this, destination);
            this._edge_list.push_back(new_edge);
            _allEdges.push_back(new_edge);
            this._total_weight += new_edge.weight();
            _allWeight += new_edge.weight();
        }
        
        public boolean add_front(Edge edge){
            return this._edge_list.add_front(edge);
        }
        
        public boolean add_back(Edge edge){
            return this._edge_list.add_back(edge);
        }
        
        public boolean add_front(double weight, Vertex destination) {
            if(!this.contains(weight, destination)){
                this.push_front(weight, destination);
                return true;
            }
            return  false;
        }

        public boolean add_back(double weight, Vertex destination) {
            if (!this.contains(weight, destination)) {
                this.push_back(weight, destination);
                return true;
            }
            return false;
        }

        public Edge devertex() throws NullPointerException {
            return this._edge_list.delist();
        }

        public Edge unvextex() throws NullPointerException {
            return this._edge_list.unlist();
        }
        
        public boolean contains(Edge destination) {
            return this._edge_list.contains(destination);
        }
  
        public boolean contains_destination(T destination) {
            if (this.size() == 0) {
                return false;
            }
            if (this.size() == 1) {
                return this.front().destination().element().equals(destination);
            }
            if (this.size() == 2) {
                return this.front().destination().element().equals(destination) || this.back().destination().element().equals(destination);
            } else {
                Edge first = this.front();
                Edge last = this.back();

                int middle_index = (this.size()) / 2;

                if (middle_index % 2 == 0) {
                    for (int i = 0; i < middle_index; i++) {

                        if (first.destination().element().equals(destination)) {
                            return true;
                        }

                        if (last.destination().element().equals(destination)) {
                            return true;
                        }

                        first = first.next();
                        last = last.previous();
                    }
                    return false;
                } else {
                    for (int i = 0; i < middle_index; i++) {

                        if (first.destination().element().equals(destination)) {
                            return true;
                        }

                        if (last.destination().element().equals(destination)) {
                            return true;
                        }

                        first = first.next();
                        last = last.previous();
                    }

                    return this.middle().destination().element().equals(destination);
                }
            }
        }
        
        public boolean contains_destination(Vertex destination) {
            if(destination != null){
                if (this.size() == 0) {
                    return false;
                }
                if (this.size() == 1) {
                    return this.front().destination().equals(destination);
                }
                if (this.size() == 2) {
                    return this.front().destination().equals(destination) || this.back().destination().equals(destination);
                } else {
                    Edge first = this.front();
                    Edge last = this.back();

                    int middle_index = (this.size()) / 2;

                    if (middle_index % 2 == 0) {
                        for (int i = 0; i < middle_index; i++) {

                            if (first.destination().equals(destination)) {
                                return true;
                            }

                            if (last.destination().equals(destination)) {
                                return true;
                            }

                            first = first.next();
                            last = last.previous();
                        }
                        return false;
                    } else {
                        for (int i = 0; i < middle_index; i++) {

                            if (first.destination().equals(destination)) {
                                return true;
                            }

                            if (last.destination().equals(destination)) {
                                return true;
                            }

                            first = first.next();
                            last = last.previous();
                        }

                        return this.middle().destination().equals(destination);
                    }
                }
            }
            return false;
        }
        
        public boolean contains(double weight, Vertex destination) {
            
            if(destination != null){
            
                if (this.size() == 0) {
                    return false;
                }
                if (this.size() == 1) {
                    return this.front().destination().equals(destination) && this.front().weight() == weight;
                }
                if (this.size() == 2) {
                    return (this.front().destination().equals(destination) && this.front().weight() == weight) || (this.back().destination().equals(destination) && this.back().weight() == weight);
                } else {
                    Edge first = this.front();
                    Edge last = this.back();

                    int middle_index = (this.size()) / 2;

                    if (middle_index % 2 == 0) {
                        for (int i = 0; i < middle_index; i++) {

                            if (first.destination().equals(destination) && first.weight() == weight) {
                                return true;
                            }

                            if (last.destination().equals(destination) && last.weight() == weight) {
                                return true;
                            }

                            first = first.next();
                            last = last.previous();
                        }
                        return false;
                    } else {
                        for (int i = 0; i < middle_index; i++) {

                            if (first.destination().equals(destination) && first.weight() == weight) {
                                return true;
                            }

                            if (last.destination().equals(destination) && last.weight() == weight) {
                                return true;
                            }

                            first = first.next();
                            last = last.previous();
                        }

                        return this.middle().destination().equals(destination) && this.middle().weight() == weight;
                    }
                }
            }
            
            return false;
        }

        public int position(Edge element){
            return this._edge_list.position(element);
        }

        public void pop_front() {
            if(!this.is_empty()){
                Edge erased_edge = this.front();
                _allWeight -= erased_edge.weight();
                this._total_weight -= erased_edge.weight();
                _allEdges.remove(erased_edge);
                this._edge_list.pop_front();
            }
        }

        public void pop_back() {
            if (!this.is_empty()) {
                Edge erased_edge = this.back();
                _allWeight -= erased_edge.weight();
                this._total_weight -= erased_edge.weight();
                _allEdges.remove(erased_edge);
                this._edge_list.pop_back();
            }
        }

        public void clear() {
            while(!this.is_empty()) {
                pop_front();
            }
        }

        public void erase_at(int position) {
            Edge erased_edge = this._edge_list.get(position);
            if(erased_edge != null){
                _allWeight -= erased_edge.weight();
                this._total_weight -= erased_edge.weight();
                _allEdges.remove(erased_edge);
                this._edge_list.remove(erased_edge);
            }
        }
        
        

        public void remove(T destination)  {
            if (this.size() == 0) {
                return;
            }
            if (this.size() == 1) {
                if(this.front().destination().element().equals(destination)){
                    this.pop_front();
                }
            }
            if (this.size() == 2) {
                if(this.front().destination().element().equals(destination)){
                    this.pop_front();
                }
                else if(this.back().destination().element().equals(destination)){
                    this.pop_back();
                }
            } else {
                Edge first = this.front();
                Edge last = this.back();

                int middle_index = (this.size()) / 2;

                if (middle_index % 2 == 0) {
                    for (int i = 0; i < middle_index; i++) {

                        if (first.destination().element().equals(destination)) {
                            this.remove(first);
                            return;
                        }

                        if (last.destination().element().equals(destination)) {
                            this.remove(last);
                            return;
                        }

                        first = first.next();
                        last = last.previous();
                    }
                } else {
                    for (int i = 0; i < middle_index; i++) {

                        if (first.destination().element().equals(destination)) {
                            this.remove(first);
                            return;
                        }

                        if (last.destination().element().equals(destination)) {
                           this.remove(last);
                           return;
                        }

                        first = first.next();
                        last = last.previous();
                    }

                    if(this.middle().destination().element().equals(destination)){
                        this.remove(middle());
                    }
                }
            }

        }

        public void remove(Edge edge)  {
            Nodo<Edge> edge_node = this._edge_list.node(edge);
            if (edge_node != null) {
                Edge erased_edge = edge_node.element();
                _allWeight -= erased_edge.weight();
                this._total_weight -= erased_edge.weight();
                _allEdges.remove(erased_edge);
                this._edge_list.remove(erased_edge);
            }
        }

        //Override methods

        @Override
        public String toString(){

            String newString ="";

            Edge auxiliar = this.front();

            while(auxiliar != null){
                newString =  CourseRoom.Utilerias.Concatenar("[",auxiliar.toString(),"] ");
                    auxiliar = auxiliar.next();
            }
            return newString;
        }

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 53 * hash + (int) (this.size() ^ (32 >>> this.size()));
            hash = 53 * hash + Objects.hashCode(this._element);
            hash = 53 * hash + Objects.hashCode(this._edge_list);
            hash = 53 * hash + (int) (Double.doubleToLongBits(this._total_weight) ^ (Double.doubleToLongBits(this._total_weight) >>> 32));
            return hash;
        }

        @Override 
        public boolean equals(Object object) {
            if (object == this){
                return true; 
            }

            if (!(object instanceof Grafo.Vertex)){
                return false; 
            }

            @SuppressWarnings("unchecked")
            Vertex other_vertex = (Vertex) object; 

            if(other_vertex.size() == other_vertex.size()) {

                Edge this_front = this.front();
                Edge object_front = other_vertex.front();

                while(this_front != null) {

                    if(!this_front.equals(object_front)){
                        return false;
                    }

                    this_front = this_front.next();
                    object_front = object_front.next();
                }

                return true;
            }

            return false;
        }

    }

    /**Edge class*/
    public class Edge implements Comparable<Edge>{

        //Private attributes

        /**The weight element of the edge.*/
        private double _weight;
        /**The origin vertex pointer.*/
        private Vertex _origin;
        /**The destination vertex pointer.*/
        private Vertex _destination;
        /**The previous edge pointer.*/
        private Edge _previous;
        /**The next edge pointer.*/
        private Edge _next;

        //Private methods

        private byte access_level(){

            //Both Edges next and previous are not null.
            if(this._next != null && this._previous != null){
                //Both Vertex are not null. That means nothing is null.
                if(this._origin != null && this._destination != null){
                    return 0;
                }
                //Just destination is null.
                else if(this._origin != null && this._destination == null){
                    return 1;
                }
                //Just origin is null.
                else if(this._origin == null && this._destination != null){
                    return 2;
                }
                //Both Vertex are null.
                return 3;
            }
            //Just next Edge is not null.
            else if(this._next != null && this._previous == null){
                //Both Vertex are not null. That means nothing is null.
                if(this._origin != null && this._destination != null){
                    return 4;
                }
                //Just destination is null.
                else if(this._origin != null && this._destination == null){
                    return 5;
                }
                //Just origin is null.
                else if(this._origin == null && this._destination != null){
                    return 6;
                }
                //Both Vertex are null.
                return 7;
            }
            //Just previous Edge is not null.
            else if(this._next == null && this._previous != null){
                //Both Vertex are not null. That means nothing is null.
                if(this._origin != null && this._destination != null){
                    return 8;
                }
                //Just destination is null.
                else if(this._origin != null && this._destination == null){
                    return 9;
                }
                //Just origin is null.
                else if(this._origin == null && this._destination != null){
                    return 10;
                }
                //Both Vertex are null.
                return 11;
            }
            //Both Edges are null.
            else{
                //Both Vertex are not null. That means nothing is null.
                if(this._origin != null && this._destination != null){
                    return 12;
                }
                //Just destination is null.
                else if(this._origin != null && this._destination == null){
                    return 13;
                }
                //Just origin is null.
                else if(this._origin == null && this._destination != null){
                    return 14;
                }
                //Both Vertex are null.
                return 15;
            }
        }

        //Public constructors

        public Edge(double weight, Vertex origin){
            this._weight = weight;
            this._origin = origin;
        }

        public Edge(double weight, Vertex origin, Edge previous, Edge next){
            this._weight = weight;
            this._origin = origin;
            this._previous = previous;
            this._next = next;
        }

        public Edge(double weight, Vertex origin, Vertex destination){
            this._weight = weight;
            this._origin = origin;
            this._destination = destination;
        }

        public Edge(double weight, Vertex origin, Vertex destination, Edge previous, Edge next){
            this._weight = weight;
            this._origin = origin;
            this._destination = destination;
            this._previous = previous;
            this._next = next;
        }

        //Public methods

        public void weight(double element) {
            this._weight = element;
        }

        public double weight() {
            return this._weight;
        }

        public void previous(Edge previous) {
            this._previous = previous;
        }

        public Edge previous() {
            return this._previous;
        }

        public void next(Edge next) {
            this._next = next;
        }

        public Edge next() {
            return this._next;
        }

        public void origin(Vertex origin){
            this._origin = origin;
        }

        public Vertex origin(){
            return this._origin;
        }

        public void destination(Vertex destination){
            this._destination = destination;
        }

        public Vertex destination(){
            return this._destination;
        }

        //Overrides methods

        @Override
        public int hashCode() {
            int hash = 5;
            hash = 37 * hash + (int) (Double.doubleToLongBits(this._weight) ^ (Double.doubleToLongBits(this._weight) >>> 32));
            hash = 37 * hash + Objects.hashCode(this._origin);
            hash = 37 * hash + Objects.hashCode(this._destination);
            return hash;
        }


        @Override
        public boolean equals(Object object) {
            if (object == this){
                return true; 
            }

            if (!(object instanceof Grafo<?>.Edge)){
                return false; 
            }

            @SuppressWarnings("unchecked")
            Edge objectEdge = (Edge) object;

            //Both Edges next and previous are not null.
            if(this._next != null && this._previous != null){
                //Both Vertex are not null.
                if(this._origin != null && this._destination != null){
                    return (objectEdge.access_level() == 0) ? Objects.equals(this._weight, objectEdge._weight) 
                    && this._origin.element().equals(objectEdge.origin().element())  
                    && this._destination.element().equals(objectEdge.destination().element()) 
                    && this._next._weight == (objectEdge.next().weight()) 
                    && this._previous._weight == objectEdge.previous().weight() : false;
                }
                //Just destination is null.
                if(this._origin != null && this._destination == null){
                    return (objectEdge.access_level() == 1) ? Objects.equals(this._weight, objectEdge._weight) 
                    && this._origin.element().equals(objectEdge.origin().element()) 
                    && this._next._weight == objectEdge.next().weight() 
                    && this._previous.weight() == (objectEdge.previous().weight())  : false;
                }
                //Just origin is null.
                if(this._origin == null && this._destination != null){
                    return (objectEdge.access_level() == 2) ? Objects.equals(this._weight, objectEdge._weight) 
                    && this._destination.element().equals(objectEdge.destination().element()) 
                    && this._next._weight == (objectEdge.next().weight()) 
                    && this._previous.weight() == (objectEdge.previous().weight()) : false;
                }
                //Both Vertex are null.
                if(objectEdge.access_level() == 3){
                    return Objects.equals(this._weight, objectEdge._weight) &&  this._next._weight == (objectEdge.next().weight()) && this._previous.weight() == (objectEdge.previous().weight());
                }
                return false;

            }
            //Just next Edge is not null.
            else if(this._next != null && this._previous == null){
                //Both Vertex are not null.
                if(this._origin != null && this._destination != null){
                    return (objectEdge.access_level() == 4) ? Objects.equals(this._weight, objectEdge._weight) 
                    && this._origin.element().equals(objectEdge.origin().element()) 
                    && this._destination.element().equals(objectEdge.destination().element()) 
                    && this._next._weight == (objectEdge.next().weight()) : false;
                }

                //Just destination is null.
                if(this._origin != null && this._destination == null){
                    return (objectEdge.access_level() == 5) ? Objects.equals(this._weight, objectEdge._weight) 
                    && this._origin.element().equals(objectEdge.origin().element()) 
                    && this._next._weight == (objectEdge.next().weight()) : false;
                }
                //Just origin is null.
                if(this._origin == null && this._destination != null){
                    return (objectEdge.access_level() == 6) ? Objects.equals(this._weight, objectEdge._weight)
                    && this._destination.element().equals(objectEdge.destination().element()) 
                    && this._next._weight == (objectEdge.next().weight()) : false;
                }
                //Both Vertex are null.
                if(objectEdge.access_level() == 7){
                    return Objects.equals(this._weight, objectEdge._weight)  
                    && this._next._weight == (objectEdge.next().weight());
                }
                return false;	
            }
            //Just previous Edge is not null.
            else if(this._next == null && this._previous != null){
                //Both Vertex are not null.
                if(this._origin != null && this._destination != null){
                    return (objectEdge.access_level() == 8) ? Objects.equals(this._weight, objectEdge._weight) 
                    && this._origin.element().equals(objectEdge.origin().element()) 
                    && this._destination.element().equals(objectEdge.destination().element())
                    && this._previous.weight() == (objectEdge.previous().weight()) : false;
                }
                //Just destination is null.
                if(this._origin != null && this._destination == null){
                    return (objectEdge.access_level() == 9) ? Objects.equals(this._weight, objectEdge._weight)
                    && this._origin.element().equals(objectEdge.origin().element()) 
                    && this._previous.weight() == (objectEdge.previous().weight()) : false;

                }
                //Just origin is null.
                if(this._origin == null && this._destination != null){
                    return (objectEdge.access_level() == 10) ? Objects.equals(this._weight, objectEdge._weight) 
                    && this._destination.element().equals(objectEdge.destination().element()) 
                    && this._previous.weight() == (objectEdge.previous().weight()) : false;
                }
                //Both Vertex are null.
                if(objectEdge.access_level() == 11){
                    return Objects.equals(this._weight, objectEdge._weight) 
                    && this._previous.weight() == (objectEdge.previous().weight());
                }
                return false;

            }
            //Both Edges are null.
            else{
                //Both Vertex are not null.
                if(this._origin != null && this._destination != null){
                    return (objectEdge.access_level() == 12) ? Objects.equals(this._weight, objectEdge._weight)
                    && this._origin.element().equals(objectEdge.origin().element()) 
                    && this._destination.element().equals(objectEdge.destination().element()) : false;
                }
                //Just destination is null.
                else if(this._origin != null && this._destination == null){
                    return (objectEdge.access_level() == 13) ? Objects.equals(this._weight, objectEdge._weight)
                    && this._origin.element().equals(objectEdge.origin().element()) : false;
                }
                //Just origin is null.
                else if(this._origin == null && this._destination != null){
                    return (objectEdge.access_level() == 14) ? Objects.equals(this._weight, objectEdge._weight)
                    && this._destination.element().equals(objectEdge.destination().element()) : false;
                }

                //Both Vertex are null.
                return (objectEdge.access_level() == 15) && Objects.equals(this._weight, objectEdge._weight);
            }
        }

        @Override
        public String toString(){

            if(this._origin != null && this._destination != null){
                return this._origin.element() + " - " + this._weight + " - " + this._destination.element();
            }
            else if(this._origin == null && this._destination != null){
                return " - " + this._weight + " - " + this._destination.element();
            }
            else if(this._origin != null && this._destination == null){
                return this._origin.element() + " - " + this._weight + " - ";
            }
            
            return String.valueOf(this._weight);
        }

        @Override
        public int compareTo(Edge o) {
            if(this._weight ==o._weight){
                return 0;
            }
            else if(this._weight > o._weight){
                return 1;
            }
            else{
                return -1;
            }
        }

    }

    //Private attributes

    /**The number of vertex into the graph.*/
    private int  _size;
    /**The first-front vertex pointer.*/
    private Vertex _front;
    /**The middle-medium vertex pointer.*/
    private Vertex _middle;
    /**The last-back vertex pointer.*/
    private Vertex _back;
    /**The total weight into the graph.*/
    private double _allWeight;
    /**The all edges list*/
    private Lista<Edge> _allEdges;

    /**Sets the initial elements of all attributes.*/
    private void _init() {
            this._size = 0;
            this._allWeight = 0.0;
            this._allEdges = new Lista<>();
    }

    /**Gets a pair of the vertexs who have the given elements.*/
    private Par<Vertex,Vertex> getVertexs(T firstElement, T secondElement){
            Vertex firstVertex;
            Vertex secondVertex;

            firstVertex = secondVertex = null;

            if(this._size == 1) {
                    if(this._front.element().equals(firstElement))
                            firstVertex = this._front;
                    else if(this._front.element().equals(secondElement))
                            secondVertex = this._front;
            }
            else if(this._size == 2) {
                    if(this._front.element().equals(firstElement))
                            firstVertex = this._front;
                    else if(this._front.element().equals(secondElement))
                            secondVertex = this._front;
                    if(this._back.element().equals(firstElement))
                            firstVertex = this._back;
                    else if(this._back.element().equals(secondElement))
                            secondVertex = this._back;
            }
            else{

                    Vertex first = this._front;
                    Vertex last = this._back;

                    double middleIndex = ((double)this._size)/2;

                    for(double i = 0; i < middleIndex;i++) {

                            if(first.element().equals(firstElement))
                                    firstVertex = first;
                            else if(first.element().equals(secondElement))
                                    secondVertex = first;

                            if(last.element().equals(firstElement))
                                    firstVertex = last;
                            else if(last.element().equals(secondElement))
                                    secondVertex = last;

                            first = first.next();
                            last = last.previous();
                    }	

            }
            return new Par<>(firstVertex, secondVertex);
    }

    //Public constructors

    /**Creates a new empty graph with initial elements.*/
    public Grafo() { _init();}

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Grafo(Grafo<T> graph) {

            this._init();

            Grafo<T>.Vertex middle = graph.getMiddleVertex();

            if(middle != null) {

                    this.push_back(middle.element());
                    Grafo<T>.Vertex previous = middle.previous();
                    Grafo<T>.Vertex next = middle.next();

                    while(previous != null || next != null) {

                            if(previous != null) {
                                    this.push_front(previous.element());
                                    previous = previous.previous();
                            }
                            if(next != null) {
                                    this.push_back(next.element());
                                    next = next.next();
                            }
                    }
            }
    }

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Grafo(Lista<T> list) {

            this._init();

           Nodo<T> middle = list.middle();

            if(middle != null) {

                   this.push_back(middle.element());
                   Nodo<T> previous = middle.previous();
                   Nodo<T> next = middle.next();

                    while(previous != null || next != null) {

                            if(previous != null) {
                                    this.push_front(previous.element());
                                    previous = previous.previous();
                            }
                            if(next != null) {
                                    this.push_back(next.element());
                                    next = next.next();
                            }
                    }
            }
    }

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public Grafo(Coleccion<T> structure) {

            this._init();

           Nodo<T> middle = structure.list().middle();

            if(middle != null) {

                    this.push_back(middle.element());
                   Nodo<T> previous = middle.previous();
                   Nodo<T> next = middle.next();

                    while(previous != null || next != null) {

                            if(previous != null) {
                                    this.push_front(previous.element());
                                    previous = previous.previous();
                            }
                            if(next != null) {
                                    this.push_back(next.element());
                                    next = next.next();
                            }
                    }
            }
    }

    public boolean is_empty() {return this._front == null;}

    public int size() {return this._size;}

    public double total_weight() {return this._allWeight;}

    public int getNumberOfEdges() {return this._allEdges.size();}

    public Lista<Edge> edge_list(){return _allEdges;}

    public boolean existDestination(Vertex vertex) {

            Nodo<Edge> firstDestinationNode = this._allEdges.front();
            Nodo<Edge> lastDestinationNode = this._allEdges.back();
            double middleIndex = ((double)this._size)/2;

            for(double i = 0; i < middleIndex;i++) {

                    if(firstDestinationNode.element().destination().element().equals(vertex.element()))
                            return true;

                    if(lastDestinationNode.element().destination().element().equals(vertex.element()))
                            return true;

                    firstDestinationNode = firstDestinationNode.next();
                    lastDestinationNode = lastDestinationNode.previous();
            }

            return false;
    }

    public boolean xxistOrigin(Vertex vertex) {

            Nodo<Edge> firstOriginNode = this._allEdges.front();
            Nodo<Edge> lastOriginNode = this._allEdges.back();
            double middleIndex = ((double)this._size)/2;

            for(double i = 0; i < middleIndex;i++) {

                    if(firstOriginNode.element().origin().element().equals(vertex.element()))
                            return true;

                    if(lastOriginNode.element().origin().element().equals(vertex.element()))
                            return true;

                    firstOriginNode = firstOriginNode.next();
                    lastOriginNode = lastOriginNode.previous();
            }

            return false;
    }

    public boolean existEdge(Vertex origin, Vertex destination) { return existEdge(origin.element(),destination.element());}

    public boolean existEdge(T origin, T destination) {

            Nodo<Edge> firstNode = this._allEdges.front();
            Nodo<Edge> lastNode = this._allEdges.back();

            double middleIndex = ((double)this._size)/2;

            for(double i = 0; i < middleIndex;i++) {

                    if(firstNode.element().destination().element().equals(destination)
                                    && firstNode.element().origin().element().equals(origin))
                            return true;

                    if(lastNode.element().destination().element().equals(destination)
                                    && lastNode.element().origin().element().equals(origin))
                            return true;

                    firstNode = firstNode.next();
                    lastNode = lastNode.previous();
            }

            return false;
    }


    public Edge get(T origin, T destination) {

            Nodo<Edge> firstNode = this._allEdges.front();
            Nodo<Edge> lastNode = this._allEdges.back();

            double middleIndex = ((double)this._size)/2;

            for(double i = 0; i < middleIndex;i++) {

                    if(firstNode.element().destination().element().equals(destination)
                                    && firstNode.element().origin().element().equals(origin))
                            return firstNode.element();

                    if(lastNode.element().destination().element().equals(destination)
                                    && lastNode.element().origin().element().equals(origin))
                            return lastNode.element();

                    firstNode = firstNode.next();
                    lastNode = lastNode.previous();
            }

            return null;
    }

    public Par<Edge,Edge> edge_list(T origin, T destination) {

            Edge firstEdge = null;
            Edge secondEdge = null;

            Nodo<Edge> firstNode = this._allEdges.front();
            Nodo<Edge> lastNode = this._allEdges.back();

            double middleIndex = ((double)this._size)/2;

            for(double i = 0; i < middleIndex;i++) {

                    if(firstNode.element().destination().element().equals(destination)
                                    && firstNode.element().origin().element().equals(origin))
                            firstEdge = firstNode.element();

                    if(lastNode.element().destination().element().equals(destination)
                                    && lastNode.element().origin().element().equals(origin))
                            firstEdge = lastNode.element();

                    if(firstNode.element().destination().element().equals(origin)
                                    && firstNode.element().origin().element().equals(destination))
                            secondEdge = firstNode.element();

                    if(lastNode.element().destination().element().equals(origin)
                                    && lastNode.element().origin().element().equals(destination))
                            secondEdge = lastNode.element();

                    firstNode = firstNode.next();
                    lastNode = lastNode.previous();
            }

            return new Par<>(firstEdge,secondEdge);
    }

    public Par<Boolean,Boolean> existEdges(T origin, T destination){

            Boolean existFirstEdge = false;
            Boolean existSecondEdge = false;

            Nodo<Edge> firstNode = this._allEdges.front();
            Nodo<Edge> lastNode = this._allEdges.back();

            double middleIndex = ((double)this._size)/2;

            for(double i = 0; i < middleIndex;i++) {


                    if(firstNode.element().destination().element().equals(destination)
                                    && firstNode.element().origin().element().equals(origin))
                            existFirstEdge = true;


                    if(lastNode.element().destination().element().equals(destination)
                                    && lastNode.element().origin().element().equals(origin))
                            existFirstEdge = true;

                    if(firstNode.element().destination().element().equals(origin)
                                    && firstNode.element().origin().element().equals(destination))
                            existSecondEdge = true;


                    if(lastNode.element().destination().element().equals(origin)
                                    && lastNode.element().origin().element().equals(destination))
                            existSecondEdge = true;

                    if(existFirstEdge && existSecondEdge)
                            break;

                    firstNode = firstNode.next();
                    lastNode = lastNode.previous();
            }

            return new Par<>(existFirstEdge, existSecondEdge);
    }

    public boolean isAddresed(){

            Nodo<Edge> firstOriginNode = this._allEdges.front();
            Nodo<Edge> lastOriginNode = this._allEdges.back();

            double middleIndex = ((double)this._allEdges.size())/2;

            for(double i = 0; i < middleIndex;i++) {

                    if(existDestination(firstOriginNode.element().origin()))
                            return true;

                    if(existDestination(lastOriginNode.element().origin()))
                            return true;

                    firstOriginNode = firstOriginNode.next();
                    lastOriginNode = lastOriginNode.previous();
            }
            return false;
    }

    public T first() { 
            if(this._front != null)
                    return this._front.element(); 
            else
                    throw new NullPointerException("Error: The Value Is Null. Impossible To Return It.");
    }

    public T getLastElement() { 
            if(this._back != null)
                    return this._back.element(); 
            else
                    throw new NullPointerException("Error: The Value Is Null. Impossible To Return It.");
    }

    public T getMediumElement() { 
            if(this._middle != null)
                    return this._middle.element(); 
            else
                    throw new NullPointerException("Error: The Value Is Null. Impossible To Return It.");
    }

    public Vertex getFrontVertex() { return this._front; }
    
    public Vertex getBackVertex() { return this._back; }
	
    public Vertex getMiddleVertex() {return this._middle;}

    public boolean contains_element(T element) {
            
            if(this._size == 0)
                    return false;
            else if(this._size == 1)
                            return this._front.element().equals(element);
            else if(this._size == 2)
                            return this._front.element().equals(element) || this._back.element().equals(element);
            else{

                    Vertex first = this._front;
                    Vertex last = this._back;

                    double middleIndex = ((double)this._size)/2;

                    for(double i = 0; i < middleIndex;i++) {

                            if(first.element().equals(element))
                                    return true;

                            if(last.element().equals(element))
                                    return true;

                            first = first.next();
                            last = last.previous();
                    }

                    return false;
            }
            
    }

    public void push_back(T element){
            if(this.is_empty()){
                    //creates a new Vertex.
                    Vertex newVertex = new Vertex(element);
                    this._front = this._back = this._middle = newVertex;
                    this._size++;
            }
            else{
                    if(!contains_element(element)) {
                            Vertex newVertex = new Vertex(element,this._back,null);
                            this._back.next(newVertex);
                            this._back = newVertex;
                            ++_size;
                            if(this._size % 2 != 0)
                                    this._middle = this._middle.next();
                    }
            }
    }

    public void push_front(T element){
            if(this.is_empty()){
                    //creates a new Vertex.
                    Vertex newVertex = new Vertex(element);
                    this._front = this._back = this._middle = newVertex;
                    this._size++;
            }
            else{
                    if(!contains_element(element)) {
                            Vertex newVertex = new Vertex(element,null,this._front);
                            this._front.previous(newVertex);
                            this._front = newVertex;
                            ++_size;
                            if(this._size % 2 == 0)
                                    this._middle = this._middle.previous();
                    }
            }
    }

    public T getElement(int index) {

            if(!this.is_empty()){

                    int realIndex = index % this._size;

                    if(realIndex == 0) 
                            return this._front.element();

                    else if(realIndex == this._size-1) 
                            return this._back.element();

                    else { 
                            int middleIndex = this._size/2;

                            if(this._size % 2 != 0) { 
                                    int differenceBetweenFront = Math.abs(realIndex-1);
                                    int differenceBetweenBack = Math.abs(realIndex-(this._size-2));
                                    int differenceBetweenMiddle = Math.abs(realIndex-middleIndex);

                                    if( (differenceBetweenFront < differenceBetweenBack 
                                                    && differenceBetweenFront < differenceBetweenMiddle ) 
                                                    || differenceBetweenFront == differenceBetweenMiddle) {

                                            Vertex auxiliar = this._front.next();

                                            for(int i = 1; i < realIndex;i++)
                                                    auxiliar = auxiliar.next();

                                            return auxiliar.element();

                                    }
                                    else if(differenceBetweenMiddle < differenceBetweenBack 
                                                    && differenceBetweenMiddle < differenceBetweenFront) {

                                            if(realIndex > middleIndex) {
                                                    Vertex auxiliar = this._middle.next();

                                                    for(int i = middleIndex+1; i < realIndex;i++)
                                                            auxiliar = auxiliar.next();

                                                    return auxiliar.element();
                                            }
                                            else if(realIndex == middleIndex)
                                                    return this._middle.element();

                                            else {
                                                    Vertex auxiliar = this._middle.previous();

                                                    for(int i = middleIndex-1; i > realIndex;i--)
                                                            auxiliar = auxiliar.previous();

                                                    return auxiliar.element();
                                            }
                                    }
                                    else{

                                            Vertex auxiliar = this._back.previous();

                                            for(int i = this._size-2; i > realIndex;i--)
                                                    auxiliar = auxiliar.previous();

                                            return auxiliar.element();
                                    }

                            }
                            else { 
                                    int differenceBetweenFront = Math.abs(realIndex-1);
                                    int differenceBetweenBack = Math.abs(realIndex-(this._size-2));
                                    int differenceBetweenMiddle = Math.abs(realIndex-(middleIndex-1));

                                    if( (differenceBetweenFront < differenceBetweenBack 
                                                    && differenceBetweenFront < differenceBetweenMiddle ) 
                                                    || differenceBetweenFront == differenceBetweenMiddle) {

                                            Vertex auxiliar = this._front.next();

                                            for(int i = 1; i < realIndex;i++)
                                                    auxiliar = auxiliar.next();

                                            return auxiliar.element();

                                    }

                                    else if(differenceBetweenMiddle < differenceBetweenBack 
                                                    && differenceBetweenMiddle < differenceBetweenFront) {

                                            if(realIndex > (middleIndex-1)) {

                                                    Vertex auxiliar = this._middle.next();

                                                    for(int i = middleIndex; i < realIndex;i++)
                                                            auxiliar = auxiliar.next();

                                                    return auxiliar.element();
                                            }
                                            else if(realIndex == (middleIndex-1))
                                                    return this._middle.element();

                                            else {
                                                    Vertex auxiliar = this._middle.previous();

                                                    for(int i = middleIndex-2; i > realIndex;i--)
                                                            auxiliar = auxiliar.previous();

                                                    return auxiliar.element();
                                            }

                                    }
                                    else{

                                            Vertex auxiliar = this._back.previous();

                                            for(int i = this._size-2; i > realIndex;i--)
                                                    auxiliar = auxiliar.previous();

                                            return auxiliar.element();
                                    }
                            }

                    }
            }

            else
                    throw new NullPointerException("Error: The Graph Is is_empty.");
    }

    public Vertex getVertex(int index) {

            if(!this.is_empty()){

                    int realIndex = index % this._size;

                    if(realIndex == 0) 
                            return this._front;

                    else if(realIndex == this._size-1) 
                            return this._back;

                    else { 
                            int middleIndex = this._size/2;

                            if(this._size % 2 != 0) { 
                                    int differenceBetweenFront = Math.abs(realIndex-1);
                                    int differenceBetweenBack = Math.abs(realIndex-(this._size-2));
                                    int differenceBetweenMiddle = Math.abs(realIndex-middleIndex);

                                    if( (differenceBetweenFront < differenceBetweenBack 
                                                    && differenceBetweenFront < differenceBetweenMiddle ) 
                                                    || differenceBetweenFront == differenceBetweenMiddle) {

                                            Vertex auxiliar = this._front.next();

                                            for(int i = 1; i < realIndex;i++)
                                                    auxiliar = auxiliar.next();

                                            return auxiliar;

                                    }
                                    else if(differenceBetweenMiddle < differenceBetweenBack 
                                                    && differenceBetweenMiddle < differenceBetweenFront) {

                                            if(realIndex > middleIndex) {
                                                    Vertex auxiliar = this._middle.next();

                                                    for(int i = middleIndex+1; i < realIndex;i++)
                                                            auxiliar = auxiliar.next();

                                                    return auxiliar;
                                            }
                                            else if(realIndex == middleIndex)
                                                    return this._middle;

                                            else {
                                                    Vertex auxiliar = this._middle.previous();

                                                    for(int i = middleIndex-1; i > realIndex;i--)
                                                            auxiliar = auxiliar.previous();

                                                    return auxiliar;
                                            }
                                    }
                                    else{

                                            Vertex auxiliar = this._back.previous();

                                            for(int i = this._size-2; i > realIndex;i--)
                                                    auxiliar = auxiliar.previous();

                                            return auxiliar;
                                    }

                            }
                            else { 
                                    int differenceBetweenFront = Math.abs(realIndex-1);
                                    int differenceBetweenBack = Math.abs(realIndex-(this._size-2));
                                    int differenceBetweenMiddle = Math.abs(realIndex-(middleIndex-1));

                                    if( (differenceBetweenFront < differenceBetweenBack 
                                                    && differenceBetweenFront < differenceBetweenMiddle ) 
                                                    || differenceBetweenFront == differenceBetweenMiddle) {

                                            Vertex auxiliar = this._front.next();

                                            for(int i = 1; i < realIndex;i++)
                                                    auxiliar = auxiliar.next();

                                            return auxiliar;

                                    }

                                    else if(differenceBetweenMiddle < differenceBetweenBack 
                                                    && differenceBetweenMiddle < differenceBetweenFront) {

                                            if(realIndex > (middleIndex-1)) {

                                                    Vertex auxiliar = this._middle.next();

                                                    for(int i = middleIndex; i < realIndex;i++)
                                                            auxiliar = auxiliar.next();

                                                    return auxiliar;
                                            }
                                            else if(realIndex == (middleIndex-1))
                                                    return this._middle;

                                            else {
                                                    Vertex auxiliar = this._middle.previous();

                                                    for(int i = middleIndex-2; i > realIndex;i--)
                                                            auxiliar = auxiliar.previous();

                                                    return auxiliar;
                                            }

                                    }
                                    else{

                                            Vertex auxiliar = this._back.previous();

                                            for(int i = this._size-2; i > realIndex;i--)
                                                    auxiliar = auxiliar.previous();

                                            return auxiliar;
                                    }
                            }

                    }
            }

            else
                    throw new NullPointerException("Error: The Graph Is is_empty.");
    }

    
    public int position(T element){
            int frontCounter = 0;
            int backCounter = this._size-1;
            Vertex first = this._front;
            Vertex last = this._back;

            double middleIndex = ((double)this._size)/2;

            for(double i = 0; i < middleIndex;i++) {

                    if(first.equals(element))
                            return frontCounter;

                    if(last.equals(element))
                            return backCounter;

                    frontCounter++;
                    backCounter--;

                    first = first.next();
                    last = last.previous();
            }
            return -1;
    }

    public int position(Vertex vertex) {return position(vertex.element());}

    public Vertex getVertex(T element) {
            
          if(this._size == 0)
                    return null;
          else if(this._size == 1)
                    return (this._front.element().equals(element))? this._front : null;
          else if(this._size == 0){

                    if(this._front.element().equals(element))
                            return this._front;
                    if(this._back.element().equals(element))
                            return this._back;

                    return null;
          }
          else{
                            Vertex first = this._front;
                            Vertex last = this._back;
                            double middleIndex = ((double)this._size)/2;

                            for(double i = 0; i < middleIndex;i++) {
                                    if(first.element().equals(element))
                                            return first;
                                    if(last.element().equals(element))
                                            return last;
                                    first = first.next();
                                    last = last.previous();
                            }

                            return null;
                }
            
    }

    public void pop_front() {
            if(!this.is_empty()){

                    Vertex erasedVertex = this._front;

                    Vertex first = this._front;
                    Vertex last = this._back;

                    double middleIndex = ((double)this._size)/2;

                    for(double i = 0; i < middleIndex;i++) {

                            first.remove(erasedVertex.element());
                            last.remove(erasedVertex.element());

                            first = first.next();
                            last = last.previous();

                    }

                    if(this._size % 2 == 0) 
                            this._middle = this._middle.next();
                    this._front = this._front.next();

                if(this._front != null)
                            this._front.previous(null);

                    --this._size;

            }
    }

    public void pop_back() {
            if(!this.is_empty()){

                    Vertex erasedVertex = this._back;

                    Vertex first = this._front;
                    Vertex last = this._back;

                    double middleIndex = ((double)this._size)/2;

                    for(double i = 0; i < middleIndex;i++) {

                            first.remove(erasedVertex.element());
                            last.remove(erasedVertex.element());

                            first = first.next();
                            last = last.previous();

                    }

                    if(this._size % 2 != 0) 
                            this._middle = this._middle.previous();

                    this._back = this._back.previous();

                if(this._back != null)
                            this._back.next(null);

                    --this._size;
            }

    }

    public void clear() {
            if(!this.is_empty()){
                    while(!this.is_empty()) {
                            pop_front();
                            pop_back();
                    }
                    this._size = 0;
                    this._back = this._middle  = this._front = null;
            }
    }

    public void erase_at(int position) {
            if(!this.is_empty()){

                    int realPosition = position % this._size;

                    if(realPosition == 0) 
                            pop_front();

                    else if(realPosition == (this._size -1) )
                            pop_back();

                    else{

                            Vertex previousVertex = getVertex(position-1);
                            Vertex erasedVertex = previousVertex.next();
                            Vertex first = this._front;
                            Vertex last = this._back;

                            double middleIndex = ((double)this._size)/2;

                            for(double i = 0; i < middleIndex;i++) {

                                    first.remove(erasedVertex.element());
                                    last.remove(erasedVertex.element());

                                    first = first.next();
                                    last = last.previous();

                            }

                            boolean isMiddle = erasedVertex.equals(this._middle);
                            Vertex nextVertex = erasedVertex.next();

                            previousVertex.next(nextVertex);
                            nextVertex.previous(previousVertex);

                    this._size--;

                    if(!isMiddle) {
                            if(this._size % 2 != 0)
                                            this._middle = this._middle.next();
                    }
                    else 
                            this._middle = (this._size % 2 == 0) ? previousVertex : nextVertex;
                    }
            }

    }

    public void remove(T element)  {
            if(!this.is_empty()) {

                    if(this._front.element().equals(element))
                            pop_front();

                    else if(this._back.element().equals(element))
                            pop_back();

                    else {

                            Vertex erasedVertex = getVertex(element);
                            if(erasedVertex != null) {

                                    Vertex first = this._front;
                                    Vertex last = this._back;

                                    double middleIndex = ((double)this._size)/2;

                                    for(double i = 0; i < middleIndex;i++) {

                                            first.remove(erasedVertex.element());
                                            last.remove(erasedVertex.element());

                                            first = first.next();
                                            last = last.previous();

                                    }

                                    Vertex previousVertex = erasedVertex.previous();
                                    boolean isMiddle = erasedVertex.equals(this._middle);
                                    Vertex nextVertex = erasedVertex.next();

                                    previousVertex.next(nextVertex);
                                    nextVertex.previous(previousVertex);

                            this._size--;

                            if(!isMiddle) {
                                    if(this._size % 2 != 0)
                                                    this._middle = this._middle.next();
                            }
                            else 
                                    this._middle = (this._size % 2 == 0) ? previousVertex : nextVertex;
                            }
                    }
            }
    }

    public void addEdgeToBack(T origin, double weight, T destination) {

            Par<Vertex,Vertex> vertexPair = getVertexs(origin,destination);

            if(vertexPair.first()!= null && vertexPair.second() != null)
                    vertexPair.first().add_back(weight, vertexPair.second());

    }

    public void addEdgeToBack(Vertex origin, double weight, Vertex destination) {

            if(origin != null && destination != null) 
                    origin.add_back(weight, destination);
    }

    public void addEdgeToFront(T origin, double weight, T destination) {

            Par<Vertex,Vertex> vertexPair = getVertexs(origin,destination);

            if(vertexPair.first() != null && vertexPair.second() != null)
                    vertexPair.first().push_front(weight, vertexPair.second());

    }


    public void addEdgeToFront(Vertex origin, double weight, Vertex destination) {

            if(origin != null && destination != null)
                    origin.push_front(weight, destination);
    }

    public void addEdgesToBack(T origin, double weight, T destination) {

            Par<Vertex,Vertex> vertexPair = getVertexs(origin,destination);

            if(vertexPair.first() != null && vertexPair.second() != null) {
                    vertexPair.first().push_back(weight,vertexPair.second());
                    vertexPair.second().push_back(weight,vertexPair.first());
            }

    }

    public void addEdgesToBack(Vertex origin, double weight, Vertex destination) {

            if(origin != null && destination != null) {
                    origin.push_back(weight,destination);
                    destination.push_back(weight,origin);
            }
    }

    public void addEdgesToFront(T origin, double weight, T destination) {

            Par<Vertex,Vertex> vertexPair = getVertexs(origin,destination);

            if(vertexPair.first() != null && vertexPair.second() != null) {
                    vertexPair.first().push_front(weight,vertexPair.second());
                    vertexPair.second().push_front(weight,vertexPair.first());
            }
    }

    public void addEdgesToFront(Vertex origin, double weight, Vertex destination) {

            if(origin != null && destination != null) {
                    origin.push_front(weight,destination);
                    destination.push_front(weight,origin);
            }
    }

    public void deleteEdge(T origin, T destination)  {
            Edge edge = get(origin,destination);

            if(edge != null) {
                    Vertex originVertex = edge.origin();
                    originVertex.remove(edge);
            }
    }

    public void deleteEdges(T origin, T destination)  {
            Par<Edge,Edge> edges = edge_list(origin,destination);


            if(edges.first() != null) {
                    Vertex originVertex = edges.first().origin();
                    originVertex.remove(edges.first());
            }

            if(edges.second()!= null) {
                    Vertex originVertex = edges.second().origin();
                    originVertex.remove(edges.second());
            }
    }

    public void updateEdge(T origin, double newWeight ,T destination) {
            Edge edge = get(origin,destination);

            if(edge != null) {
                    edge.origin()._total_weight -= edge.weight();
                    this._allWeight -= edge.weight();
                    edge.weight(newWeight);
                    edge.origin()._total_weight += newWeight;
                    this._allWeight += newWeight;
            }
    }

    public void updateEdges(T origin, double newWeight,T destination) {
            Par<Edge,Edge> edges = edge_list(origin,destination);

            if(edges.first() != null) {
                    edges.first().origin()._total_weight -= edges.first().weight();
                    this._allWeight -= edges.first().weight();
                    edges.first().weight(newWeight);
                    edges.first().origin()._total_weight += newWeight;
                    this._allWeight += newWeight;
            }

            if(edges.second()!= null) {
                    edges.second().origin()._total_weight -= edges.second().weight();
                    this._allWeight -= edges.second().weight();
                    edges.second().weight(newWeight);
                    edges.second().origin()._total_weight += newWeight;
                    this._allWeight += newWeight;
            }

    }


    //Override methods
    @Override
    public String toString(){
            String newString = new String();
            Vertex auxiliar = this._front;
            while(auxiliar != null){
                    newString += "{"+auxiliar.element()+"} -> " + auxiliar+"\n";
                    auxiliar = auxiliar.next();
            }
            return newString;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + (int) (this._size ^ (this._size >>> 32));
        hash = 89 * hash + Objects.hashCode(this._front);
        hash = 89 * hash + Objects.hashCode(this._back);
        hash = 89 * hash + (int) (Double.doubleToLongBits(this._allWeight) ^ (Double.doubleToLongBits(this._allWeight) >>> 32));
        return hash;
    }
    
    

    @Override 
    public boolean equals(Object object) {
            if (object == this) 
            return true; 

        if (!(object instanceof Grafo))
            return false; 

                @SuppressWarnings("unchecked")
                Grafo<T> objectGraph = (Grafo<T>) object; 

        if(this._size == objectGraph._size) {

                Vertex thisFront = this._front;
                Vertex objectFront = objectGraph._front;

                while(thisFront != null) {

                        if(!thisFront.element().equals(objectFront.element()))
                                return false;

                        thisFront = thisFront.next();
                        objectFront = objectFront.next();
                }

                return true;
        }

        return false;
    }


    
}
