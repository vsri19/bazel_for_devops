package com.demo;

import org.apache.commons.lang3.StringUtils;

public class BazelApp {

    public static void main(String ... args) {
        Greetings greetings = new Greetings();

        System.out.println(greetings.greet("Bazel"));

        System.out.println(StringUtils.lowerCase("Greetings from Varsha."));
    }
}
