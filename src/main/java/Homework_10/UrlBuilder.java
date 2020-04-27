package Homework_10;

public class UrlBuilder {
    public static void main(String[] args) {
        Url protocol = new Url();
        Url url = new Url();
        Url domain = new Url();
        Url port = new Url();
        Url path = new Url();
        Url param = new Url();
        Url key = new Url();
        Url value = new Url();
        protocol.withProtocol("protocol");
        domain.withDomain("domain");
        port.withPort("port");
        path.withPath("path");
        param.withParam("param");
        key.withParam("keyValue1");
        value.withParam("keyValue2");
        url.build("protocol", "domain", "port", "path", "param", "key", "value");
        System.out.println(url);
        System.out.println("protocol://domain:port/path/to/some/resource?param&param1-value1&param2-value");
    }
}

