public class meth {
    public static void main(String[] args) {
        // Creating Strings
        String s1 = "Hello";
        String s2 = new String("World");

        // Length & Basic Info
        System.out.println(s1.length());       // 5
        System.out.println(s1.isEmpty());      // false
        System.out.println(s1.charAt(1));      // 'e'
        System.out.println(s1.codePointAt(0)); // 72 (Unicode of 'H')

        // Comparison
        String a = "Java";
        String b = "java";
        System.out.println(a.equals(b));             // false
        System.out.println(a.equalsIgnoreCase(b));   // true
        System.out.println(a.compareTo(b));          // -32
        System.out.println(a.compareToIgnoreCase(b));// 0
        System.out.println(a.contains("av"));        // true
        System.out.println(a.startsWith("Ja"));      // true
        System.out.println(a.endsWith("va"));        // true

        // Substring
        String sub = "Programming";
        System.out.println(sub.substring(3));       // "gramming"
        System.out.println(sub.substring(0, 6));    // "Progra"

        // Searching
        String fruit = "Banana";
        System.out.println(fruit.indexOf('a'));         // 1
        System.out.println(fruit.indexOf("na"));        // 2
        System.out.println(fruit.indexOf("na", 3));     // 4
        System.out.println(fruit.lastIndexOf('a'));     // 5

        // Modification
        String s = " Hello Java ";
        System.out.println(s.trim());                   // "Hello Java"
        System.out.println(s.toUpperCase());            // " HELLO JAVA "
        System.out.println(s.toLowerCase());            // " hello java "
        System.out.println(s.replace('a','o'));         // " Hello Jovo "
        System.out.println(s.replace("Java","World"));  // " Hello World "

        // Splitting & Joining
        String text = "apple,banana,grape";
        String[] fruits = text.split(",");
        for(String f : fruits){ System.out.println(f); }
        // apple, banana, grape
        String joined = String.join("-", "one", "two", "three");
        System.out.println(joined); // "one-two-three"

        // Value Conversion
        int num = 100;
        String strNum = String.valueOf(num);
        System.out.println(strNum); // "100"
        char[] ch = {'J','a','v','a'};
        String s3 = new String(ch);
        System.out.println(s3); // "Java"

        // Format & Repeat
        String fmt = String.format("My name is %s and I am %d", "Dhruv", 20);
        System.out.println(fmt);
        String repeat = "Hi! ".repeat(3);
        System.out.println(repeat); // "Hi! Hi! Hi! "

        // Matches & Regex
        String regexStr = "abc123";
        System.out.println(regexStr.matches("[a-z]+[0-9]+")); // true
        System.out.println("hello world".replaceAll("o","*")); // hell* w*rld
        System.out.println("1a2b3c".replaceFirst("[0-9]","X")); // Xa2b3c

        // Interning
        String s4 = new String("Java");
        String s5 = s4.intern();
        System.out.println(s4 == s5);          // false
        System.out.println("Java" == s5);      // true

        // Extra (Java 11+)
        System.out.println("".isBlank());             // true
        System.out.println("  hi  ".strip());         // "hi"
        System.out.println("hi\nthere".lines().count()); // 2
    }
}
