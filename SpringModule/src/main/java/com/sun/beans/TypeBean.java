package com.sun.beans;

import java.util.*;

/**
 * @author sunjun
 * @create 2020-08-28 11:38
 */
public class TypeBean {
    private String[] strs;
    private List<Student> list;
    private Set<String> set;
    private Map<String, Teacher> map;
    private Properties properties;

    public void printArray(){
        for (String str : strs) {
            System.out.print(str+"\t");
        }
    }

    public void printList(){
        for (Student student : list) {
            System.out.println(student);
        }
    }

    public void printMap(){
        Set<Map.Entry<String, Teacher>> entries = map.entrySet();
        Iterator<Map.Entry<String, Teacher>> iterator = entries.iterator();
        while(iterator.hasNext()){
            Map.Entry<String, Teacher> next = iterator.next();
            System.out.println(next.getKey()+":"+next.getValue());
        }
//        System.out.println(map);
    }

    public void printPro(){
        String a = (String) properties.get("A");
        String b = (String) properties.get("B");
        System.out.println("A:"+a+";B:"+b);
    }

    public void printSet(){
        Iterator<String> iterator = set.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+"\t");
        }
    }

    public String[] getStrs() {
        return strs;
    }

    public void setStrs(String[] strs) {
        this.strs = strs;
    }

    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    public Set<String> getSet() {
        return set;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Map<String, Teacher> getMap() {
        return map;
    }

    public void setMap(Map<String, Teacher> map) {
        this.map = map;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
