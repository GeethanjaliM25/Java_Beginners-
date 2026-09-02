public class StringDemo {
    public static void main(String[] args) {
        String text = "Java Programming";

        String lower = text.toLowerCase();
        String upper = text.toUpperCase();
        int length = text.length();
        String concat = text.concat(" is fun");
        String replace = text.replace('a', '@');
        boolean equals = text.equals("Java Programming");

        System.out.println("Original String: " + text);
        System.out.println("Lowercase: " + lower);
        System.out.println("Uppercase: " + upper);
        System.out.println("Length: " + length);
        System.out.println("Concatenation: " + concat);
        System.out.println("Replace: " + replace);
        System.out.println("Equals: " + equals);
    }
}
