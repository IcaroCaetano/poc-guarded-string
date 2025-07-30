package com.myproject.poc_guarded_string.component;

import org.identityconnectors.common.security.GuardedString;

public class GuardedStringPOC {
    public static void main(String[] args) {
        GuardedString gs = new GuardedString("senhaSuperSecreta".toCharArray());
        gs.access(chars -> {
            System.out.println("Senha revelada temporariamente: " + String.valueOf(chars));
        });
        gs.dispose();
        System.out.println("GuardedString foi liberada da memória.");
    }
}