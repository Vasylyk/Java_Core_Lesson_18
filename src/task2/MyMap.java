package task2;

import java.util.*;

public class MyMap <K, V> {
    private Map<K, V> myMap = new HashMap<>();

    public Map<K, V> getMyMap() {
        return myMap;
    }

    void addObject(K ob1, V ob2){
        MyEntry<K, V> myEntry = new MyEntry<>(ob1, ob2);
        myMap.put(myEntry.getOb1(), myEntry.getOb2());
    }

    void removeObjByKey (K ob1){
        Set<Map.Entry<K, V>> newSet = myMap.entrySet();
        Iterator<Map.Entry<K, V>> iterator = newSet.iterator();
        boolean flag = true;
        while (iterator.hasNext()){
            Map.Entry<K, V> myEntry = iterator.next();
            if (myEntry.getKey().equals(ob1)){
                iterator.remove();
                flag = false;
            }
        }
        if (flag){
            System.out.println("This key don`t exist");
        }
    }

    void removeObjByValue (V ob2){
        Set<Map.Entry<K, V>> newSet = myMap.entrySet();
        Iterator<Map.Entry<K, V>> iterator = newSet.iterator();
        boolean flag = true;
        while (iterator.hasNext()){
            Map.Entry<K, V> myEntry = iterator.next();
            if (myEntry.getValue().equals(ob2)){
                iterator.remove();
                flag = false;
            }
        }
        if (flag){
            System.out.println("This value don`t exist");
        }
    }

    void showSetOfKeys(){
        Set<Map.Entry<K, V>> newSet = myMap.entrySet();
        Iterator<Map.Entry<K, V>> iterator = newSet.iterator();
        Set<K> setOfKeys = new HashSet<>();
        while (iterator.hasNext()){
            setOfKeys.add(iterator.next().getKey());
        }
        System.out.println(setOfKeys);
    }

    void showListOfValues(){
        Set<Map.Entry<K, V>> newSet = myMap.entrySet();
        Iterator<Map.Entry<K, V>> iterator = newSet.iterator();
        List <V> listOfValues = new ArrayList<>();
        while (iterator.hasNext()){
            listOfValues.add(iterator.next().getValue());
        }
        System.out.println(listOfValues);
    }

    void showMap(){
        Set<Map.Entry<K, V>> newSet = myMap.entrySet();
        Iterator<Map.Entry<K, V>> iterator = newSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
