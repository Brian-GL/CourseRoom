/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.collections;

import data.structures.Node;

public class DoublyLinkedList<T>{
    
    private Node<T> _front;
    private Node<T> _middle;
    private Node<T> _back;
    private int _size;

    //Public constructors

    public DoublyLinkedList() { 
        _size = 0;
    }

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public DoublyLinkedList(T[] array) {
       _size = 0;
        for(T value:array){
            this.push_back(value);
        }
    }

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public DoublyLinkedList(Collection<T> collection) {
        this._size = 0;

        Node<T> middle = collection.list().middle();

        if(middle != null) {

            this.push_back(middle.element());
            
            Node<T> go_down = middle.previous();
            Node<T> go_up = middle.next();

            while(go_down != null || go_up != null) {

                if(go_down != null) {
                    push_front(go_down.element());
                    go_down = go_down.previous();
                }
                if(go_up != null) {
                    push_back(go_up.element());
                    go_up = go_up.next();
                }
            }
        }
    }
    

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public DoublyLinkedList(DoublyLinkedList<T> list) {
        this._size = 0;

        Node<T> middle = list.middle();

        if(middle != null) {

            this.push_back(middle.element());
            
            Node<T> go_down = middle.previous();
            Node<T> go_up = middle.next();

            while(go_down != null || go_up != null) {

                if(go_down != null) {
                    push_front(go_down.element());
                    go_down = go_down.previous();
                }
                if(go_up != null) {
                    push_back(go_up.element());
                    go_up = go_up.next();
                }
            }
        }
    }

    //Public Methods

    public boolean is_empty() {return this._front == null;}
    
    public int size() {return this._size;}

    public T first() throws NullPointerException {return (this._front != null) ? this._front.element() : null;}

    public T last() throws NullPointerException {return (this._back != null) ? this._back.element() : null;}

    public T medium() throws NullPointerException {return (this._middle != null) ? this._middle.element() : null;}

    public Node<T> front() throws NullPointerException{ return this._front; }

    public Node<T> back() throws NullPointerException { return this._back; }

    public Node<T> middle() throws NullPointerException { return this._middle; }

    
    public T delist() throws NullPointerException{
        if(!is_empty()) {
            T auxiliar = this._front.element();
            pop_front();
            return auxiliar;
        }
       return null;
    }

    
    public T unlist() throws NullPointerException{
        if(!is_empty()) {
            T auxiliar = this._back.element();
            pop_back();
            return auxiliar;
        }
        return null;
    }
    
    public void push_back(T ... elements) {
        for(T element : elements){
            this._size = this._size + 1;
            if(is_empty()) {
                Node<T> node = new Node<>(element);
                this._front = this._back = this._middle = node;
            }
            else {
                Node<T> node = new Node<>(this._back,element,null);
                this._back.next(node);
                this._back = node;
                if(this._size % 2 != 0){
                    this._middle = this._middle.next();
                }
            }
        }
    }

    public void push_front(T ... elements) {
        for(T element: elements){
            this._size = this._size + 1;
            if(is_empty()) {
                Node<T> node = new Node<>(element);
                this._front = this._back = this._middle = node;
            }
            else {
                Node<T> node = new Node<>(null,element,this._front);
                this._front.previous(node);
                this._front = node;
                if(this._size % 2 == 0){
                    this._middle = this._middle.previous();
                }
            }
        }
    }

    public void print(){
        Node<T> iterator = this._front;
        while(iterator != null){
            System.out.println(iterator.element());
            iterator = iterator.next();
        }
    }
    
    
    public boolean contains(T element) {

        if(_size == 0){
            return false;
        }
        if(_size == 1){
            return this._front.element().equals(element);
        }
        if(_size == 2){
            return this._front.element().equals(element) || this._back.element().equals(element);
        }
        else{
            Node<T> first = this._front;
            Node<T> last = this._back;

            int middle_index = (this._size)/2;
            
            if(middle_index % 2 == 0){
                for (int i = 0; i < middle_index; i++) {

                    if (first.element().equals(element)) {
                        return true;
                    }

                    if (last.element().equals(element)) {
                        return true;
                    }

                    first = first.next();
                    last = last.previous();
                }
                return false;
            }else{
                for(int i = 0; i < middle_index;i++) {

                    if(first.element().equals(element)){
                        return true;
                    }

                    if(last.element().equals(element)){
                        return true;
                    }

                    first = first.next();
                    last = last.previous();
                }
                
                return _middle.element().equals(element);
            }
        }   
    }
    
    
    public boolean add_front(T element){
        boolean contains = contains(element);
        if(!contains){
            push_front(element);
        }
        return contains;
    }
    
