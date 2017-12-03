package com.smang.java.yaml.conf;

import com.smang.java.yaml.conf.model.Codes;
import com.smang.java.yaml.conf.model.Databases;

public class Config {
    private Databases databases;
    private Codes codes;

    public Databases getDatabases() {
        return databases;
    }

    public void setDatabases(Databases databases) {
        this.databases = databases;
    }

    public Codes getCodes() {
        return codes;
    }

    public void setCodes(Codes codes) {
        this.codes = codes;
    }

    public String toString(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("databases:\n"));
        sb.append(databases.toString(indent));
        sb.append(String.format("codes:\n"));
        sb.append(codes.toString(indent));
        return sb.toString();
    }

}
