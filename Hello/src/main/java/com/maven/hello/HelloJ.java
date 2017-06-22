package com.maven.hello;

import org.apache.log4j.Logger;

public class HelloJ {
    static Logger logger = Logger.getLogger(HelloJ.class);
    public static void main(String[] args) {
        logger.info("Hello, Java");
        try {
            System.out.println(1/0);;
        } catch (Exception e) {
            logger.error("error calculation", e);
        }
    }
}
