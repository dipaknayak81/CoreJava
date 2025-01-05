package com.nt.collection;


import java.util.*;
import java.util.Collections;

public class ImmutableListDemo {
    public static void main(String[] args) {

        List<String> l1 = new ArrayList<String>();
        l1.add("A");
        l1.add("B");
        List<String> l2  = Collections.unmodifiableList(l1);
        //System.out.println(l2);
        List<String> immutable = List.of("ABc","DEF");
        //immutable.add("GHI");
        //System.out.println(immutable);
        List<String>  list = Arrays.asList("A","B","C");
        //list.add("D");
        System.out.println(list);

        System.out.println("===========Immutable - SET===============");
        Set<String> s1 = new HashSet<>();
        s1.add("A");
        s1.add("B");
        Set<String> set2 = Collections.unmodifiableSet(s1);
        Set<String>  s2 = Set.of("A","B","C");

        System.out.println("===========Immutable - MAP===============");
        Map<String,Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        Map<String,Integer> map1 = Collections.unmodifiableMap(map);
        Map<String,Integer> map2 = Map.of("a",2,"b",1);
        //map1.put("C",3);
        System.out.println(map1);


    }
}
