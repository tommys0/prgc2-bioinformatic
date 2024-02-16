import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] geny = {"AAACGGTT", "AAACGGTA", "ATACGGTA", "AACCGGTT", "ACCGTTAC"};

        Random random = new Random();
        int startIndex;
        int endIndex;

        do {
            startIndex = random.nextInt(geny.length);
            endIndex = random.nextInt(geny.length);
        } while (startIndex == endIndex);

        String start = geny[startIndex];
        String end = geny[endIndex];

        int minChanges = getMinChanges(start, end);
        System.out.println("Start GEN: " + start);
        System.out.println("End GEN: " + end);
        System.out.println("Minimum changes needed: " + minChanges);

        transformAndPrint(start, end);
    }

    public static int getMinChanges(String start, String end) {
        if (start.length() != end.length()) {
            throw new IllegalArgumentException("Strings must be of equal length");
        }

        int changes = 0;
        for (int i = 0; i < start.length(); i++) {
            if (start.charAt(i) != end.charAt(i)) {
                changes++;
            }
        }
        return changes;
    }
}
