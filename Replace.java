public class Replace {

    public String ecalpeResrever(String haystack, String needle, String replacement) {
        // Note: reverses a string can also be done in StringUtils.reverse/reverseDelimited
        haystack = haystack.replace(needle, replacement);
        StringBuilder sb = new StringBuilder(haystack.length() + 1);
        String[] words = haystack.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]).append(' ');
        }
        sb.setLength(sb.length() - 1); // Strip trailing space
        return sb.toString();
    }
}
