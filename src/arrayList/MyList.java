package arrayList;

import java.util.ArrayList;

public class MyList<E> extends ArrayList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }

    @Override
    public void add(int index, E element) {
        super.add(index, element);
    }

    @Override
    public E remove(int index) {
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
    public boolean add(E e) {
        return super.add(e);
    }

    @Override
    public void ensureCapacity(int minCapacity) {
        super.ensureCapacity(minCapacity);
    }

    @Override
    public E get(int index) {
        return super.get(index);
    }

    @Override
    public void clear() {
        super.clear();
    }
}
