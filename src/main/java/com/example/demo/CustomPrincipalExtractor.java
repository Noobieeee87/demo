package com.example.demo;

import org.springframework.boot.autoconfigure.security.oauth2.resource.PrincipalExtractor;

import java.util.Map;

public class CustomPrincipalExtractor implements PrincipalExtractor {
    @Override
    public Object extractPrincipal(Map<String, Object> map) {
        for (String itr : map.keySet()){
            System.out.println(itr+" --- "+ map.get(itr));
        }
        return map;
    }

}
