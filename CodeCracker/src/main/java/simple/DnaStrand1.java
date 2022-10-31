package simple;
import java.util.HashMap;
import java.lang.String;


    //Deoxyribonucleic acid (DNA) is a chemical found in the nucleus of cells and carries the "instructions" for the development and functioning of living organisms.
    //
    //If you want to know more: http://en.wikipedia.org/wiki/DNA
    //
    //In DNA strings, symbols "A" and "T" are complements of each other, as "C" and "G". Your function receives one side of the DNA (string, except for Haskell); you need to return the other complementary side. DNA strand is never empty or there is no DNA at all (again, except for Haskell).
    //
    //More similar exercise are found here: http://rosalind.info/problems/list-view/ (source)
    //
    //Example: (input --> output)
    //
    //"ATTGC" --> "TAACG"
    //"GTAT" --> "CATA"

public class DnaStrand1 {
    public static String makeComplement(String dna) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('A', 'T');
        map.put('T', 'A');
        map.put('C', 'G');
        map.put('G', 'C');
        String result = "";
        for (char i : dna.toCharArray()) {
            result += "" + map.get(i);
        }
        return result;
    }
    //Solution 2 ==>
    public static String makeComplement1(String dna) {
        dna = dna.replaceAll("A","Z");
        dna = dna.replaceAll("T","A");
        dna = dna.replaceAll("Z","T");
        dna = dna.replaceAll("C","Z");
        dna = dna.replaceAll("G","C");
        dna = dna.replaceAll("Z","G");
        return dna;
    }
}