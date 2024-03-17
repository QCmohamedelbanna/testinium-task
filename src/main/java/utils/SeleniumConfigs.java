package utils;



public class SeleniumConfigs{
    private static final String BASE_URL;

    static {
        BASE_URL = "https://en.wikipedia.org/wiki/Main_Page";

    }
    public static String getValue() {
        return BASE_URL;
    }
}
