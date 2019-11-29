package task2;

public class Main {
    public static void main(String[] args) {
        MyMap<Integer, String > myMap = new MyMap<>();
        myMap.addObject(1,"one");
        myMap.addObject(2,"two");
        myMap.addObject(3,"three");
        myMap.addObject(4,"four");
        myMap.addObject(5,"five");
        myMap.addObject(6,"six");
        myMap.addObject(7,"seven");
        myMap.removeObjByKey(2);
        myMap.removeObjByValue("four");
        System.out.println("Set of keys:");
        myMap.showSetOfKeys();
        System.out.println();
        System.out.println("List of values:");
        myMap.showListOfValues();
        System.out.println();
        System.out.println("Map:");
        myMap.showMap();
    }
}
