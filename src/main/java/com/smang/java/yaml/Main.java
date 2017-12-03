package com.smang.java.yaml;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.smang.java.yaml.conf.Config;

import java.io.File;

public class Main {

    public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper(new YAMLFactory());
        try {

            Config config = mapper.readValue(new File("E:\\Work\\intellijWorkspace\\yaml-conf-parser\\src\\main\\resources\\test-conf.yaml"), Config.class);
            System.out.println(config.toString("    "));
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
