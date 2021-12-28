import java.util.stream.Stream;

public class Strings {
    public static void main(String[] args) {
        String s = " JAVA 11 \u2001";
        System.out.println("**" + s + "**");

        String repeat = s.trim().repeat(2);
        System.out.println("REPEAT: " + repeat);

        String s1 = s + "\n LINES \n.";
        Stream<String> lines = s1.lines();
        System.out.println("LINES: " + lines.count());

        boolean isBlank = s.isBlank();
        System.out.println("isBlank: " + isBlank);

        String stripLeading = s.stripLeading();
        System.out.println("STRIP LEADING: **" + stripLeading + "**");

        String stripTrailing = s.stripTrailing();
        System.out.println("STRIP TRAILING: **" + stripTrailing + "**");

        String trim = s.trim();
        System.out.println("TRIM: **" + trim + "**");

        String strip = s.strip();
        System.out.println("STRIP: **" + strip + "**");
    }
}