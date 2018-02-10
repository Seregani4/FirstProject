package Lessons.Lessons18;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        String.join(":", "foobar", "foo", "bar");

        "foobar:foo:bar"
                .chars()
                .distinct()
                .mapToObj(c-> String.valueOf((char)c))
                .sorted()
                .collect(Collectors.joining());

    }


}
