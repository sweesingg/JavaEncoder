package javaencoder;

import java.util.*;


public class DataStorage {
    
    private HashMap<Integer, String> hm = new HashMap<Integer, String>();

    public HashMap<Integer,String> getDataMap(){
        // Alphabets
        hm.put(0, "A");
        hm.put(1, "B");
        hm.put(2, "C");
        hm.put(3, "D");
        hm.put(4, "E");
        hm.put(5, "F");
        hm.put(6, "G");
        hm.put(7, "H");
        hm.put(8, "I");
        hm.put(9, "J");
        hm.put(10, "K");
        hm.put(11, "L");
        hm.put(12, "M");
        hm.put(13, "N");
        hm.put(14, "O");
        hm.put(15, "P");
        hm.put(16, "Q");
        hm.put(17, "R");
        hm.put(18, "S");
        hm.put(19, "T");
        hm.put(20, "U");
        hm.put(21, "V");
        hm.put(22, "W");
        hm.put(23, "X");
        hm.put(24, "Y");
        hm.put(25, "Z");
        
        
        // Numbers
        hm.put(26, "0");
        hm.put(27, "1");
        hm.put(28, "2");
        hm.put(29, "3");
        hm.put(30, "4");
        hm.put(31, "5");
        hm.put(32, "6");
        hm.put(33, "7");
        hm.put(34, "8");
        hm.put(35, "9");


        // Others
        hm.put(36, "(");
        hm.put(37, ")");
        hm.put(38, "*");
        hm.put(39, "+");
        hm.put(40, ",");
        hm.put(41, "-");
        hm.put(42, ".");
        hm.put(43, "/");

        return hm;
    }

    public void insertHashMap (HashMap<Integer,String> newHM, int i){
        // Alphabets
        newHM.put(0 + i, "A");
        newHM.put(1 + i, "B");
        newHM.put(2 + i, "C");
        newHM.put(3 + i, "D");
        newHM.put(4 + i, "E");
        newHM.put(5 + i, "F");
        newHM.put(6 + i, "G");
        newHM.put(7 + i, "H");
        newHM.put(8 + i, "I");
        newHM.put(9 + i, "J");
        newHM.put(10 + i, "K");
        newHM.put(11 + i, "L");
        newHM.put(12 + i, "M");
        newHM.put(13 + i, "N");
        newHM.put(14 + i, "O");
        newHM.put(15 + i, "P");
        newHM.put(16 + i, "Q");
        newHM.put(17 + i, "R");
        newHM.put(18 + i, "S");
        newHM.put(19 + i, "T");
        newHM.put(20 + i, "U");
        newHM.put(21 + i, "V");
        newHM.put(22 + i, "W");
        newHM.put(23 + i, "X");
        newHM.put(24 + i, "Y");
        newHM.put(25 + i, "Z");
        
        // Numbers
        newHM.put(26 + i, "0");
        newHM.put(27 + i, "1");
        newHM.put(28 + i, "2");
        newHM.put(29 + i, "3");
        newHM.put(30 + i, "4");
        newHM.put(31 + i, "5");
        newHM.put(32 + i, "6");
        newHM.put(33 + i, "7");
        newHM.put(34 + i, "8");
        newHM.put(35 + i, "9");

        // Others
        newHM.put(36 + i, "(");
        newHM.put(37 + i, ")");
        newHM.put(38 + i, "*");
        newHM.put(39 + i, "+");
        newHM.put(40 + i, ",");
        newHM.put(41 + i, "-");
        newHM.put(42 + i, ".");
        newHM.put(43 + i, "/");
    }
    
}