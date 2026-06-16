package Strings;

public class SubString {
    public static void main(String[] args) {
        
        String sentence = "My name is Krishna";
        // substring(beg index, end index)
        String name = sentence.substring(0,sentence.length());
        String name1 = sentence.substring(0);  // by default it will take the last index
        System.out.println(name);
        System.out.println(name1);
    }
    
}