    public boolean add_back(T element){
        boolean contains = contains(element);
        if(!contains){
            push_back(element);
        }
        return contains;
    }

    
    public T get(int index) throws NullPointerException {
       if(!is_empty()){
            int real_index = index % this._size;
            if(real_index == 0){
                return this._front.element();
            }
            else if(real_index == _size-1) {
                return this._back.element();
            }
            else { 
                int middle_index = (this._size % 2 != 0) ? (this._size/2) : (this._size/2)-1;
                
                int difference_front = Math.abs(real_index-1);
                int difference_middle = Math.abs(real_index-middle_index);
                int difference_back = Math.abs(real_index-(_size-2));
                
                //Difference Front Is The Best
                if(is_best(difference_front, difference_middle, difference_back)) {
                    Node<T> auxiliar = this._front.next();
                    for(int i = 1; i < real_index;i++){
                        auxiliar = auxiliar.next();
                    }
                    return auxiliar.element();
                }
                //Difference Back Is The Best
                else if(is_best(difference_back, difference_front, difference_middle)){
                    Node<T> auxiliar = this._back.previous();
                    for(int i = this._size-2; i > real_index;i--){
                        auxiliar = auxiliar.previous();
                    }
                    return auxiliar.element();
                }
                //Difference Middle Is The Best
                else{
                    if(real_index > middle_index){
                        Node<T> auxiliar = this._middle;
                        for(int i = middle_index; i < real_index;i++){
                            auxiliar = auxiliar.next();
                        }
                        return auxiliar.element();
                    }else if (real_index < middle_index){
                        Node<T> auxiliar = this._middle;
                        for(int i = middle_index; i > real_index;i--){
                            auxiliar = auxiliar.previous();
                        }
                        return auxiliar.element();
                    }else{
                        return this._middle.element();
                    }
                }
            }
        }

        return null;
    }

    
    public void replace(T element_to_replace,T replacement){

        Node<T> node = node(element_to_replace);

        if(node != null){
            node.element(replacement);
        }
        
    }

    
    public void replacing(T element_to_replace, T replacement) {
        
        if(_size == 0){
            return;
        }
        if(_size == 1){
            if(_front.element().equals(element_to_replace)){
                _front.element(replacement);
            }
        }
        if(_size == 2){
            if(_front.element().equals(element_to_replace)){
                _front.element(replacement);
            }
            if(_back.element().equals(element_to_replace)){
                _back.element(replacement);
            }
        }
        else{
            Node<T> first = this._front;
            Node<T> last = this._back;

            int middle_index = (this._size)/2;
            
            if(middle_index % 2 == 0){
                for (int i = 0; i < middle_index; i++) {

                    if (first.element().equals(element_to_replace)) {
                        first.element(replacement);
                    }

                    if (last.element().equals(element_to_replace)) {
                        last.element(replacement);
                    }

                    first = first.next();
                    last = last.previous();
                }
            }else{
                for(int i = 0; i < middle_index;i++) {

                    if(first.element().equals(element_to_replace)){
                        first.element(replacement);
                    }

                    if(last.element().equals(element_to_replace)) {
                        last.element(replacement);
                    }

                    first = first.next();
                    last = last.previous();
                }
                
               if(_middle.element().equals(element_to_replace)){
                   _middle.element(replacement);
               }
            }
            
        }   
    }

    
    public void replace(int position,T replacement){

        Node<T> node = node(position);

        if(node != null){
            node.element(replacement);
        }
        
    }

    
    public void superSede(T element_to_replace, T replacement) {
        if(!contains(replacement)){
            replace(element_to_replace,replacement);
        } 
    }

    
    public void  superSede(int position,T replacement) {
        if(!contains(replacement)) {
            replace(position,replacement);
        } 
    }

    
    public void swap(int firstPosition, int secondPosition){
        if(!is_empty()){
            if(firstPosition != secondPosition){

                Node<T> first = node(firstPosition);
                Node<T> second = node(secondPosition);

                T auxiliar = second.element();
                second.element(first.element());
                first.element(auxiliar);
            }
        }
    }

    
    public void swap(T firstElement, T secondElement){
        if(!is_empty()){

            Node<T> first_node = node(firstElement);
            Node<T> second_node = node(secondElement);

            if(first_node != null && second_node != null) {

                T auxiliar = first_node.element();
                first_node.element(second_node.element());
                second_node.element(auxiliar);
            }
        }
    }

    
    public int position(T element){
        if(_size == 0){
            return -1;
        }
        if(_size == 1){
            return this._front.element().equals(element) ? 0 : -1;
        }
        if(_size == 2){
            return this._front.element().equals(element) ? 0  : (this._back.element().equals(element) ? 1 : -1);
        }
        else{
            Node<T> first = this._front;
            Node<T> last = this._back;

            int middle_index = (this._size)/2;
            
            if(middle_index % 2 == 0){
                int first_index = 0;
                int last_index = _size-1;
                for (int i = 0; i < middle_index; i++) {

                    if (first.element().equals(element)) {
                        return first_index;
                    }

                    if (last.element().equals(element)) {
                        return last_index;
                    }

                    first_index++;
                    last_index--;
                    first = first.next();
                    last = last.previous();
                }
                return -1;
            }else{
                int first_index = 0;
                int last_index = _size-1;
                for (int i = 0; i < middle_index; i++) {

                    if (first.element().equals(element)) {
                        return first_index;
                    }

                    if (last.element().equals(element)) {
                        return last_index;
                    }

                    first_index++;
                    last_index--;
                    first = first.next();
                    last = last.previous();
                }
                
                return _middle.element().equals(element) ? middle_index : -1;
            }
        }  
    }

    
    public int node_position(Node node){
        if(_size == 0){
            return -1;
        }
        if(_size == 1){
            return this._front.equals(node) ? 0 : -1;
        }
        if(_size == 2){
            return this._front.equals(node) ? 0  : (this._back.equals(node) ? 1 : -1);
        }
        else{
            Node<T> first = this._front;
            Node<T> last = this._back;

            int middle_index = (this._size)/2;
            
            if(middle_index % 2 == 0){
                int first_index = 0;
                int last_index = _size-1;
                for (int i = 0; i < middle_index; i++) {

                    if (first.equals(node)) {
                        return first_index;
                    }

                    if (last.equals(node)) {
                        return last_index;
                    }

                    first_index++;
                    last_index--;
                    first = first.next();
                    last = last.previous();
                }
                return -1;
            }else{
                int first_index = 0;
                int last_index = _size-1;
                for (int i = 0; i < middle_index; i++) {

                    if (first.equals(node)) {
                        return first_index;
                    }

                    if (last.equals(node)) {
                        return last_index;
                    }

                    first_index++;
                    last_index--;
                    first = first.next();
                    last = last.previous();
                }
                
                return _middle.equals(node) ? middle_index : -1;
            }
        }  
    }
    
    
    public void  pop_front(){
        if(!is_empty()){
            if(this._size % 2 == 0 && this.middle() != null){
                this._middle = this._middle.next();
            }
            
            Node<T> erased_node = this._front;
            this._front = erased_node.next();
           
            
            if(this._front != null){
                
                this._front.previous(null);
                erased_node.dispose();
                erased_node = null;
            }

            --this._size;

        }
    }

    
    public void pop_back(){
        if(!is_empty()){
            
            if(this._size % 2 != 0 && this.middle() != null){
                this._middle = this._middle.previous();
            }
            
            Node<T> erased_node = this._back;
            this._back = erased_node.previous();
           
            
            if(this._back != null){
                
                this._back.next(null);
                erased_node.dispose();
                erased_node = null;
            }
            
            --this._size;
        }
    }

    
    
