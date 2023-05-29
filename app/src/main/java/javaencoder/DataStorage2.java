package javaencoder;

import java.util.*;


public class DataStorage2 {
    
    private HashMap<String, Integer> hm = new HashMap<String, Integer>();

    public HashMap<String,Integer> getDataMap(){
        // Alphabets
        hm.put("A", new Integer(0));
        hm.put("B", new Integer(1));
        hm.put("C", new Integer(2));
        hm.put("D", new Integer(3));
        hm.put("E", new Integer(4));
        hm.put("F", new Integer(5));
        hm.put("G", new Integer(6));
        hm.put("H", new Integer(7));
        hm.put("I", new Integer(8));
        hm.put("J", new Integer(9));
        hm.put("K", new Integer(10));
        hm.put("L", new Integer(11));
        hm.put("M", new Integer(12));
        hm.put("N", new Integer(13));
        hm.put("O", new Integer(14));
        hm.put("P", new Integer(15));
        hm.put("Q", new Integer(16));
        hm.put("R", new Integer(17));
        hm.put("S", new Integer(18));
        hm.put("T", new Integer(19));
        hm.put("U", new Integer(20));
        hm.put("V", new Integer(21));
        hm.put("W", new Integer(22));
        hm.put("X", new Integer(23));
        hm.put("Y", new Integer(24));
        hm.put("Z", new Integer(25));
        
        // Numbers
        hm.put("0", new Integer(26));
        hm.put("1", new Integer(27));
        hm.put("2", new Integer(28));
        hm.put("3", new Integer(29));
        hm.put("4", new Integer(30));
        hm.put("5", new Integer(31));
        hm.put("6", new Integer(32));
        hm.put("7", new Integer(33));
        hm.put("8", new Integer(34));
        hm.put("9", new Integer(35));

        // Others
        hm.put("(", new Integer(36));
        hm.put(")", new Integer(37));
        hm.put("*", new Integer(38));
        hm.put("+", new Integer(39));
        hm.put(",", new Integer(40));
        hm.put("-", new Integer(41));
        hm.put(".", new Integer(42));
        hm.put("/", new Integer(43));

        return hm;
    }
    
}