package StringBuilder;

public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tonny");
        System.out.println(sb);

        // Character at inddex 0
        System.out.println(sb.charAt(0));

        // set Char at index
        sb.setCharAt(0,'k');
        System.out.println(sb);

        // Inserting new character
        sb.insert(0, 's');
        sb.insert(2, 'a');
        System.out.println(sb);


        sb.setCharAt(3, 'u');
        System.out.println(sb);

        // Deleting the character or substring
        sb.delete(2, 4);
        
        System.out.println(sb);


        // appending
        sb.append(2);
        sb.append("d");
        sb.append('s');
        sb.append(2);
        sb.append("f");
        sb.append("u");
        System.out.println(sb);
        System.out.println(sb.length());
    }
    
}
