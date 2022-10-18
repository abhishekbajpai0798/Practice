import java.util.*;
public class temp {

    public static void main (String[] args) {
        int[][] envelopes = {{5, 4}, {6, 4}, {6, 7}};
        Arrays.sort(envelopes, (a, b) -> a[0] == b[0] ? b[1] - a[1] : a[0] - b[0]);

    }
}