    public void join_back(DoublyLinkedList<T> list){
        if(list != null){
            Node<T> auxiliar = list.front();

            while(auxiliar != null) {
                this.push_back(auxiliar.element());
                auxiliar = auxiliar.next();
            }
        }
    }

    
    public void join_front(DoublyLinkedList<T> list){
        if(list != null){
            Node<T> auxiliar = list.front();

            while(auxiliar != null) {
                this.push_front(auxiliar.element());
                auxiliar = auxiliar.next();
            }
        }
    }

    
    public void concatenate_front(DoublyLinkedList<T> list){
        if(list != null){
            Node<T> auxiliar = list.front();

            while(auxiliar != null) {
                    this.add_front(auxiliar.element());
                    auxiliar = auxiliar.next();
            }
        }
    }

    
    public void concatenate_back(DoublyLinkedList<T> list){
        if(list != null){
            Node<T> auxiliar = list.front();

            while(auxiliar != null) {
                    this.add_back(auxiliar.element());
                    auxiliar = auxiliar.next();
            }
        }
    }

    
    public void reverse(){

        if(_size <= 1){
            return;
        }
        if(_size == 2){
            T first_value = _front.element();
            _front.element(_back.element());
            _back.element(first_value);
        }
        else{
            Node<T> first = this._front;
            Node<T> last = this._back;

            int middle_index = (this._size)/2;
            
            for (int i = 0; i < middle_index; i++) {

                T first_value = first.element();
                first.element(last.element());
                last.element(first_value);

                first = first.next();
                last = last.previous();
            }
        }  
    }

    
    public void clear(){
        if(!is_empty()){
            while(!is_empty()) {
                pop_front();
            }
            this._size = 0;
            this._back = this._middle  = this._front = null;
        }
    }
    
