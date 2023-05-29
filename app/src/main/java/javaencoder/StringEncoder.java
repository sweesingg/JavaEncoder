/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package javaencoder;

import java.util.*;
import java.util.Map.Entry;

public class StringEncoder {
    // Creating empty hash map
    static DataStorage ds = new DataStorage();
    static int offsetValue;
    static String encodedText = "";
    static String decodedText = "";
    static HashMap<Integer,String> hm = ds.getDataMap();
    static HashMap<Integer,String> newHM = (HashMap<Integer,String>) hm.clone();
    
    public static void main(String[] args) {
        // Declarations
        int i = 0;
        int hmSize;
        String firstString = null; 


        // ------------- VARIABLES TO EDIT -------------
        String offsetCharacter = "B";
        String plainText = "HELLO WORLD";
        System.out.println("Offset Character: " + offsetCharacter);
        System.out.println("Text: " + plainText);
        // ------------- VARIABLES TO EDIT -------------


        // To retrieve offset index
        getOffsetValue(offsetCharacter);
        
        // Clear the cloned hashmap
        newHM.clear();

        // Hashmap size = 44
        hmSize = hm.entrySet().size();
        // System.out.println("Hashmap Size: " + hmSize);

        // Insert the offset index and values into the cloned hashmap
        for (i=0; i < offsetValue; i++){
            firstString = hm.get(hmSize-offsetValue+i);
            newHM.put(i, firstString);
        }
        // System.out.println("\nBEFORE: " + newHM);
        
        // Add in original hashmap (From "A" to "/")
        ds.insertHashMap(newHM, i);
        // System.out.println("\nAFTER: " + newHM);

        // Remove repeated index and values
        for (int j = 0; j < offsetValue; j++){
            newHM.remove(hmSize+j);
        }
        // System.out.println("\nAFTER POPPING: " + newHM);
        
        // 1 (True) - Encode
        // 0 (False) - Decode

        // ENCODE
        System.out.println("\n------- Encoded Text ------- ");
        encode(plainText);
        System.out.println(encodedText);
        
        // DECODE
        System.out.println("\n------- Decoded Text ------- ");
        decode(encodedText);
        System.out.println(decodedText);

    }

    public static void getOffsetValue(String value){
        for(Entry<Integer, String> entry: hm.entrySet()){
            if (entry.getValue()==value){
                offsetValue = entry.getKey();
                // System.out.println("OffsetValue: " + offsetValue);
            }
        }
    }

    public static void encode(String plainText){
        encodedText = encodeDecode(plainText, true);
    }

    public static void decode(String encodedText){
        decodedText = encodeDecode(encodedText, false);
    }

    public static String encodeDecode(String text, boolean type){
        // Variables
        String currentChar = "";
        String encodedDecodeString = "";

        for (int i=0; i < text.length(); i++){
            currentChar = String.valueOf(text.charAt(i));    
            // System.out.println("Current Character: " + currentChar);
            
            if (currentChar.contains(" ") || currentChar.isEmpty()){
                // Do nothing
                encodedDecodeString += " ";
                continue;
            }

            if (type){
                // Encode
                for (Entry<Integer,String> entry: hm.entrySet()){
                    if (entry.getValue().equals(currentChar)){
                        // System.out.print(newHM.get(entry.getKey()));
                        encodedDecodeString += newHM.get(entry.getKey());
                    }
                }

            }
            else if (type == false){
                // Decode
                for (Entry<Integer,String> entry: newHM.entrySet()){
                    if (entry.getValue().equals(currentChar)){
                        // System.out.print(newHM.get(entry.getKey()));
                        encodedDecodeString += hm.get(entry.getKey());
                    }
                }
            }
        }
        return encodedDecodeString;
    }

    
}
