/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos.colecciones;

import datos.estructuras.Node;


/**
 *
 * @author LENOVO
 * @param <T> The Collection Data Type
 */
public class Coleccion<T>{
    protected Lista<T> _collection;
    
    public Coleccion(){
        _collection = new Lista<>();
    }
    
    public Coleccion(Lista<T> doublyLinkedList){
        _collection.join_back(doublyLinkedList);
    }

    public Lista list(){
        return  this._collection;
    }
    
    public boolean is_empty() {
        return _collection.is_empty();
    }

    public int size() {
        return _collection.size();
    }

    public T first() throws NullPointerException {
        return _collection.first();
    }

    public T last() throws NullPointerException {
        return _collection.last();
    }

    public T medium() throws NullPointerException {
        return _collection.medium();
    }

    public Node<T> front() throws NullPointerException {
        return _collection.front();
    }

    public Node<T> back() throws NullPointerException {
        return _collection.back();
    }

    public Node<T> middle() throws NullPointerException {
        return _collection.middle();
    }

    public void print() {
        _collection.print();
    }

    public boolean contains(T element) {
        return _collection.contains(element);
    }

    public T get(int index) throws NullPointerException {
        return _collection.get(index);
    }

    public int position(T element) {
        return _collection.position(element);
    }

    public int node_position(Node node) {
        return _collection.node_position(node);
    }

    public void clear() {
        _collection.clear();
    }

    public void erase_at(int position) {
        _collection.erase_at(position);
    }

    public void remove(T element) {
        _collection.remove(element);
    }

    public Node<T> node(T element) throws NullPointerException {
        return _collection.node(element);
    }

    public Node<T> node(int index) throws NullPointerException {
        return _collection.node(index);
    }

    @Override
    public String toString() throws NullPointerException {
        return _collection.toString();
    }

    @Override
    public int hashCode() {
        return _collection.hashCode();
    }

    @Override
    @SuppressWarnings("EqualsWhichDoesntCheckParameterClass")
    public boolean equals(Object obj) {
        return _collection.equals(obj);
    }
    
    public void dispose(){
        this._collection.clear();
        this._collection = null;
    }
      
    
}
