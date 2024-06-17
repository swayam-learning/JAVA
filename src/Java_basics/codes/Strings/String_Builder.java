package Java_basics.codes.Strings;

public class String_Builder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
             sb.append(ch);
             // it basically modifies the same object rather than creating new objects  for appending something
        }
        System.out.println(sb.toString());
    }
}