    private void update_middle(){
        Node<T> aux = this._front;
        int middle_index = ((this._size % 2 == 0)) ? ((this._size) / 2) - 1 : (this._size) / 2;

        for (int i = 0; i < middle_index; i++) {
            aux = aux.next();
        }

        this._middle = aux;
 
    }

    
    public void insert_next(Node<T> node, T element) {
        if(!is_empty()){

            if(node != null) {
                if(node.equals(this._back)){
                    push_back(element);
                }
                else{
                    Node<T> next_node = node.next();
                    Node<T> new_node = new Node<>(node,element,next_node);

                    node.next(new_node);
                    if(next_node != null){
                        next_node.previous(new_node);
                    }

                    this._size = this._size + 1;
                    
                    update_middle();
                }
            }
        }
    }

    
    public void insert_previous(Node<T> node, T element){
        if(!is_empty()){

            if(node != null) {
                if(node.equals(this._front)){
                    push_front(element);
                }
                else{

                    Node<T> previous_node = node.previous();
                    Node<T> new_node = new Node<>(previous_node,element,node);

                    node.previous(new_node);
                    if(previous_node != null){
                        previous_node.next(new_node);
                    }

                    this._size = this._size + 1;
                    update_middle();
                }
            }
        }
    }

    
    public void insert_at(int position, T element){
        if(!is_empty()){
            position = position % this._size;
            if(position == 0){
                push_front(element);
            }
            else if(position == this._size-1){
                push_back(element);
            }
            else{
                Node<T> node = node(position);
                this.insert_previous(node, element);
            }
        }
    }

    
    public void introduce_at(int index, T element){

        if(!contains(element)){
            insert_at(index,element);
        }
    }

    
    public void erase_at(int position){
        if(!is_empty()){

            int real_position = position % this._size;

            if(real_position == 0){
                pop_front();
            }

            else if(real_position == (this._size -1) ){
                pop_back();
            }

            else{

                Node<T> node = node(position);
                if(node != null){
                    Node<T> previous_node = node.previous();
                    Node<T> next_node = node.next();

                    if(previous_node != null){
                        previous_node.next(next_node);
                    }
                    
                    if(next_node != null){
                        next_node.previous(previous_node);
                    }

                    node.dispose();
                    node = null;

                    this._size--;
                    update_middle();
                }
               
            }
        }
    }

    
    public void remove(T element) {
        if (!is_empty()) {
            if (this.first().equals(element)) {
                pop_front();
            } else if (this.last().equals(element)) {
                pop_back();
            } else {

                Node<T> node = node(element);
                if (node != null) {
                    Node<T> previous_node = node.previous();
                    Node<T> next_node = node.next();

                    if (previous_node != null) {
                        previous_node.next(next_node);
                    }

                    if (next_node != null) {
                        next_node.previous(previous_node);
                    }

                    node.dispose();
                    node = null;

                    this._size--;
                    update_middle();
                }

            }
        }
    }
    
    
    public Node<T> node(T element) throws NullPointerException{
         
        if (_size == 0) {
            return null;
        }
        if (_size == 1) {
            return this.first().equals(element) ? _front : null;
        }
        if (_size == 2) {
            return this.first().equals(element) ? _front : (this.last().equals(element) ? _back : null);
        } else {
            Node<T> first = this._front;
            Node<T> last = this._back;

            int middle_index = (this._size) / 2;

            if (middle_index % 2 == 0) {
                for (int i = 0; i < middle_index; i++) {

                    if (first.element().equals(element)) {
                        return first;
                    }

                    if (last.element().equals(element)) {
                        return last;
                    }

                    first = first.next();
                    last = last.previous();
                }
                return null;
            } else {
                for (int i = 0; i < middle_index; i++) {

                    if (first.element().equals(element)) {
                        return first;
                    }

                    if (last.element().equals(element)) {
                        return last;
                    }

                    first = first.next();
                    last = last.previous();
                }

                return _middle.element().equals(element) ? _middle : null;
            }
        }
        
    }
    
    
    public Node<T> node(int index) throws NullPointerException{
        if(!is_empty()){
            int real_index = index % this._size;
            if(real_index == 0){
                return this._front;
            }
            else if(real_index == _size-1) {
                return this._back;
            }
            else { 
                int middle_index = (this._size % 2 != 0) ? (this._size/2) : (this._size/2)-1;
                
                int difference_front = Math.abs(real_index-1);
                int difference_middle = Math.abs(real_index-middle_index);
                int difference_back = Math.abs(real_index-(_size-2));
                
                //Difference Front Is The Best
                if(is_best(difference_front, difference_middle, difference_back)) {
                    Node<T> auxiliar = this._front.next();
                    for(int i = 1; i < real_index;i++){
                        auxiliar = auxiliar.next();
                    }
                    return auxiliar;
                }
                //Difference Back Is The Best
                else if(is_best(difference_back, difference_front, difference_middle)){
                    Node<T> auxiliar = this._back.previous();
                    for(int i = this._size-2; i > real_index;i--){
                        auxiliar = auxiliar.previous();
                    }
                    return auxiliar;
                }
                //Difference Middle Is The Best
                else{
                    if(real_index > middle_index){
                        Node<T> auxiliar = this._middle;
                        for(int i = middle_index; i < real_index;i++){
                            auxiliar = auxiliar.next();
                        }
                        return auxiliar;
                    }else if (real_index < middle_index){
                        Node<T> auxiliar = this._middle;
                        for(int i = middle_index; i > real_index;i--){
                            auxiliar = auxiliar.previous();
                        }
                        return auxiliar;
                    }else{
                        return this._middle;
                    }
                }
                
            }
        }

        return null;
    }

