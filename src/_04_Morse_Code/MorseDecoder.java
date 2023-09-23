package _04_Morse_Code;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

import _03_Intro_to_Binary_Trees.BinaryTree;
import _03_Intro_to_Binary_Trees.Node;

public class MorseDecoder {

    BinaryTree<MorseCode> mcTree = new BinaryTree<MorseCode>();

    public static void main(String[] args) {

        MorseDecoder md = new MorseDecoder();
        md.initialize();
        md.decode("-.-- --- ..- .- .-. . .- -- .- --.. .. -. --.");
        
        Scanner scans = new Scanner(System.in);
        System.out.println("Enter a message in morse code: (seperate each letter with a space) \n");
        String input = scans.nextLine() + " ";
        md.decode(input);
    }

    public void initialize() {

        mcTree.insert(new MorseCode("start", ""));
        mcTree.insert(new MorseCode("e", "."));
        mcTree.insert(new MorseCode("t", "-"));

        mcTree.insert(new MorseCode("i", ".."));
        mcTree.insert(new MorseCode("a", ".-"));
        mcTree.insert(new MorseCode("n", "-."));
        mcTree.insert(new MorseCode("m", "--"));

        mcTree.insert(new MorseCode("s", "..."));
        mcTree.insert(new MorseCode("u", "..-"));
        mcTree.insert(new MorseCode("r", ".-."));
        mcTree.insert(new MorseCode("w", ".--"));
        mcTree.insert(new MorseCode("d", "-.."));
        mcTree.insert(new MorseCode("k", "-.-"));
        mcTree.insert(new MorseCode("g", "--."));
        mcTree.insert(new MorseCode("o", "---"));

        mcTree.insert(new MorseCode("h", "...."));
        mcTree.insert(new MorseCode("v", "...-"));
        mcTree.insert(new MorseCode("f", "..-."));
        mcTree.insert(new MorseCode("l", ".-.."));
        mcTree.insert(new MorseCode("p", ".--."));
        mcTree.insert(new MorseCode("j", ".---"));
        mcTree.insert(new MorseCode("b", "-..."));
        mcTree.insert(new MorseCode("x", "-..-"));
        mcTree.insert(new MorseCode("c", "-.-."));
        mcTree.insert(new MorseCode("y", "-.--"));
        mcTree.insert(new MorseCode("z", "--.."));
        mcTree.insert(new MorseCode("q", "--.-"));

        mcTree.printVertical();

    }

    /*
     * 1.) See if you can decode the following message using the binary tree and
     * print it to the console:
     * 
     * -.-- --- ..- .- .-. . .- -- .- --.. .. -. --.
     * 
     * 2.) Then use the binary tree and the scanner class to create a morse code
     * translator. The user should be able to type multiple letters in morse
     * code on a single line and have it repeated back to them, decoded into the
     * english alphabet.
     * 
     */
    void decode(String morseCode) {
        //morseCode = "-.-- --- ..- .- .-. . .- -- .- --.. .. -. --.";
        //45
        morseCode = morseCode + " ";
        ArrayList<String> stringBits = new ArrayList<>();
        stringBits.add("");
        int lastIndex = 0;
        for(int i = 0; i<morseCode.lastIndexOf(" "); i++) {
        
        stringBits.add(morseCode.substring(i , morseCode.indexOf(" ", i+1)));
       // System.out.println("previousSpace: " + i+lastIndex + ", next space: " + morseCode.indexOf(" ", lastIndex+i+1));
        i = morseCode.indexOf(" ", i+1);
        }
        //NEED TO FIX ERROR
        
        for(int i = 0; i<stringBits.size(); i++){
        	System.out.println(stringBits.get(i));
        }
        
        //System.out.println(mcTree.getRoot().getValue().getDecoded());
        //mcTree.search(stringBits.get(0));
        //mcTree.search(value);
        //mcTree.morseCode.
        String decoded = "";
        for(int i=0; i<stringBits.size(); i++) {
        	MorseCode coded = new MorseCode(stringBits.get(i));
        	Node<MorseCode> codedNode = mcTree.search(coded);
        	decoded += codedNode.getValue().getDecoded();
        }
        
        System.out.println(decoded);
        
        
        
        
    }

}
