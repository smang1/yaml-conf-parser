package com.smang.java.yaml.conf.model;

public class MySQL {
    private String host;
    private String port;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String toString(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%shost: %s\n", indent, host));
        sb.append(String.format("%sport: %s\n", indent, port));
        return sb.toString();
    }
}
