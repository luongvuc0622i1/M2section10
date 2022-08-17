package linkedList;

import javax.xml.soap.Node;
import java.util.LinkedList;

public class MyLinkedList extends LinkedList {
    private Node head;
    private int numNodes;

    public MyLinkedList() {
    }

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    @Override
    public void add(int index, Object element) {
        super.add(index, element);
    }

    @Override
    public void addFirst(Object o) {
        super.addFirst(o);
    }

    @Override
    public void addLast(Object o) {
        super.addLast(o);
    }

    @Override
    public Object remove(int index) {
        return super.remove(index);
    }

    @Override
    public boolean remove(Object o) {
        return super.remove(o);
    }

    @Override
    public int size() {
        return super.size();
    }

    @Override
    public Object clone() {
        return super.clone();
    }

    @Override
    public boolean contains(Object o) {
        return super.contains(o);
    }

    @Override
    public int indexOf(Object o) {
        return super.indexOf(o);
    }

    @Override
    public boolean add(Object o) {
        return super.add(o);
    }

    @Override
    public Object get(int index) {
        return super.get(index);
    }

    @Override
    public Object getFirst() {
        return super.getFirst();
    }

    @Override
    public Object getLast() {
        return super.getLast();
    }

    @Override
    public void clear() {
        super.clear();
    }
}
