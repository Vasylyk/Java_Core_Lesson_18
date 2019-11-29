package task2;

import java.util.Objects;

public class MyEntry <E, V> {
    E ob1;
    V ob2;

    public MyEntry(E ob1, V ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    public E getOb1() {
        return ob1;
    }

    public void setOb1(E ob1) {
        this.ob1 = ob1;
    }

    public V getOb2() {
        return ob2;
    }

    public void setOb2(V ob2) {
        this.ob2 = ob2;
    }

    @Override
    public String toString() {
        return "MyEntry{" +
                "ob1=" + ob1 +
                ", ob2=" + ob2 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyEntry<?, ?> myEntry = (MyEntry<?, ?>) o;
        return Objects.equals(ob1, myEntry.ob1) &&
                Objects.equals(ob2, myEntry.ob2);
    }

    @Override
    public int hashCode() {

        return Objects.hash(ob1, ob2);
    }
}
