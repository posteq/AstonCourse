package main.java.by.aston.collections.arraylist;

public class Main {

    public static void main(String[] args) {
        MyArrayList<String> myList = new MyArrayList<>();
        myList.add("A");
        myList.add("B");
        myList.add("C");
        myList.add("D");
        myList.remove(0);

        System.out.println(myList);

        myList.addAll(myList);

        System.out.println("Element index 2 : " + myList.get(2));

        System.out.println("ArrayList size: " + myList.size());
        System.out.println(myList);
    }


}
