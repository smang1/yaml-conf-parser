package com.smang.java.yaml.conf.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Codes {
    private HashMap<String, String> currency;
    private ArrayList<String> validCurrencies;

    public HashMap<String, String> getCurrency() {
        return currency;
    }

    public void setCurrency(HashMap<String, String> currency) {
        this.currency = currency;
    }

    public ArrayList<String> getValidCurrencies() {
        return validCurrencies;
    }

    public void setValidCurrencies(ArrayList<String> validCurrencies) {
        this.validCurrencies = validCurrencies;
    }

    public String toString(String indent) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("%scurrency:\n", indent));
        for(Map.Entry<String, String> o: currency.entrySet()) {
            sb.append(String.format("%s%s: %s\n", indent+indent, o.getKey(), o.getValue()));
        }
        sb.append(String.format("%svalidCurrencies: %s\n", indent, validCurrencies.toString()));
        return sb.toString();
    }
}