    //Override methods

    
    @Override
    public String toString() throws NullPointerException{

        String newString = new String();

        Node<T> auxiliar = this._front;

        while(auxiliar != null){
                newString += "["+auxiliar.element()+"]\n";
                auxiliar = auxiliar.next();
        }
        return newString;
    }

    
    @Override
    public int hashCode() {
        int hash = 7;
        Node<T> aux = this._front;
        while(aux != null){
            hash = 53 * hash + aux.element().hashCode();
            aux = aux.next();
        }
        
        hash = 53 * hash + (int) (this._size ^ (32 >>> this._size));
        return hash;
    }

    
    @Override
    public boolean equals(Object obj) {
        if (obj == null) 
            return false;
        
        if (this == obj) 
            return true;

        if (!(obj instanceof DoublyLinkedList<?>)) 
            return false; 
        
         DoublyLinkedList<T> other = (DoublyLinkedList<T>) obj;
         
         if(other.size() == this._size){
            Node<T> thisAux = this._front;
            Node<T> otherAux = other.front();
            
            while(thisAux != null){
                
                if(!thisAux.element().equals(otherAux.element()))
                    return false;
                
                thisAux = thisAux.next();
                otherAux = otherAux.next();
             
            }
            
            return true;
         }
         
         return false;
         
    }
    
    private boolean is_best(int first, int second, int third){
        return first <=  second && first <= third;
    }

}
    

