package com.nt;

import java.util.HashMap;
import java.util.Map;

final class Student{
    private final String name;
    private final int regNo;
    private final Map<String, String> metadata;
    public Student(String name, int regNo,
                   Map<String, String> metadata)
    {

        // This keyword refers to current instance itself
        this.name = name;
        this.regNo = regNo;

        // Creating Map object with reference to HashMap
        // Declaring object of string type
        Map<String, String> tempMap = new HashMap<>();

        // Iterating using for-each loop
        for (Map.Entry<String, String> entry :
                metadata.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }

        this.metadata = tempMap;
    }

    public String getName() {
        return name;
    }

    public int getRegNo() {
        return regNo;
    }

    public Map<String, String> getMetadata() {
        Map<String, String> tempMap = new HashMap<>();

        for (Map.Entry<String, String> entry :
                this.metadata.entrySet()) {
            tempMap.put(entry.getKey(), entry.getValue());
        }
        return tempMap;
    }
}
public class ImmutableClass {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "first");
        map.put("2", "second");
        Student student = new Student("ABC", 101, map);
        System.out.println(student.getName());
        System.out.println(student.getRegNo());
        System.out.println(student.getMetadata());
        map.put("3", "third");
        // Uncommenting below line causes error
        // student.regNo = 102;
        // Remains unchanged due to deep copy in constructor
        System.out.println(student.getMetadata());
        student.getMetadata().put("4", "fourth");
        // Remains unchanged due to deep copy in getter
        System.out.println(student.getMetadata());
    }
}
