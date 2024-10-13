package behaviouralpatterns.chainofresponsiblity;

import java.util.Map;

public class HTTPRequest {
    private Map<String,String> header;
    private byte[] body;

    public HTTPRequest(Map<String, String> header, byte[] body) {
        this.header = header;
        this.body = body;
    }

    public Map<String, String> getHeader() {
        return header;
    }

    public void setHeader(Map<String, String> header) {
        this.header = header;
    }

    public byte[] getBody() {
        return body;
    }

    public void setBody(byte[] body) {
        this.body = body;
    }

    public void closeConnection(){
        System.out.println("Closing HTTP connection");
    }
}
