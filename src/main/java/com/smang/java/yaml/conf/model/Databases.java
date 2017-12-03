package com.smang.java.yaml.conf.model;

public class Databases {
    private MySQL mysql;
    private Postgres postgres;

    public MySQL getMysql() {
        return mysql;
    }

    public void setMysql(MySQL mysql) {
        this.mysql = mysql;
    }

    public Postgres getPostgres() {
        return postgres;
    }

    public void setPostgres(Postgres postgres) {
        this.postgres = postgres;
    }

    public String toString(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%smysql:\n", indent));
        sb.append(String.format("%s",mysql.toString(indent+indent)));
        sb.append(String.format("%spostgres:\n", indent));
        sb.append(String.format("%s",postgres.toString(indent+indent)));
        return sb.toString();
    }

}
