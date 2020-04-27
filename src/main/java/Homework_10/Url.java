package Homework_10;

public class Url {
    private static String url = "protocol://domain:port/path/to/some/resource?param&param1-value1&param2-value";

    public static String withProtocol(String protocol) {
        return protocol;
    }

    public static String withDomain(String domain) {
        return domain;
    }

    public static String withPort(String port) {
        return port;
    }

    public static String withPath(String path) {
        return path;
    }

    public static String withParam(String param) {
        return param;
    }

    static String withParamKey(String key) {
        return key;
    }

    static String withParamValue(String value) {
        return value;
    }

    public Url() {
    }

    public static String build(String protocol, String domain, String port, String path, String param, String key, String value) {
        return url;
    }
}
