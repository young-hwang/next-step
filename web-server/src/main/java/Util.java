public class Util {
    public static String getUrl(String line) {
        String[] split = line.split(" ");
        return split[1];
    }
}
