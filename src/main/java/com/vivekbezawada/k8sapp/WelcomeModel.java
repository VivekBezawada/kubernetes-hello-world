package com.vivekbezawada.k8sapp;

public class WelcomeModel {
    private final String name;

    public WelcomeModel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
