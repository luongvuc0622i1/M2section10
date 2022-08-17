package arrayList;

import static org.junit.jupiter.api.Assertions.*;

class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<>();
        listInteger.add(1);
        listInteger.add(5);
        listInteger.add(2);
        System.out.println(listInteger);
        listInteger.remove(1);
        System.out.println(listInteger);
        System.out.println(listInteger.size());
        System.out.println(listInteger.clone());
        listInteger.contains(listInteger); ///
        listInteger.ensureCapacity(10); ///
        System.out.println(listInteger.get(1));
        listInteger.clear();
        System.out.println(listInteger);
    }
}